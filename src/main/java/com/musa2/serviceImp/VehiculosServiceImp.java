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
	public Map<String, Object> create(Vehiculos ve){
		// TODO Auto-generated method stub
		return vehiculosDao.create(ve);
	}

	@Override
	public Map<String, Object> update(Vehiculos ve){
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
	public Map<String, Object> readmodelId() {
		// TODO Auto-generated method stub
		return vehiculosDao.readmodelId();
	}

	@Override
	public Map<String, Object> readmarcaId() {
		// TODO Auto-generated method stub
		return vehiculosDao.readmarcaId();
	}

	@Override
	public Map<String, Object> readcatId() {
		// TODO Auto-generated method stub
		return vehiculosDao.readcatId();
	}

	@Override
	public Map<String, Object> search(int nropadron) {
		// TODO Auto-generated method stub
		return vehiculosDao.search(nropadron);
	}
} 
