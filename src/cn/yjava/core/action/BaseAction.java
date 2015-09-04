package cn.yjava.core.action;

import cn.yjava.core.dao.util.TmParams;
import cn.yjava.model.PageInfo;


/**
 * 
 * @title BaseAction 
 * @description 基础action 
 * @author 俞杰
 * @time 2015年8月23日-下午6:31:03
 * @version 1.0.0
 * @since JDK1.7
 */
public class BaseAction {
	public static final String AJAX_SUCCESS = "ajaxSuccess";
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";
	public static final String LOGIN="login";
	public static final String INDEX="index";
	public static final String EXIT="exit";
	protected String result;
	//分页
	protected PageInfo pageInfo =  new PageInfo();
	//参数
	protected TmParams params = new TmParams();
	//主键
	protected Integer id;
	//setter getter
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResult() {
		return result;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public TmParams getParams() {
		return params;
	}

	public void setParams(TmParams params) {
		this.params = params;
	}
	
}
