package com.musa2.service;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Personas;

public interface PersonasService {
	public int create(Personas P);
	public int update(Personas P);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String, Object> readAll();
}
