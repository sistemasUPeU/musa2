package com.musa2.dao;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.musa2.entity.Usuarios;



public interface UsuariosDao {
	public int create(Usuarios U);
	public int update(Usuarios U);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readN(String nombre);
	public Map<String, Object> readR(String rol);
	public Map<String, Object> readE(int estado);
	public Map<String, Object> readAll();
	public Map<String, Object> readUser();
	public Map<String, Object> readPer();
	public Map<String, Object> readPerN(String nombre);
	public Map<String, Object> readRolus();
	public Map<String, Object> readUse();
	public Map<String, Object> readUseN(String login);
  /*  public Map<String, Object> validar_login(Usuarios U);
    public Map<String, Object> validar_nom_user(String login);*/
    Usuarios validarUsuario(String login);
    Map<String, Object> datosUsuario(String login);
	
}