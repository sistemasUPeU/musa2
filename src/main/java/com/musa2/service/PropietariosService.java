package com.musa2.service;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Propietarios;

public interface PropietariosService {
	public int create(Propietarios pr);
	public int udpdate(Propietarios pr);
	public int delete(int key);
	public Propietarios read(int key);
	public List<Map<String, Object>> readAll();
}
