package com.musa2.service;
import java.util.Map;

import com.musa2.entity.Opciones;

public interface OpcionesService {
	public int create(Opciones O);
	public int update(Opciones O);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String, Object> readAll();
}