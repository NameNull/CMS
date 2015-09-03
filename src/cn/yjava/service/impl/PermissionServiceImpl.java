package cn.yjava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yjava.core.service.impl.BaseServiceImpl;
import cn.yjava.dao.IPermissionDao;
import cn.yjava.model.Permission;
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
public class PermissionServiceImpl extends BaseServiceImpl<Permission,Integer> implements IPermissionService{
	
	public IPermissionDao getPermissionDao() {
		return (IPermissionDao) super.getBaseDao();
	}
	
	@Autowired
	public void setPermissionDao(IPermissionDao permissionDao) {
		super.setBaseDao(permissionDao);
	}
	
	/**
	 * 根据管理员id查询相关权限
	 */
	@Override
	public List<Object[]> find(Integer adminId) {
		return getPermissionDao().find(adminId);
	}
}
