package cn.yjava.web.action.admin;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.yjava.core.action.BaseAction;

/**
 * 
 * @title ContentAction 
 * @description  内容处理类
 * @author 俞杰
 * @time 2015年09月03日 10:21:53
 * @version 1.0.0
 * @since JDK1.7
 */
@Controller
@Scope("prototype")
public class ContentAction extends BaseAction{
	/**
	 * 
	 * @description 进入页面
	 * @方法名 list
	 * @return String
	 * @exception
	 */
	public String list(){
		return SUCCESS;
	}
}
