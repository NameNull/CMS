package cn.yjava.web.action.admin;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.yjava.core.action.BaseAction;

/**
 * 
 * @title IndexAction 
 * @description  后台首页处理类
 * @author 俞杰
 * @time 2015年8月24日-上午9:26:26
 * @version 1.0.0
 * @since JDK1.7
 */
@Controller
@Scope("prototype")
public class LinksAction extends BaseAction{
	/**
	 * 
	 * @description 友情链接栏页
	 * @方法名 index
	 * @return String
	 * @exception
	 */
	public String list(){
		return SUCCESS;
	}
}
