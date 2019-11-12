package com.musa2.dao;

import com.musa2.entity.VinculosRequisitos;

public interface VinculosRequisitosDao {
	public int insertar(int idvinculo,int tiporequisitos);
	public int update(int idvinculo,int idrequisito);
}
