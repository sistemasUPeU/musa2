package com.musa2.dao;


import java.util.Map;

import com.musa2.entity.Vinculo_Curso;


public interface Vinculo_CursoDao {
	
	public Map<String, Object> create(Vinculo_Curso vc); 
    public Map<String, Object> update(Vinculo_Curso vc);
    public Map<String, Object> eliminar(Vinculo_Curso vc);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll(int id);

}
