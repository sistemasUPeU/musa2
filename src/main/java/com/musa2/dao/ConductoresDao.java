package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Conductores;

public interface ConductoresDao {
	int create(Conductores c);
    int update(Conductores c) ;
	int delete(int id) ;
    Map<String, Object> read(int id);
	Map<String, Object> readAll();
	
}
