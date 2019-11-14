package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Personas;


public interface PersonasDao {

	public int create(Personas per);
	 public int update(Personas per);
	 public int delete(int id);
	 public Map<String,Object> read(int id);
	 public Map<String, Object> readAll();
	 public Map<String, Object> findUbigeoByDocumento(int nrodoc);
<<<<<<< HEAD
=======

		/*NO BORRAR ESTE METODO*/
		public Map<String, Object> readAllId();
>>>>>>> 543777c207557e7f0333038c3ee2fecdece52641
}
