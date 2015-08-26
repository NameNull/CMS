package cn.yjava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yjava.core.dao.BaseDao;
import cn.yjava.dao.IPermissionDao;
import cn.yjava.service.IPermissionService;
/**
 * 
 * @title PermissionDaoImpl 
 * @description  权限业务类
 * @author 俞杰
 * @time 2015年8月25日-下午7:09:33
 * @version 1.0.0
 * @since JDK1.7
 */
@Service
public class PermissionServiceImpl extends BaseDao implements IPermissionService{
	@Autowired
	private IPermissionDao permissionDao;
	@Override
	public List<Object[]> find(Integer adminId) {
		return permissionDao.find(adminId);
	}
}
