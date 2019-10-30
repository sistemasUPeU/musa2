package com.musa2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.musa2.dao.PropietariosDao;
import com.musa2.entity.Propietarios;
import com.musa2.service.PropietariosService;

public class PropietariosServiceImp implements PropietariosService{

	@Autowired
	private  PropietariosDao propietariosDao;
	@Override
	public int create(Propietarios pr) {
		// TODO Auto-generated method stub
		return propietariosDao.create(pr);
	}

	@Override
	public int udpdate(Propietarios pr) {
		// TODO Auto-generated method stub
		return propietariosDao.update(pr);
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return propietariosDao.delete(key);
	}

	@Override
	public Propietarios read(int key) {
		// TODO Auto-generated method stub
		return propietariosDao.read(key);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return propietariosDao.readAll();
	}

}
