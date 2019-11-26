package com.musa2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.PersonasDao;
import com.musa2.entity.Personas;
import com.musa2.service.PersonasService;
@Service
public class PersonasServiceImp implements PersonasService {
	@Autowired
	private PersonasDao personasDao;
	
	@Override
	public int create(Personas P) {
		// TODO Auto-generated method stub
		return personasDao.create(P);
	}

	@Override
	public int update(Personas P) {
		// TODO Auto-generated method stub
		return personasDao.update(P);
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
	public Map<String, Object> findPersonasByDocumento(int nrodoc) {
		// TODO Auto-generated method stub
		return personasDao.findPersonasByDocumento(nrodoc);
	}
<<<<<<< HEAD
=======

>>>>>>> b3cd2dfb6e61616a97c94b77376a4e6697f3664a
	@Override
	public Map<String, Object> getPersonaId() {
		// TODO Auto-generated method stub
		return personasDao.getPersonaId();
	}
<<<<<<< HEAD
	
=======

>>>>>>> b3cd2dfb6e61616a97c94b77376a4e6697f3664a
}
