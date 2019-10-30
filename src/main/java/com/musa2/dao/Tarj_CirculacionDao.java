package com.musa2.dao;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Tarj_Circulacion;

public interface Tarj_CirculacionDao {

	public int create(Tarj_Circulacion tc);
	public int update(Tarj_Circulacion tc);
	public int delete(int key);
	public Tarj_Circulacion read(int key);
	public List<Map<String, Object>> readAll();
}
