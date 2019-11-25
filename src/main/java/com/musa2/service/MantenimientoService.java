package com.musa2.service;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Mantenimiento;

public interface MantenimientoService {

	public Map<String, Object> create(Mantenimiento m); 
    public Map<String, Object> update(Mantenimiento m);
    public Map<String, Object> updateState(int state, int id);
    public Map<String, Object> read(int id); 
    public List<Map<String, Object>> readAll(); 
    public Map<String, Object> readAllByMantId(int id);
	
}
