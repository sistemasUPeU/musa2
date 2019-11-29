package com.musa2.service;

import java.util.Map;

import com.musa2.entity.VinculosRequisitos;

public interface VinculosRequisitosService {
	public int insertar(int tiporequisito,int vincurequi);
	public int update(int idvinculo,int idrequisito, String enlace);
	public int update(VinculosRequisitos vincurequi);
	public Map<String, Object> read(int id);
	public int delete(int id);
	public VinculosRequisitos listarid(int idv, int idr);
}
