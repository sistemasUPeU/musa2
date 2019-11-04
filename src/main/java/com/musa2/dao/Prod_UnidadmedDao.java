package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Prod_Unidadmed;



public interface Prod_UnidadmedDao {
	public int create(Prod_Unidadmed P);
	public int update(Prod_Unidadmed P);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String,Object> read(String nombrec);
	public Map<String, Object> readAll();
}
