package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.musa2.dao.RolesDao;
import com.musa2.dao.UsuariosDao;
import com.musa2.entity.Usuarios;

@Service
public class UserLogin implements UserDetailsService{
	@Autowired
	private UsuariosDao usuarioDao;
	@Autowired
	private RolesDao rolDao;
	@Override
	public CustomUser loadUserByUsername(String username) throws UsernameNotFoundException {
		Map<String,Object> login = usuarioDao.validar_nom_user(username);
		CustomUser details = new CustomUser((String)login.get("usuario"),(String)login.get("password"),rolDao.readAll());
		return details;
	}

}