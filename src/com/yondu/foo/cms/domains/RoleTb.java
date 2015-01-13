package com.yondu.foo.cms.domains;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
public class RoleTb extends BaseEntity {
	
	private int roleId;
	private String role;
	
	
}
