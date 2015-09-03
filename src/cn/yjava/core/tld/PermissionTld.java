package cn.yjava.core.tld;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

import cn.yjava.util.YjConstant;

/**
 * 
 * @title PermissionTld 
 * @description 权限标签 
 * @author 俞杰
 * @time 2015年8月26日-上午10:27:18
 * @version 1.0.0
 * @since JDK1.7
 */
@SuppressWarnings("serial")
public class PermissionTld extends BodyTagSupport{
	private String url;
	private List<Object[]> permissions;
	@SuppressWarnings("unchecked")
	@Override
	public void doInitBody() throws JspException {
		//如果body循环执行 最好把初始化一次的都放这儿
		permissions=(List<Object[]>) this.pageContext.getSession().getAttribute(YjConstant.SESSION_PERMISSION);
	}
	@Override
	public int doAfterBody() throws JspException {
		String bodyContent = this.getBodyContent().getString();
		if(bodyContent!=null){
			try {
				JspWriter out = this.getPreviousOut();
				if(isPersmission(url,permissions)){
					out.print(bodyContent);
				}else{
					out.print("");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return SKIP_BODY;
	}
	/**
	 * 
	 * @description 是否存在权限
	 * @方法名 isPersmission
	 * @param url
	 * @param objects
	 * @return boolean
	 * @exception
	 */
	private boolean isPersmission(String url,List<Object[]> objects){
		if((objects==null) || objects.size()==0)return false;
		boolean flag = false;
		for (Object[] object : objects) {
			String linkUrl = String.valueOf(object[1]);
			if(url.equals(linkUrl)){
				flag= true;
				break;
			}
		}
		return flag;
	}
	//setter
	public void setUrl(String url) {
		this.url = url;
	}
}
