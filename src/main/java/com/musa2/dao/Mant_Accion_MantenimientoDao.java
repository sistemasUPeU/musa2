package com.musa2.dao;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Mant_Accion_Mantenimiento;

public interface Mant_Accion_MantenimientoDao {
	public int create(Mant_Accion_Mantenimiento m); 
    public int update(Mant_Accion_Mantenimiento m); 
    public int delete(int id); 
    public Map<String, Object> read(int id); 
    public List<Map<String, Object>> readAll(); 
    public List<Map<String, Object>> readAllByMantId(int type); 
}
