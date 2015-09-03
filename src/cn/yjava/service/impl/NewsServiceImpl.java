package cn.yjava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yjava.core.dao.util.TmParams;
import cn.yjava.core.service.impl.BaseServiceImpl;
import cn.yjava.dao.INewsDao;
import cn.yjava.model.News;
import cn.yjava.model.PageInfo;
import cn.yjava.service.INewsService;

/**
 * 
 * @title NewsDaoImpl 
 * @description 新闻业务逻辑实现类 
 * @author 俞杰
 * @time 2015年09月03日 16:11:56
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

	/**
	 * 查询新闻
	 */
	@Override
	public List<News> findNews(TmParams params, PageInfo pageInfo) {
		return getNewsDao().findNews(params, pageInfo);
	}

	/**
	 * 查询新闻条数
	 */
	@Override
	public int countNews(TmParams params) {
		return getNewsDao().countNews(params);
	}
	
	
}
