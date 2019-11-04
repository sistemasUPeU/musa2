package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Propietarios;

public interface PropietariosService {

	public int create(Propietarios p);
	public int update(Propietarios p);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
