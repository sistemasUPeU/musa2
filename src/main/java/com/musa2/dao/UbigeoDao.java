package com.musa2.dao;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Ubigeo;

public interface UbigeoDao {
   public int create(Ubigeo ubi);
   public int update(Ubigeo ubi);
   public int delete(int id);
   public Map<String,Object> read(int id);
	public Map<String, Object> readAll();
}
