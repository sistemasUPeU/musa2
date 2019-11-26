package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Personas;

public interface PersonasService {
<<<<<<< HEAD

	public int create(Personas per);
	 public int update(Personas per);
	 public int delete(int id);
	 public Map<String,Object> read(int id);
	 public Map<String, Object> readAll();
	 public Map<String, Object> findUbigeoByDocumento(int nrodoc);
		public Map<String, Object> readAllId();
=======
	public int create(Personas P);
	public int update(Personas P);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> findPersonasByDocumento(int nrodoc);
	public Map<String, Object> getPersonaId();
>>>>>>> b3cd2dfb6e61616a97c94b77376a4e6697f3664a
}
