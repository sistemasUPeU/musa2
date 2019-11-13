package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.VinculosRequisitos;

public interface VinculosRequisitosDao {
	public int insertar(int tiporequisito,VinculosRequisitos vincurequi);
	public int update(int idvinculo,int idrequisito);
	public Map<String, Object> read(int id);
	public int delete(int id);
}
