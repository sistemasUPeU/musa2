package com.musa2.dao;


import java.util.Map;

import com.musa2.entity.Personas;



public interface PersonasDao {
	public int create(Personas P);
	public int update(Personas P);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> findPersonasByDocumento(int nrodoc);
	public Map<String, Object> getPersonaId();
}
