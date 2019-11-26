package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Personas;

public interface PersonasService {

	public int create(Personas per);
	 public int update(Personas per);
	 public int delete(int id);
	 public Map<String,Object> read(int id);
	 public Map<String, Object> readAll();
	 public Map<String, Object> findUbigeoByDocumento(int nrodoc);
		public Map<String, Object> readAllId();
}

