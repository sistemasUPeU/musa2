package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Vinculos;

public interface VinculoDao {
	public int create(Vinculos vinculos);
	public int edit(Vinculos vinculios);
	public Map<String,Object> lista();
}
