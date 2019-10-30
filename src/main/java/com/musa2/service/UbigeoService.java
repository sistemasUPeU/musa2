package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Ubigeo;

public interface UbigeoService {
		   public int create(Ubigeo ubi);
		   public int update(Ubigeo ubi);
		   public int delete(int id);
		   public Map<String,Object> read(int id);
			public Map<String, Object> readAll();
		}


