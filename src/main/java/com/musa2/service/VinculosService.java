package com.musa2.service;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Vinculos;

public interface VinculosService {
	public Map<String, Object> create(Vinculos vinculo); 
    public Map<String, Object> update(Vinculos vinculo);
    public Map<String, Object> updateState(Vinculos vinculo);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll(int tipo, int estado);
	public List<Map<String, Object>> contar();
}
