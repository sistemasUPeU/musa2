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

	public Map<String,Object> lista();
	
	// Esto es para vinculo no borrar //
	public Map<String,Object> list(int tipo);

=======
	public Map<String,Object> readAll();
	// Esto es para vinculo no borrar //
	public Map<String,Object> list(int tipo);
>>>>>>> 9485c9dff05dd3a546aa00b757fb4ee48256f3cb
}
