package cn.yjava.web.action.admin;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.yjava.core.action.BaseAction;

/**
 * 
 * @title TeachersAction 
 * @description 教师栏处理类 
 * @author 俞杰
 * @time 2015年8月25日-下午6:13:02
 * @version 1.0.0
 * @since JDK1.7
 */
@Controller
@Scope("prototype")
public class TeachersAction extends BaseAction{
	/**
	 * 
	 * @description 教师栏页
	 * @方法名 index
	 * @return String
	 * @exception
	 */
	public String list(){
		return SUCCESS;
	}
}
