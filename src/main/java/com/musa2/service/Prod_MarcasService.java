package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Prod_Marcas;



public interface Prod_MarcasService {
	public int create(Prod_Marcas P);
	public int update(Prod_Marcas P);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String,Object> read(String nombre);
	public Map<String,Object> readAll();
}
