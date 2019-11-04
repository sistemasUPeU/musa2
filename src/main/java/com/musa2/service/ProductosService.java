package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Productos;

public interface ProductosService {
	public int create(Productos P);
	public int update(Productos P);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String,Object> read(String nombre);
	public Map<String,Object> readAll();
}
