package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Requisitos;

public interface RequisitosService {
	public  Map<String, Object> create(Requisitos r);
	public  Map<String, Object> update(Requisitos r);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String,Object> readAll();
<<<<<<< HEAD
	
	// Esto es para vinculo no borrar //
	public Map<String,Object> list(int tipo);
=======
	public Map<String,Object> lista();

	
	// Esto es para vinculo no borrar //
	public Map<String,Object> list(int tipo);



>>>>>>> 13551fd04dd5048e5e6a574dda893675f8575b84
}
