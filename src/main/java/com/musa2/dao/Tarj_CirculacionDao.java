package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Tarj_Circulacion;

public interface Tarj_CirculacionDao {
	public Map<String, Object> create(Tarj_Circulacion tar);
	public Map<String, Object> update(Tarj_Circulacion tar);
    public Map<String, Object> delete(Tarj_Circulacion tar);
    public Map<String, Object> read(int id);
    public Map<String, Object> readAll();
}
