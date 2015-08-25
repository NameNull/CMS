package cn.yjava.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import cn.yjava.core.dao.BaseDao;
import cn.yjava.dao.IPermissionDao;
/**
 * 
 * @title PermissionDaoImpl 
 * @description  权限逻辑类
 * @author 俞杰
 * @time 2015年8月25日-下午7:09:33
 * @version 1.0.0
 * @since JDK1.7
 */
@Repository
@Transactional
public class PermissionDaoImpl extends BaseDao implements IPermissionDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> find(Integer adminId) {
		String sql="SELECT DISTINCT a.username,p.url FROM permission p "+
			" LEFT JOIN role_permission r_p ON p.id=r_p.permission_id "+
			" LEFT JOIN role r ON r_p.role_id=r.id"+
			" LEFT JOIN role_admin r_a ON r.id=r_a.role_id"+
			" LEFT JOIN admin a ON a.id=r_a.admin_id"+
			" WHERE a.id=?";
		return getSession().createSQLQuery(sql).setInteger(0, adminId).list();
	}

}
