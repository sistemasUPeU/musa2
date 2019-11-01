package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.musa2.dao.Prod_MarcasDao;
import com.musa2.entity.Prod_Marcas;
import com.musa2.service.Prod_MarcasService;


@Service
public class Prod_MarcasServiceImp implements Prod_MarcasService{
	@Autowired
	private Prod_MarcasDao prod_MarcasDao;
	@Override
	public int create(Prod_Marcas P) {
		// TODO Auto-generated method stub
		return prod_MarcasDao.create(P);
	}

	@Override
	public int update(Prod_Marcas P) {
		// TODO Auto-generated method stub
		return prod_MarcasDao.update(P);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return prod_MarcasDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return prod_MarcasDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return prod_MarcasDao.readAll();
	}
	
}
