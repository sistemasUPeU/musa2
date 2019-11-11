package com.musa2.serviceImp;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.PropietariosDao;
import com.musa2.entity.Propietarios;
import com.musa2.service.PropietariosService;
@Service
public class PropietariosServiceImp implements PropietariosService{
     @Autowired
     private PropietariosDao propietariosDao;
	@Override
	public Map<String, Object> create(Propietarios p) {
		// TODO Auto-generated method stub
		return propietariosDao.create(p);
	}

	@Override
	public Map<String, Object> update(Propietarios p) {
		// TODO Auto-generated method stub
		return propietariosDao.update(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return propietariosDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return propietariosDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return propietariosDao.readAll();
	}

	@Override
	public Map<String, Object> readnom() {
		// TODO Auto-generated method stub
		return propietariosDao.readnom();
	}

}
