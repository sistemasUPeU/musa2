package com.musa2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.entity.Usuarios;
import com.musa2.dao.UsuariosDao;
import com.musa2.service.UsuariosService;
@Service
public class UsuariosServiceImp implements UsuariosService {
	@Autowired
	private UsuariosDao usuariosDao;
	
	@Override
	public int create(Usuarios U) {
		// TODO Auto-generated method stub
		return usuariosDao.create(U);
	}

	@Override
	public int update(Usuarios U) {
		// TODO Auto-generated method stub
		return usuariosDao.update(U);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuariosDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return usuariosDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return usuariosDao.readAll();
	}


	@Override
	public Usuarios validarUsuario(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readN(String nombre) {
		// TODO Auto-generated method stub
		return usuariosDao.readN(nombre);
	}

	@Override
	public Map<String, Object> readR(String rol) {
		// TODO Auto-generated method stub
		return usuariosDao.readR(rol);
	}

	@Override
	public Map<String, Object> readE(int estado) {
		// TODO Auto-generated method stub
		return usuariosDao.readE(estado);
	}

	@Override
	public Map<String, Object> readPer() {
		// TODO Auto-generated method stub
		return usuariosDao.readPer();
	}

	@Override
	public Map<String, Object> readPerN(String nombre) {
		// TODO Auto-generated method stub
		return usuariosDao.readPerN(nombre);
	}

	@Override
	public Map<String, Object> readUser() {
		// TODO Auto-generated method stub
		return usuariosDao.readUser();
	}

	@Override
	public Map<String, Object> readRolus() {
		// TODO Auto-generated method stub
		return usuariosDao.readRolus();
	}

	@Override
	public Map<String, Object> readUse() {
		// TODO Auto-generated method stub
		return usuariosDao.readUse();
	}

	@Override
	public Map<String, Object> readUseN(String login) {
		// TODO Auto-generated method stub
		return usuariosDao.readUseN(login);
	}

	@Override
	public Map<String, Object> datosUsuario(String login) {
		// TODO Auto-generated method stub
		return usuariosDao.datosUsuario(login);
	}

	/*@Override
	public Map<String, Object> validar_login(Usuarios U) {
		// TODO Auto-generated method stub
		return usuariosDao.validar_login(U);
	}*/


}
