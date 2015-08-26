package cn.yjava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class AdminServiceImpl implements IAdminService{
	@Autowired
	private IAdminDao adminDao;
	@Override
	public Admin get(String account, String password) {
		return adminDao.get(account, password);
	}
}
