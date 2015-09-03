package cn.yjava.service;

import cn.yjava.core.service.IBaseService;
import cn.yjava.model.Admin;

/**
 * 
 * @title IAdminDao 
 * @description 管理员业务层
 * @author 俞杰
 * @time 2015年8月24日-上午2:54:38
 * @version 1.0.0
 * @since JDK1.7
 */
public interface IAdminService extends IBaseService<Admin, Integer>{
	/**
	 * 
	 * @description 根据账号密码查询管理员
	 * @方法名 get
	 * @param account
	 * @param password
	 * @return Admin
	 * @exception
	 */
	public Admin get(String account,String password);
}
