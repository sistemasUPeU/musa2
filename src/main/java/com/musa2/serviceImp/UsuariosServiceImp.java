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
	public Map<String, Object> validar_login(Usuarios U) {
		// TODO Auto-generated method stub
		return usuariosDao.validar_login(U);
	}


}
