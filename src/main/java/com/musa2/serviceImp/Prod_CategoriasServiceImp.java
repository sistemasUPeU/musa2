package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Prod_CategoriasDao;
import com.musa2.entity.Prod_Categorias;
import com.musa2.service.Prod_CategoriasService;


@Service
public class Prod_CategoriasServiceImp implements Prod_CategoriasService{
	@Autowired
	private Prod_CategoriasDao prod_CategoriasDao;
	@Override
	public int create(Prod_Categorias P) {
		// TODO Auto-generated method stub
		return prod_CategoriasDao.create(P);
	}

	@Override
	public int update(Prod_Categorias P) {
		// TODO Auto-generated method stub
		return prod_CategoriasDao.update(P);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return prod_CategoriasDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return prod_CategoriasDao.read(id);
	}
	
	@Override
	public Map<String, Object> read(String nombre) {
		// TODO Auto-generated method stub
		return prod_CategoriasDao.read(nombre);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return prod_CategoriasDao.readAll();
	}
}
