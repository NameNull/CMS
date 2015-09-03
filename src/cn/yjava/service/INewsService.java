package cn.yjava.service;

import java.util.List;

import cn.yjava.core.dao.util.TmParams;
import cn.yjava.core.service.IBaseService;
import cn.yjava.model.News;
import cn.yjava.model.PageInfo;

/**
 * 
 * @title INewsDao 
 * @description 新闻业务层
 * @author 俞杰
 * @time 2015年09月03日 16:11:56
 * @version 1.0.0
 * @since JDK1.7
 */
public interface INewsService extends IBaseService<News, Integer>{
	
	/**
	 * 
	 * @description 查询所有的新闻
	 * @方法名 findNews
	 * @param params
	 * @param pageInfo
	 * @return List<News>
	 * @exception
	 */
	public List<News> findNews(TmParams params,PageInfo pageInfo);
	
	/**
	 * 
	 * @description 查询新闻条数 
	 * @方法名 countNews
	 * @param params
	 * @return int
	 * @exception
	 */
	public int countNews(TmParams params);
}
