package com.musa2.dao;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Mantenimiento;

public interface Mantenimientodao {
	public Map<String, Object> create(Mantenimiento m); 
    public Map<String, Object> update(Mantenimiento m);
    public Map<String, Object> updateState(int state, int id);
    public Map<String, Object> read(int id); 
    public List<Map<String, Object>> readAll(); 
    public List<Map<String, Object>> readAllByMantId(int type);
}
