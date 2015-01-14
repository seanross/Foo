package com.yondu.foo.cms.dao;

import com.yondu.foo.cms.domains.RoleTb;

public interface RoleDao {

	void save(RoleTb role);
	void update(RoleTb role);
	void delete(RoleTb role);
	RoleTb findById(String id);
	
}
