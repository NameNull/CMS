package cn.yjava.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cn.yjava.core.dao.impl.BaseDaoImpl;
import cn.yjava.core.dao.util.TmParams;
import cn.yjava.dao.INewsDao;
import cn.yjava.model.News;
import cn.yjava.model.PageInfo;
import cn.yjava.util.YjStringUtils;

/**
 * 
 * @title NewsDaoImpl 
 * @description 新闻业务逻辑实现类 
 * @author 俞杰
 * @time 2015年09月03日 16:11:56
 * @version 1.0.0
 * @since JDK1.7
 */
@Repository
@Transactional
public class NewsDaoImpl extends BaseDaoImpl<News,Integer> implements INewsDao{
	/**
	 * 查询新闻（参数,分页）
	 */
	@Override
	public List<News> findNews(TmParams params, PageInfo pageInfo) {
		DetachedCriteria detachedCriteria = getCurrentDetachedCriteria();
		if(params!=null){
			if(YjStringUtils.isNotEmpty(params.getKeyword())){
				detachedCriteria.add(Restrictions.like("title", params.getKeyword(),MatchMode.ANYWHERE));
			}
		}
		detachedCriteria.addOrder(Order.desc("createTime"));
		return findByDetachedCriteria(detachedCriteria,pageInfo);
	}

	/**
	 * 查询新闻条数（参数）
	 */
	@Override
	public int countNews(TmParams params) {
		DetachedCriteria detachedCriteria = getCurrentDetachedCriteria();
		if(params!=null){
			if(YjStringUtils.isNotEmpty(params.getKeyword())){
				detachedCriteria.add(Restrictions.like("title", params.getKeyword(),MatchMode.ANYWHERE));
			}
		}
		detachedCriteria.setProjection(Projections.count("id"));
		Number number = (Number)detachedCriteria.getExecutableCriteria(getSession()).uniqueResult();
		return number==null?0:number.intValue();
	}
	
}
