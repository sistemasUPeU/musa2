package com.musa2.service;


import java.util.Map;

import com.musa2.entity.Usuarios;

public interface UsuariosService {
	public int create(Usuarios U);
	public int update(Usuarios U);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
    public int validar_login(Usuarios U);
}
