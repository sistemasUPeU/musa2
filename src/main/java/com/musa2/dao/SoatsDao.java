package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Soats;

public interface SoatsDao {
	public int create(Soats so);
	public int update(Soats so);
	public int delete(int id);
	public Map<String, Object> read(int id);
    public Map<String, Object> readAll();
}
