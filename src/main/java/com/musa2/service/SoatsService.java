package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Soats;

public interface SoatsService {


	public Map<String, Object> create(Soats so);
	public Map<String, Object> update(Soats so);
	public Map<String, Object> delete(Soats so);
	public Map<String, Object> read(int id);
    public Map<String, Object> readAll();
}
