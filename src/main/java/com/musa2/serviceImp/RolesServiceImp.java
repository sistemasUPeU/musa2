package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.RolesDao;
import com.musa2.entity.Roles;
import com.musa2.service.RolesService;

@Service
public class RolesServiceImp implements RolesService{
	@Autowired
	private RolesDao rolesDao;

	@Override
	public int create(Roles r) {
		// TODO Auto-generated method stub
		return rolesDao.create(r);
	}

	@Override
	public int update(Roles r) {
		// TODO Auto-generated method stub
		return rolesDao.update(r);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return rolesDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return rolesDao.read(id);
	}

	@Override
	public Map<String, Object> readN(String nombre) {
		// TODO Auto-generated method stub
		return rolesDao.readN(nombre);
	}

	@Override
	public Map<String, Object> readE(int estado) {
		// TODO Auto-generated method stub
		return rolesDao.readE(estado);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return rolesDao.readAll();
	}
}

