package com.musa2.dao;



import java.util.Map;

import com.musa2.entity.Requisitos;

public interface RequisitosDao {
	public  Map<String, Object> create(Requisitos r);
	public  Map<String, Object> update(Requisitos r);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String,Object> readAll();
	
}
