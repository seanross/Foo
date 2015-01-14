package com.yondu.foo.cms.dao;

import java.util.List;

import com.yondu.foo.cms.domains.RoleTb;

public interface RoleDao {

	void save(RoleTb role);
	void update(RoleTb role);
	void delete(RoleTb role);
	RoleTb findById(String id);
	List<RoleTb> getAll();
	
}
