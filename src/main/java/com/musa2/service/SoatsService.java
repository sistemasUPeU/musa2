package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Soats;

public interface SoatsService {


	public int create(Soats so);
	public int update(Soats so);
	public int delete(int id);
	public Map<String, Object> read(int id);
    public Map<String, Object> readAll();
}
