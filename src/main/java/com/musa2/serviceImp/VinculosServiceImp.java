package com.musa2.serviceImp;

import java.util.List;
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
	public Map<String, Object> create(Vinculos vinculo) {
		// TODO Auto-generated method stub
		return vinculosDao.create(vinculo);
	}

	@Override
	public Map<String, Object> update(Vinculos vinculo) {
		// TODO Auto-generated method stub
		return vinculosDao.update(vinculo);
	}

	@Override
	public Map<String, Object> updateState(Vinculos vinculo) {
		// TODO Auto-generated method stub
		return vinculosDao.updateState(vinculo);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return vinculosDao.read(id);
	}

	@Override
	public Map<String, Object> readAll(int id) {
		// TODO Auto-generated method stub
		return vinculosDao.readAll(id);
	}

	@Override
	public List<Map<String, Object>> contar() {
		// TODO Auto-generated method stub
		return vinculosDao.contar();
	}

	
}
