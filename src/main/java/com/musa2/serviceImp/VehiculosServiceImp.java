package com.musa2.serviceImp;

import java.util.List;
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
public int delete(int key) {
	// TODO Auto-generated method stub
	return vehiculosDao.delete(key);
}

@Override
public Vehiculos read(int key) {
	// TODO Auto-generated method stub
	return vehiculosDao.read(key);
}

@Override
public List<Map<String, Object>> readAll() {
	// TODO Auto-generated method stub
	return vehiculosDao.readAll();
}
}
