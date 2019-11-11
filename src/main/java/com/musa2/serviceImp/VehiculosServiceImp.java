package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.VehiculosDao;
import com.musa2.entity.Vehiculos;
import com.musa2.service.VehiculosService;

@Service
public class VehiculosServiceImp implements VehiculosService{
    @Autowired
    private VehiculosDao vehiculosDao;
	@Override
	public int create(Vehiculos ve) {
		// TODO Auto-generated method stub
		return vehiculosDao.create(ve);
	}

	@Override
	public int update(Vehiculos ve) {
		// TODO Auto-generated method stub
		return vehiculosDao.update(ve);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return vehiculosDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return vehiculosDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return vehiculosDao.readAll();
	}

	@Override
	public Map<String, Object> readplaca() {
		// TODO Auto-generated method stub
		return vehiculosDao.readplaca();
	}
} 
