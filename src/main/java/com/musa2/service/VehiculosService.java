package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Vehiculos;

public interface VehiculosService {


	public int create(Vehiculos ve);
	public int update(Vehiculos ve);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}