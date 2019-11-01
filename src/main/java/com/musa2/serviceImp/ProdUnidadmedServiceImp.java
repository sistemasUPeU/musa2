package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Prod_UnidadmedDao;
import com.musa2.entity.Prod_Unidadmed;
import com.musa2.service.Prod_UnidadmedService;


@Service
public class ProdUnidadmedServiceImp implements Prod_UnidadmedService{
	@Autowired
	private Prod_UnidadmedDao prod_UnidadmedDao;
	@Override
	public int create(Prod_Unidadmed P) {
		// TODO Auto-generated method stub
		return prod_UnidadmedDao.create(P);
	}

	@Override
	public int update(Prod_Unidadmed P) {
		// TODO Auto-generated method stub
		return prod_UnidadmedDao.update(P);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return prod_UnidadmedDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return prod_UnidadmedDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return prod_UnidadmedDao.readAll();
	}
}
