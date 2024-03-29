package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Vehiculos;

public interface VehiculosService {


	public Map<String, Object> create(Vehiculos ve);
	public Map<String, Object> update(Vehiculos ve);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> search(int nropadron);
	public Map<String, Object> readmodelId();
	public Map<String, Object> readmarcaId();
	public Map<String, Object> readcatId();
}
