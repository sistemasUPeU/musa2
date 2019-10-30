package com.musa2.service;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Tarj_Circulacion;

public interface Tarj_CirculacionService {
	public int create(Tarj_Circulacion tc);
	public int update(Tarj_Circulacion tc);
	public int delete(int key);
	public Tarj_Circulacion read(int key);
	public List<Map<String, Object>> readAll();
}
