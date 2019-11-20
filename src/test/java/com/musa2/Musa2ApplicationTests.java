package com.musa2;


import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.musa2.dao.RolesDao;
import com.musa2.dao.UsuariosDao;
import com.musa2.entity.Usuarios;
import com.musa2.serviceImp.UserLogin;






@SpringBootTest
public class Musa2ApplicationTests {
	@Autowired
	UsuariosDao usuariosDao;
    @Autowired
    UserLogin userLogin;
    @Autowired
    RolesDao rolesDao;

	/*@Test
   	void userDatosl() {
   		assertTrue(usuariosDao.readAll()!=null);
   	}*/
    /*@Test
	void autentificarUser() {

		assertTrue(usuariosDao.validarUsuario("login")!=null);
	}*/
	/*@Test
	void Roles() {
		assertTrue(rolesDao.readAllid(19)!=null);
	}*/
   /* @Test
    void datosUsuario() {

		assertTrue(usuariosDao.datosUsuario("login")!=null);
	}*/
    @Test
	void createUser() {
		Usuarios user = new Usuarios("diana", "123", 4, "keny");
		assertTrue(usuariosDao.create(user)>0);
		
	}
}
