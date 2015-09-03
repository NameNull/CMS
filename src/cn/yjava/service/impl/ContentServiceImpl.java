package cn.yjava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yjava.core.service.impl.BaseServiceImpl;
import cn.yjava.dao.IContentDao;
import cn.yjava.model.Content;
import cn.yjava.service.IContentService;

/**
 * 
 * @title ContentDaoImpl 
 * @description 内容业务逻辑实现类 
 * @author 俞杰
 * @time 2015年09月03日 10:21:53
 * @version 1.0.0
 * @since JDK1.7
 */
@Service
public class ContentServiceImpl extends BaseServiceImpl<Content,Integer> implements IContentService{
	
	public IContentDao getContentDao() {
		return (IContentDao) super.getBaseDao();
	}
	
	@Autowired
	public void setContentDao(IContentDao contentDao) {
		super.setBaseDao(contentDao);
	}
	
	
}
