package com.musa2.dao;



import java.util.Map;

import com.musa2.entity.Requisitos;

public interface RequisitosDao {
	public int create(Requisitos requisito);
	public int edit(Requisitos requisito);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String,Object> lista();
	
	// Esto es para vinculo no borrar //
	public Map<String,Object> list(int tipo);
	
}
