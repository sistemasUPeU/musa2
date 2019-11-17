package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.PersonasDao;
import com.musa2.entity.Personas;
import com.musa2.service.PersonasService;

@Service
public class PersonasServiceImp implements PersonasService{
@Autowired
private PersonasDao personasDao;
	@Override
	public int create(Personas per) {
		// TODO Auto-generated method stub
		return personasDao.create(per);
	}

	@Override
	public int update(Personas per) {
		// TODO Auto-generated method stub
		return personasDao.update(per);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personasDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return personasDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return personasDao.readAll();
	}

	@Override
	public Map<String, Object> findUbigeoByDocumento(int nrodoc) {
		// TODO Auto-generated method stub
		return personasDao.findUbigeoByDocumento(nrodoc);
	}
	@Override
	public Map<String, Object> readAllId() {
		// TODO Auto-generated method stub
		return personasDao.readAllId();
	}
	
}
