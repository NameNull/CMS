package cn.yjava.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.yjava.core.dao.impl.BaseDaoImpl;
import cn.yjava.dao.IAdminDao;
import cn.yjava.model.Admin;

/**
 * 
 * @title AdminDaoImpl 
 * @description 管理员业务逻辑实现类 
 * @author 俞杰
 * @time 2015年8月24日-上午3:04:32
 * @version 1.0.0
 * @since JDK1.7
 */
@Repository
@Transactional
public class AdminDaoImpl extends BaseDaoImpl<Admin,Integer> implements IAdminDao{
	/**
	 * 根据用户名密码查询管理员
	 */
	@Override
	public Admin get(String account, String password) {
		String hql = "from Admin where account = ? and password = ?";
		Query query = getSession().createQuery(hql);
		query.setString(0, account);
		query.setString(1, password);
		Admin admin = (Admin) query.uniqueResult();
		return admin;
	}
	
}
