package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Prod_Categorias;



public interface Prod_CategoriasService {
	public int create(Prod_Categorias P);
	public int update(Prod_Categorias P);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String,Object> readAll();
}
