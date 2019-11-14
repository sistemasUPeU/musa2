package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Usuarios_Opciones;

public interface Usuarios_OpcionesService {
	public int create(Usuarios_Opciones up);
	public int update(Usuarios_Opciones up);
	public int delete(int idusuario, int idopcion, String user_modify);
	public int activar(int idusuario, int idopcion, String user_modify);
	public Map<String, Object> readAll();
	public Map<String, Object> readN(String login);
	public Map<String, Object> readE(int estado);
	public Map<String, Object> opcion1();
	public Map<String, Object> opc2(int idopcion2);
	public Map<String, Object> op3(int idopcion3);
	
}
