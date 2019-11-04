package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Roles_OpcionesDao;
import com.musa2.entity.Roles_Opciones;
import com.musa2.service.Roles_OpcionesService;


@Service
public class Roles_OpcionesServiceImp implements Roles_OpcionesService{
	@Autowired
	private Roles_OpcionesDao roles_OpcionesDao;
	@Override
	public int create(Roles_Opciones P) {
		// TODO Auto-generated method stub
		return roles_OpcionesDao.create(P);
	}

	@Override
	public int delete(int idrol) {
		// TODO Auto-generated method stub
		return roles_OpcionesDao.delete(idrol);
	}

	@Override
	public int delete(int idrol, int idopcion) {
		// TODO Auto-generated method stub
		return roles_OpcionesDao.delete(idrol, idopcion);
	}

	@Override
	public Map<String, Object> read(String nombre) {
		// TODO Auto-generated method stub
		return roles_OpcionesDao.read(nombre);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return roles_OpcionesDao.readAll();
	}

}
