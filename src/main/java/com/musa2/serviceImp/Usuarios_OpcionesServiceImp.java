package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Usuarios_OpcionesDao;
import com.musa2.entity.Usuarios_Opciones;
import com.musa2.service.Usuarios_OpcionesService;

@Service
public class Usuarios_OpcionesServiceImp implements Usuarios_OpcionesService{
	@Autowired
	private Usuarios_OpcionesDao Usuarios_OpcionesDao;
	@Override
	public int create(Usuarios_Opciones up) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuarios_Opciones up) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
