package cn.yjava.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import cn.yjava.core.dao.impl.BaseDaoImpl;
import cn.yjava.dao.IContentDao;
import cn.yjava.model.Content;

/**
 * 
 * @title ContentDaoImpl 
 * @description 内容业务逻辑实现类 
 * @author 俞杰
 * @time 2015年09月03日 10:21:53
 * @version 1.0.0
 * @since JDK1.7
 */
@Repository
@Transactional
public class ContentDaoImpl extends BaseDaoImpl<Content,Integer> implements IContentDao{
	
}
