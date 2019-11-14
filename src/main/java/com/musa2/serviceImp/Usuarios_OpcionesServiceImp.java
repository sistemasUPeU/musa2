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
		return Usuarios_OpcionesDao.create(up);
	}

	@Override
	public int update(Usuarios_Opciones up) {
		// TODO Auto-generated method stub
		return Usuarios_OpcionesDao.update(up);
	}

	@Override
	public int delete(int idusuario, int idopcion, String user_modify) {
		// TODO Auto-generated method stub
		return Usuarios_OpcionesDao.delete(idusuario, idopcion, user_modify);
	}


	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return Usuarios_OpcionesDao.readAll();
	}

	@Override
	public Map<String, Object> readN(String login) {
		// TODO Auto-generated method stub
		return Usuarios_OpcionesDao.readN(login);
	}

	@Override
	public Map<String, Object> readE(int estado) {
		// TODO Auto-generated method stub
		return Usuarios_OpcionesDao.readE(estado);
	}

	@Override
	public Map<String, Object> opcion1() {
		// TODO Auto-generated method stub
		return Usuarios_OpcionesDao.opcion1();
	}

	@Override
	public Map<String, Object> opc2(int idopcion2) {
		// TODO Auto-generated method stub
		return Usuarios_OpcionesDao.opc2(idopcion2);
	}

	@Override
	public Map<String, Object> op3(int idopcion3) {
		// TODO Auto-generated method stub
		return Usuarios_OpcionesDao.op3(idopcion3);
	}

	@Override
	public int activar(int idusuario, int idopcion, String user_modify) {
		// TODO Auto-generated method stub
		return Usuarios_OpcionesDao.activar(idusuario, idopcion, user_modify);
	}

	

}
