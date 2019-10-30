package com.musa2.dao;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Soats;

public interface SoatsDao {

	public int create(Soats so);
	public int update(Soats so);
	public int delete(int key);
	public Soats read(int key);
	public List<Map<String, Object>> readAll();
}
