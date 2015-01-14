package com.yondu.foo.cms.service;

import com.yondu.foo.cms.domains.RoleTb;

public interface RoleService {

	void save(RoleTb role);
	void update(RoleTb role);
	void delete(RoleTb role);
	RoleTb findById(String id);
	
}
