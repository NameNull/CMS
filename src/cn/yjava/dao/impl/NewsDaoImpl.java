package cn.yjava.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import cn.yjava.core.dao.impl.BaseDaoImpl;
import cn.yjava.dao.INewsDao;
import cn.yjava.model.News;

/**
 * 
 * @title NewsDaoImpl 
 * @description 新闻业务逻辑实现类 
 * @author 俞杰
 * @time 2015年09月03日 10:35:00
 * @version 1.0.0
 * @since JDK1.7
 */
@Repository
@Transactional
public class NewsDaoImpl extends BaseDaoImpl<News,Integer> implements INewsDao{
	
}
