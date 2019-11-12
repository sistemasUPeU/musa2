package com.musa2.service;

import java.util.Map;

import com.musa2.entity.VinculosRequisitos;

public interface VinculosRequisitosService {
	public int insertar(int tiporequisitos,VinculosRequisitos vincurequi);
	public int update(int idvinculo,int idrequisito);
	public Map<String, Object> read(int id);
}
