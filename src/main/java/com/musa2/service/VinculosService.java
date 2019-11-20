package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Vinculos;

public interface VinculosService {
	public int create(Vinculos vinculo);
	public int update(Vinculos vinculo);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll(int id);
}
