package cn.yjava.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @title Role 
 * @description  后台角色实体类
 * @author 俞杰
 * @time 2015年8月25日-上午4:58:09
 * @version 1.0.0
 * @since JDK1.7
 */
@SuppressWarnings("serial")
@Entity
@Table(name="role")
public class Role implements Serializable{
	private Integer id;//主键
	private String name;//角色名
	private String description;//描述
	private Date createTime;//创建时间
	private List<Permission> permissions=new ArrayList<Permission>(0);
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="name",length=50)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="description",length=1000)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="create_time",columnDefinition="timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP")
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@ManyToMany
	@JoinTable(
		name="role_permission",
		joinColumns=@JoinColumn(name="role_id",referencedColumnName="id"),
		inverseJoinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "id")
	)
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
}
