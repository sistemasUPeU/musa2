package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.ConductoresDao;
import com.musa2.entity.Conductores;
import com.musa2.service.ConductoresService;

@Service
public class ConductoresServiceImp implements ConductoresService {

	@Autowired
	private ConductoresDao conductoresDao;

	@Override
	public Map<String, Object> create(Conductores c) {
		return conductoresDao.create(c);
	}

	@Override
	public Map<String, Object> update(Conductores c) {
		return conductoresDao.update(c);
	}

	@Override
	public Map<String, Object> delete(Conductores c) {
		return conductoresDao.delete(c);
	}

	@Override
	public Map<String, Object> read(int id) {
		return conductoresDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return conductoresDao.readAll();
	}

	@Override
	public Map<String, Object> lis() {
		// TODO Auto-generated method stub
		return conductoresDao.lis();
	}

	@Override
	public Map<String, Object> est(int est) {
		// TODO Auto-generated method stub
		return conductoresDao.est(est);
	}

	@Override
	public Map<String, Object> code(int code) {
		// TODO Auto-generated method stub
		return conductoresDao.code(code);
	}
}