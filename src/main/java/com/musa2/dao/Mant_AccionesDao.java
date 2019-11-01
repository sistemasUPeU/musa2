package com.musa2.dao;

import com.musa2.entity.Mant_Acciones;
import java.util.List;
import java.util.Map;

public interface Mant_AccionesDao {
	public int create(Mant_Acciones m); 
    public int update(Mant_Acciones m); 
    public int delete(int id); 
    public Map<String, Object> read(int id); 
    public List<Map<String, Object>> readAll(); 
    public List<Map<String, Object>> readAllByType(int type); 
}
