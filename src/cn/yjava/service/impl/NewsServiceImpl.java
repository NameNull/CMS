package cn.yjava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yjava.core.service.impl.BaseServiceImpl;
import cn.yjava.dao.INewsDao;
import cn.yjava.model.News;
import cn.yjava.service.INewsService;

/**
 * 
 * @title NewsDaoImpl 
 * @description 新闻业务逻辑实现类 
 * @author 俞杰
 * @time 2015年09月03日 10:35:00
 * @version 1.0.0
 * @since JDK1.7
 */
@Service
public class NewsServiceImpl extends BaseServiceImpl<News,Integer> implements INewsService{
	
	public INewsDao getNewsDao() {
		return (INewsDao) super.getBaseDao();
	}
	
	@Autowired
	public void setNewsDao(INewsDao newsDao) {
		super.setBaseDao(newsDao);
	}
	
	
}
