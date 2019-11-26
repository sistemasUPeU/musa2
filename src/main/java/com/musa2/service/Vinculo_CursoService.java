package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Vinculo_Curso;;

public interface Vinculo_CursoService {
	public int create(Vinculo_Curso vc);
	public int update(Vinculo_Curso vc);
	public int delete(int id,int x);
	   public Map<String,Object> read(int idcurso,int idconductor);
		public Map<String, Object> readAll();
		public Map<String, Object> readNombre(String nombrecurso);
}
