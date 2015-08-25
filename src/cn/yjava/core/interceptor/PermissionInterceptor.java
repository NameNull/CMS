package cn.yjava.core.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.yjava.core.action.BaseAction;
import cn.yjava.util.StringUtils;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * 
 * @title PermissionInterceptor 
 * @description 权限拦截 
 * @author 俞杰
 * @time 2015年8月25日-下午11:20:57
 * @version 1.0.0
 * @since JDK1.7
 */
public class PermissionInterceptor extends AbstractInterceptor{

	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation invacation) throws Exception  {
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpServletResponse response=ServletActionContext.getResponse();
		@SuppressWarnings("unchecked")
		List<Object[]> permissions = (List<Object[]>) request.getSession().getAttribute("adminPermission");
		String requestType=request.getHeader("X-Requested-With");
		String url = request.getRequestURI();
		if(StringUtils.isNotEmpty(requestType)&&requestType.equals("XMLHttpRequest")){
			if(isPersmission(url,permissions)){
				return invacation.invoke();
			}else{
				BaseAction action=(BaseAction)invacation.getAction();
				action.setResult("noPermission");
				return "ajaxSuccess";
			}
		}else{
			if(isPersmission(url,permissions)){
				return invacation.invoke();
			}else{
				request.getRequestDispatcher("/WEB-INF/pages/admin/noPermission.jsp").forward(request, response);;
				return null;
			}
		}
	}
	private boolean isPersmission(String url,List<Object[]> objects){
		if((objects==null) || objects.size()==0)return false;
		boolean flag = false;
		for (Object[] object : objects) {
			String linkUrl = String.valueOf(object[1]);// /index
			if(url.indexOf(linkUrl)!=-1){
				flag= true;
				break;
			}
		}
		return flag;
	}
}
