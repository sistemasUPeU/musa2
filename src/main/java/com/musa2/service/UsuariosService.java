package com.musa2.service;


import java.util.Map;

import com.musa2.entity.Rol_Usuarios;
import com.musa2.entity.Roles;
import com.musa2.entity.Usuarios;

public interface UsuariosService {
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
    public int validar_login(Usuarios U);
}
