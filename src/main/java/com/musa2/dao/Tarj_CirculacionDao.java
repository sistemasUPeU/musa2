package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Tarj_Circulacion;

public interface Tarj_CirculacionDao {
	public int create(Tarj_Circulacion tar);
	public int update(Tarj_Circulacion tar);
    public int delete(int id);
    public Map<String, Object> read(int id);
    public Map<String, Object> readAll();
}
