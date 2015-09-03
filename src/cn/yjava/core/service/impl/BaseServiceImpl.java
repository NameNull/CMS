package cn.yjava.core.service.impl;

import java.io.Serializable;

import cn.yjava.core.dao.IBaseDao;
import cn.yjava.core.service.IBaseService;


/**
 * Service 基类
 * 
 */
public class BaseServiceImpl<T,PK extends Serializable> implements IBaseService<T,PK> {

	private IBaseDao<T,PK> baseDao ;

	public IBaseDao<T,PK> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(IBaseDao<T,PK> baseDao) {
		this.baseDao = baseDao;
	}
	
	/**
	 * 增
	 */
	@Override
	public T save(T t) {
		return baseDao.save(t);
	}
	
	/**
	 * 删
	 */
	@Override
	public T deleteById(PK id) {
		return baseDao.deleteById(id);
	}
	
	/**
	 * 查
	 */
	@Override
	public T get(PK id) {
		return baseDao.get(id);
	}
	
	/**
	 * 改
	 */
	@Override
	public T update(T entity){
		return baseDao.update(entity);
	}
}
