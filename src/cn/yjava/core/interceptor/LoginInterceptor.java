package cn.yjava.core.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.yjava.core.action.BaseAction;
import cn.yjava.model.Admin;
import cn.yjava.util.StringUtils;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * 
 * @title LoginInterceptor 
 * @description 登录拦截 
 * @author 俞杰
 * @time 2015年8月8日-下午7:24:56
 * @version 1.0.0
 * @since JDK1.7
 */
public class LoginInterceptor extends AbstractInterceptor{

	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation invacation) throws Exception {
		Admin admin=(Admin) ServletActionContext.getRequest().getSession().getAttribute("adminSession");
		HttpServletRequest request=ServletActionContext.getRequest();
		String requestType=request.getHeader("X-Requested-With");
		if(admin==null){
			if(StringUtils.isNotEmpty(requestType)&&requestType.equals("XMLHttpRequest")){
				BaseAction action=(BaseAction)invacation.getAction();
				action.setResult("loginout");
				return "ajaxSuccess";
			}
			return "exit";
		}
		return invacation.invoke();
	}

}
