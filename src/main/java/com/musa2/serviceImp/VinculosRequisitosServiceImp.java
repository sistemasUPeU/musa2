package com.musa2.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.VinculosRequisitosDao;
import com.musa2.entity.VinculosRequisitos;
import com.musa2.service.VinculosRequisitosService;

@Service
public class VinculosRequisitosServiceImp implements VinculosRequisitosService{
	@Autowired
	private VinculosRequisitosDao vinculosrequisitos;

	@Override
	public int insertar(int idvinculo,int tiporequisitos) {
		// TODO Auto-generated method stub
		return vinculosrequisitos.insertar(idvinculo ,tiporequisitos);
	}

	@Override
	public int update(int idvinculo,int idrequisito) {
		// TODO Auto-generated method stub
		return vinculosrequisitos.update(idvinculo,idrequisito);
	}
	
}
