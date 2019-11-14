package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Rol_UsuariosDao;
import com.musa2.entity.Rol_Usuarios;
import com.musa2.service.Rol_UsuariosService;

@Service
public class Rol_UsuariosServiceImp implements Rol_UsuariosService{
	@Autowired
	private Rol_UsuariosDao rol_UsuariosDao;

	@Override
	public int createru(Rol_Usuarios ru) {
		// TODO Auto-generated method stub
		return rol_UsuariosDao.createru(ru);
	}

	@Override
	public Map<String, Object> readL(String login) {
		// TODO Auto-generated method stub
		return rol_UsuariosDao.readL(login);
	}

	@Override
	public Map<String, Object> readE(int estado) {
		// TODO Auto-generated method stub
		return rol_UsuariosDao.readE(estado);
	}

	@Override
	public int delete(int idrol, int idusuario, String user_modify) {
		// TODO Auto-generated method stub
		return rol_UsuariosDao.delete(idrol, idusuario, user_modify);
	}

	@Override
	public int update(Rol_Usuarios rol_Usuarios) {
		// TODO Auto-generated method stub
		return rol_UsuariosDao.update(rol_Usuarios);
	}

	@Override
	public Map<String, Object> read(int idrol, int idusuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int activar(int idrol, int idusuario, String user_modify) {
		// TODO Auto-generated method stub
		return rol_UsuariosDao.activar(idrol, idusuario, user_modify);
	}
}
