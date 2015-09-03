package cn.yjava.core.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import cn.yjava.core.dao.IBaseDao;
import cn.yjava.core.dao.util.TmReflectionUtils;
import cn.yjava.model.PageInfo;

/**
 * 
 * @title BaseDaoImpl 
 * @description 公用dao实现类 
 * @author 俞杰
 * @time 2015年9月3日-上午7:35:14
 * @version 1.0.0
 * @since JDK1.7
 */
@Transactional
public class BaseDaoImpl<T,PK extends Serializable> implements IBaseDao<T, PK>{

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Class<T> entityClass;
	
	/**
	 * 无参构造函数获取注入的实体
	 */
	public BaseDaoImpl() {
		this.entityClass = TmReflectionUtils.getSuperClassGenricType(getClass());
	}

	public Class<T> getEntityClass() {
		return entityClass;
	}

	/**
	 * 
	 * @description 获取连接对象
	 * @方法名 getSession
	 * @return Session
	 * @exception
	 */
	public Session getSession() {
		if (sessionFactory != null) {
			return sessionFactory.getCurrentSession();
		}
		return null;
	}
	
	/**
	 * 增
	 */
	@Override
	public T save(T t){
		try {
			getSession().save(t);
			return t;
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * 删
	 */
	@Override
	public T deleteById(PK id) {
		Assert.notNull(id, "id不能为空");
		T entity = load(id);
		getSession().delete(entity);
		return entity;
	}
	
	/**
	 * 查
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T get(PK id) {
		Assert.notNull(id, "id不能为空");
		return (T) getSession().get(getEntityClass(), id);
	}
	
	/**
	 * 改
	 */
	@Override
	public T update(T entity) {
		getSession().update(entity);
		return entity;
	}
	
	/**
	 * 
	 * @description load
	 * @方法名 load1
	 * @param id
	 * @return T
	 * @exception
	 */
	public T load(PK id) {
		Assert.notNull(id, "id不能为空");
		return load(id, false);
	}
	
	/**
	 * 
	 * @description 
	 * @方法名 load2
	 * @param id
	 * @param lock
	 * @return T
	 * @exception
	 */
	@SuppressWarnings({ "unchecked", "deprecation" })
	public T load(PK id, boolean lock) {
		Assert.notNull(id, "id不能为空");
		T entity = null;
		if (lock) {
			entity = (T) getSession().load(getEntityClass(), id,
					LockMode.UPGRADE);
		} else {
			entity = (T) getSession().load(getEntityClass(), id);
		}
		return entity;
	}
	
	/**
	 * 
	 * @description 获取当前离线查询对象
	 * @方法名 getCurrentDetachedCriteria
	 * @return DetachedCriteria
	 * @exception
	 */
	public DetachedCriteria getCurrentDetachedCriteria() {
		return DetachedCriteria.forClass(getEntityClass());
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByDetachedCriteria(final DetachedCriteria detachedCriteria,final PageInfo pageInfo){
		return detachedCriteria.getExecutableCriteria(getSession())
				.setFirstResult(Integer.parseInt(pageInfo.getFirstResult()))
				.setMaxResults(Integer.parseInt(pageInfo.getMaxResults()))
				.list();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> findByDetachedCriteria(final DetachedCriteria detachedCriteria,Integer pageNo,Integer pageSize){
		return detachedCriteria.getExecutableCriteria(getSession())
				.setFirstResult(pageNo)
				.setMaxResults(pageSize)
				.list();
	}
}