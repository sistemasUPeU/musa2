package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.VinculosDao;
import com.musa2.entity.Vinculos;
import com.musa2.service.VinculosService;

@Service
public class VinculosServiceImp implements VinculosService{
	@Autowired
	private VinculosDao vinculosDao;

	@Override
	public int create(Vinculos vinculo) {
		// TODO Auto-generated method stub
		return vinculosDao.create(vinculo);
	}

	@Override
	public int update(Vinculos vinculo) {
		// TODO Auto-generated method stub
		return vinculosDao.update(vinculo);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return vinculosDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return vinculosDao.read(id);
	}

	@Override
	public Map<String, Object> readAll(int tipo) {
		// TODO Auto-generated method stub
		return vinculosDao.readAll(tipo);
	}
	
}
