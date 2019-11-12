package com.musa2.serviceImp;

import java.util.Map;

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
	public int update(int idvinculo,int idrequisito) {
		// TODO Auto-generated method stub
		return vinculosrequisitos.update(idvinculo,idrequisito);
	}



	@Override
	public int insertar(int tiporequisitos,VinculosRequisitos vincurequi ) {
		// TODO Auto-generated method stub
		return vinculosrequisitos.insertar(tiporequisitos,vincurequi);
	}



	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return vinculosrequisitos.read(id);
	}
	
}
