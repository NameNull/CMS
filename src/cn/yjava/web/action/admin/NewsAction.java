package cn.yjava.web.action.admin;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.yjava.core.action.BaseAction;

/**
 * 
 * @title NewsAction 
 * @description  新闻处理类
 * @author 俞杰
 * @time 2015年09月03日 10:35:00
 * @version 1.0.0
 * @since JDK1.7
 */
@Controller
@Scope("prototype")
public class NewsAction extends BaseAction{
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
