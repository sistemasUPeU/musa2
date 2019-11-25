package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Propietarios;

public interface PropietariosService {

	public Map<String, Object> create(Propietarios pro);
	public Map<String, Object> update(Propietarios pro);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	Map<String, Object> readnom();
	public Map<String, Object> search(String nombre);
	public int delete(int id);
}
