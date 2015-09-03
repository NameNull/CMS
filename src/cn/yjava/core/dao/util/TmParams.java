package cn.yjava.core.dao.util;
/**
 * 
 * @title TmParams 
 * @description 新闻参数 
 * @author 俞杰
 * @time 2015年9月3日-下午5:29:07
 * @version 1.0.0
 * @since JDK1.7
 */
public class TmParams {
	private String keyword;//关键词
	private String date;//时间
	private Integer uid;//唯一id
	//setter getter
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

}
