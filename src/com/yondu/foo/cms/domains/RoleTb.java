package com.yondu.foo.cms.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class RoleTb extends BaseEntity {
	
	private int roleId;
	private String role;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="role_name")
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
