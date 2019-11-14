package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Propietarios;

public interface PropietariosService {

	public Map<String, Object> create(Propietarios pro);
	public Map<String, Object> update(Propietarios pro);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	Map<String, Object> readnom();
<<<<<<< HEAD
=======
	public Map<String, Object> search(String nombre);
>>>>>>> 13551fd04dd5048e5e6a574dda893675f8575b84
}
