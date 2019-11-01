package com.musa2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Mant_AccionesDao;
import com.musa2.entity.Mant_Acciones;
import com.musa2.service.Mant_AccionesService;

@Service
public class Mant_AccionesServiceImp implements Mant_AccionesService{

	@Autowired
	private Mant_AccionesDao mant_accionesDao;
	
	@Override
	public Map<String, Object> create(Mant_Acciones m) {
		// TODO Auto-generated method stub
		return mant_accionesDao.create(m);
	}

	@Override
	public Map<String, Object> update(Mant_Acciones m) {
		// TODO Auto-generated method stub
		return mant_accionesDao.update(m);
	}

	@Override
	public Map<String, Object> updateState(Mant_Acciones m) {
		// TODO Auto-generated method stub
		return mant_accionesDao.updateState(m);
	}

	@Override
	public Map<String, Object> readAllByType(int type) {
		// TODO Auto-generated method stub
		return mant_accionesDao.readAllByType(type);
	}

}
