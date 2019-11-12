package com.musa2.dao;

import com.musa2.entity.Mant_Acciones;
import java.util.List;
import java.util.Map;

public interface Mant_AccionesDao {
	
	public Map<String, Object> create(Mant_Acciones m);
    public Map<String, Object> update(int id, Mant_Acciones m);
    public Map<String, Object> updateState(int id);
    public Map<String, Object> readAllByType(int type);
    public Map<String, Object> readById(int id);
}
