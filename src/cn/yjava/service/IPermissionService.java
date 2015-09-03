package cn.yjava.service;

import java.util.List;

import cn.yjava.core.service.IBaseService;
import cn.yjava.model.Permission;

/**
 * 
 * @title PermissionDao 
 * @description 权限业务接口
 * @author 俞杰
 * @time 2015年8月25日-下午7:05:16
 * @version 1.0.0
 * @since JDK1.7
 */
public interface IPermissionService extends IBaseService<Permission,Integer>{
	/**
	 * 
	 * @description 根据管理员id查询相关权限
	 * @方法名 find
	 * @param adminId
	 * @return List<Object>
	 * @exception
	 */
	public List<Object[]> find(Integer adminId);
}
