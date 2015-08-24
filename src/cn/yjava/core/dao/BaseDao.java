package cn.yjava.core.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @title BaseDao 
 * @description 获取sessionFactory 
 * @author 俞杰
 * @time 2015年8月24日-上午3:09:38
 * @version 1.0.0
 * @since JDK1.7
 */
public class BaseDao {
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * 
	 * @description 返回session缓存
	 * @方法名 getSession
	 * @return Session
	 * @exception
	 */
	protected Session getSession(){
		if (sessionFactory != null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}
}
