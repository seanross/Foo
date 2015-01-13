<<<<<<< HEAD
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
=======
package com.yondu.foo.cms.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.yondu.foo.generic.domains.BaseTb;


@Entity
@Table(name="role_tb")
public class RoleTb extends BaseTb {
	
	private Long id;
	private String description;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", unique=true, nullable=false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="description", nullable=false, unique=true)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
>>>>>>> branch 'robert-foo' of https://github.com/seanross/Foo.git
