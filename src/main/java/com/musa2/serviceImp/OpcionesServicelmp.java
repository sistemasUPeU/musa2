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
	private OpcionesDao opcionesDao;

	@Override
	public Map<String, Object> create(Opciones o) {
		return opcionesDao.create(o);
	}

	@Override
	public Map<String, Object> update(Opciones o) {
		return opcionesDao.update(o);
	}

	@Override
	public Map<String,Object> delete(Opciones o) {
		return opcionesDao.delete(o);
	}

	@Override
	public Map<String, Object> read(int id) {
		return opcionesDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return opcionesDao.readAll();
	}

	@Override
	public Map<String, Object> readn(int nombre) {
		// TODO Auto-generated method stub
		return opcionesDao.readn(nombre);
	}

	@Override
	public Map<String, Object> reade(int estado) {
		// TODO Auto-generated method stub
		return opcionesDao.reade(estado);
	}

	@Override
	public Map<String, Object> readt(int tipo) {
		// TODO Auto-generated method stub
		return opcionesDao.readt(tipo);
	}

	@Override
	public Map<String, Object> readp(int idpadre) {
		// TODO Auto-generated method stub
		return opcionesDao.readp(idpadre);
	}
	
	@Override
	public Map<String, Object> obtenerOpciones(int idusuario) {
		// TODO Auto-generated method stub
		return opcionesDao.obtenerOpciones(idusuario);
	}
}
