package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Requisitos;

public interface RequisitosService {
	public int create(Requisitos requisito);
	public int edit(Requisitos requisito);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String,Object> lista();
}
