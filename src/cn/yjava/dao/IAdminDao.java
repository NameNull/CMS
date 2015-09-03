package cn.yjava.dao;

import cn.yjava.core.dao.IBaseDao;
import cn.yjava.model.Admin;

/**
 * 
 * @title IAdminDao 
 * @description 管理员业务逻辑层 
 * @author 俞杰
 * @time 2015年8月24日-上午2:54:38
 * @version 1.0.0
 * @since JDK1.7
 */
public interface IAdminDao extends IBaseDao<Admin, Integer>{
	/**
	 * 
	 * @description 根据用户名密码查询管理员
	 * @方法名 get
	 * @param account
	 * @param password
	 * @return Admin
	 * @exception
	 */
	public Admin get(String account,String password);
}
