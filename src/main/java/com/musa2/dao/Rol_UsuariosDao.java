package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Rol_Usuarios;

public interface Rol_UsuariosDao {
	public int createru(Rol_Usuarios ru);
	public int delete(int idrol, int idusuario, String user_modify);
	public int activar(int idrol, int idusuario, String user_modify);
	public int update(Rol_Usuarios rol_Usuarios);
	public Map<String, Object> read(int idrol, int idusuario);
	public Map<String, Object> readL(String login);
	public Map<String, Object> readE(int estado);
}
