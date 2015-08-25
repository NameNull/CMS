package cn.yjava.dao;

import java.util.List;

/**
 * 
 * @title PermissionDao 
 * @description 权限逻辑接口
 * @author 俞杰
 * @time 2015年8月25日-下午7:05:16
 * @version 1.0.0
 * @since JDK1.7
 */
public interface IPermissionDao {
	/**
	 * 
	 * @description 查询权限
	 * @方法名 find
	 * @param adminId
	 * @return List<Object>
	 * @exception
	 */
	public List<Object[]> find(Integer adminId);
}
