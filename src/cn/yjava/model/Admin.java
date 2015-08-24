package cn.yjava.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @title Admin 
 * @description 管理员实体类 
 * @author 俞杰
 * @time 2015年8月24日-上午2:56:38
 * @version 1.0.0
 * @since JDK1.7
 */
@SuppressWarnings("serial")
@Entity
@Table(name="admin")
public class Admin implements Serializable{
	private Integer id;//主键
	private String username;//昵称
	private String account;//账号
	private String password;//密码
	private Date createTime;//生成时间
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//setter getter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="username",length=50)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="account",length=50)
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Column(name="password",length=50)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="create_time",columnDefinition = "timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP")
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
