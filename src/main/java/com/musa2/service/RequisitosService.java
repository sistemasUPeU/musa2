package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Requisitos;

public interface RequisitosService {
	public  Map<String, Object> create(Requisitos r);
	public  Map<String, Object> update(Requisitos r);
	public int delete(int id);
	public Map<String,Object> read(int id);
<<<<<<< HEAD
	public Map<String,Object> readAll();
=======
	public Map<String,Object> lista();
	
	// Esto es para vinculo no borrar //
	public Map<String,Object> list(int tipo);
>>>>>>> albert
}
