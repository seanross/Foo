package com.yondu.foo.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yondu.foo.cms.dao.RoleDao;
import com.yondu.foo.cms.domains.RoleTb;
import com.yondu.foo.cms.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleDao roleDao;
	
	@Override
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void save(RoleTb role) {
		roleDao.save(role);
	}

	@Override
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void update(RoleTb role) {
		roleDao.update(role);
	}

	@Override
	public void delete(RoleTb role) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional(readOnly=true)
	public RoleTb findById(String id) {
		return roleDao.findById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<RoleTb> getAll() {
		return roleDao.getAll();
	}

}
