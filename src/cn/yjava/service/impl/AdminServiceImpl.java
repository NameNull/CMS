package cn.yjava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yjava.core.service.impl.BaseServiceImpl;
import cn.yjava.dao.IAdminDao;
import cn.yjava.model.Admin;
import cn.yjava.service.IAdminService;

/**
 * 
 * @title AdminDaoImpl 
 * @description 管理员业务逻辑实现类 
 * @author 俞杰
 * @time 2015年8月24日-上午3:04:32
 * @version 1.0.0
 * @since JDK1.7
 */
@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin,Integer> implements IAdminService{
	
	public IAdminDao getAdminDao() {
		return (IAdminDao) super.getBaseDao();
	}
	
	@Autowired
	public void setAdminDao(IAdminDao adminDao) {
		super.setBaseDao(adminDao);
	}
	
	/**
	 * 根据账号密码查询管理员
	 */
	@Override
	public Admin get(String account, String password) {
		return getAdminDao().get(account, password);
	}
}
