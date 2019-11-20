package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Usuarios_Opciones;

public interface Usuarios_OpcionesService {
	public int create(Usuarios_Opciones up);
	public int update(Usuarios_Opciones up);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();

}
