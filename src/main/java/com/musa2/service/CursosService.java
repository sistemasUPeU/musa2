package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Cursos;

public interface CursosService {
	public int create(Cursos cursos);
	public int update(Cursos cursos);
	public int delete(int id);
	   public Map<String,Object> read(int id);
		public Map<String, Object> readAll();
		  public Map<String,Object> read(String nombrecurso);
			 public Map<String, Object> findCursosByNombre(String nombrecurso);
}

