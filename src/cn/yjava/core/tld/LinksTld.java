package cn.yjava.core.tld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * 
 * @title PermissionTld 
 * @description 栏目与链接匹配
 * @author 俞杰
 * @time 2015年8月26日-上午10:27:18
 * @version 1.0.0
 * @since JDK1.7
 */
@SuppressWarnings("serial")
public class LinksTld extends BodyTagSupport{
	private String url;
	private String link;
	/**
	 * <yj:links url=""/></yj:url>
	 */
	
	@Override
	public void doInitBody() throws JspException {
		HttpServletRequest request=(HttpServletRequest) this.pageContext.getRequest();
		link=request.getRequestURI();
	}
	
	@Override
	public int doAfterBody() throws JspException {
		String bodyContent=this.getBodyContent().getString();
		JspWriter out = this.getPreviousOut();
		try {
			if(link.indexOf(url)!=-1){
				out.print(bodyContent);
			}else{
				out.print("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	//setter
	public void setUrl(String url) {
		this.url = url;
	}
}
