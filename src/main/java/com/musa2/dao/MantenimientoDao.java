package com.musa2.dao;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Mantenimiento;

public interface MantenimientoDao {
	public Map<String, Object> create(Mantenimiento m); 
    public Map<String, Object> update(Mantenimiento m);
    public Map<String, Object> updateState(int state, int id, int idempleado);
    public Map<String, Object> read(int id); 
    public Map<String, Object> readAllByType(int type); 
    public Map<String, Object> readAllDetaByMantId(int id);
    public Map<String, Object> addDetalle(int idm, int ida);//idmantenimiento idaccion
    public Map<String, Object> updateDetaState(int idm, int ida, int state);
}
