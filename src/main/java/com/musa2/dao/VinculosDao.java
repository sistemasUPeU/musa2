package com.musa2.dao;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Vinculos;

public interface VinculosDao {
	public Map<String, Object> create(Vinculos vinculo); 
    public Map<String, Object> update(Vinculos vinculo);
    public Map<String, Object> updateState(Vinculos vinculo);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll(int id);
	public List<Map<String, Object>> contar();
	
   
}
