package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.musa2.dao.RolesDao;
import com.musa2.dao.UsuariosDao;
import com.musa2.entity.Usuarios;

@Service("userService")
public class UserLogin implements UserDetailsService{
	@Autowired
	private UsuariosDao usuarioDao;
	@Autowired
	private RolesDao rolDao;
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuarios login = usuarioDao.validarUsuario(username);
		UserDetails details = new User(login.getLogin(),login.getPassword(),rolDao.readAllid(login.getIdusuario()));
		return details;
	}

}