package com.yondu.foo.cms.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yondu.foo.cms.dao.RoleDao;
import com.yondu.foo.cms.domains.RoleTb;

@Repository("roleDao")
public class RoleDaoImpl implements RoleDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(RoleTb role) {
		sessionFactory.getCurrentSession().save(role);
	}

	@Override
	public void update(RoleTb role) {
		sessionFactory.getCurrentSession().update(role);
	}

	@Override
	public void delete(RoleTb role) {
		// TODO Auto-generated method stub

	}

	@Override
	public RoleTb findById(String id) {
		return (RoleTb) sessionFactory.getCurrentSession().get(RoleTb.class, id);
	}

}
