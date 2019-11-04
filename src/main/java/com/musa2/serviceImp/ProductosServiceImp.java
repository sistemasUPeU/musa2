package com.musa2.serviceImp;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.ProductosDao;
import com.musa2.entity.Productos;
import com.musa2.service.ProductosService;

@Service
public class ProductosServiceImp implements ProductosService{
	@Autowired
	private ProductosDao productosDao;
	@Override
	public int create(Productos P) {
		// TODO Auto-generated method stub
		return productosDao.create(P);
	}

	@Override
	public int update(Productos P) {
		// TODO Auto-generated method stub
		return productosDao.update(P);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return productosDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return productosDao.read(id);
	}
	

	@Override
	public Map<String, Object> read(String nombre) {
		// TODO Auto-generated method stub
		return productosDao.read(nombre);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return productosDao.readAll();
	}
	
}
