package com.musa2.service;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Mant_Acciones;

public interface Mant_AccionesService {

	public Map<String, Object> create(Mant_Acciones m);
    public Map<String, Object> update(int id, Mant_Acciones m);
    public Map<String, Object> updateState(int id);
    public Map<String, Object> readAllByType(int type);
    public Map<String, Object> readById(int id);
    public Map<String, Object> readByCat();
}