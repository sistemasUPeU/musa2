package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.OpcionesDao;
import com.musa2.entity.Opciones;
import com.musa2.service.OpcionesService;

@Service
public class OpcionesServicelmp implements OpcionesService{
	@Autowired
	private OpcionesDao OpcionesDao;

	@Override
	public int create(Opciones c) {
		return OpcionesDao.create(c);
	}

	@Override
	public int update(Opciones c) {
		return OpcionesDao.update(c);
	}

	@Override
	public int delete(int id) {
		return OpcionesDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return OpcionesDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return OpcionesDao.readAll();
	}
	
	@Override
	public Map<String, Object> obtenerOpciones(int idusuario) {
		// TODO Auto-generated method stub
		return OpcionesDao.obtenerOpciones(idusuario);
	}
}
