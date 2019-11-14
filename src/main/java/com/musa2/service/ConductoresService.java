package com.musa2.service;

import java.util.Map;



import com.musa2.entity.Conductores;



public interface ConductoresService {
	Map<String, Object> create(Conductores c);
	Map<String, Object> update(Conductores c) ;
	Map<String, Object> delete(Conductores c) ;
	Map<String, Object> est(int est) ;
	Map<String, Object> code(int code) ;
    Map<String, Object> read(int id);
	Map<String, Object> readAll();
	Map<String, Object> lis();

}
