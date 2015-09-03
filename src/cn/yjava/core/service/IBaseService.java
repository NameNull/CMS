package cn.yjava.core.service;

import java.io.Serializable;

/**
 * 
 * @title IBaseService 
 * @description  公用业务接口
 * @author 俞杰
 * @time 2015年9月3日-上午7:52:48
 * @version 1.0.0
 * @since JDK1.7
 */
public interface IBaseService<T,PK extends Serializable> {

	/**
	 * 
	 * @description 增
	 * @方法名 save
	 * @param t
	 * @return T
	 * @exception
	 */
	public T save(T t); 
	
	/**
	 * 
	 * @description 删
	 * @方法名 deleteById
	 * @param id
	 * @return T
	 * @exception
	 */
	public T deleteById(PK id); 
	
	/**
	 * 
	 * @description 查
	 * @方法名 get
	 * @param id
	 * @return T
	 * @exception
	 */
	public T get(PK id) ;
	
	/**
	 * 
	 * @description 改
	 * @方法名 update
	 * @param entity
	 * @return T
	 * @exception
	 */
	public T update(T entity);
}
