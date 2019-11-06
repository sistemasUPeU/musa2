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
	public int create(Conductores c) {
		return conductoresDao.create(c);
	}

	@Override
	public int update(Conductores c) {
		return conductoresDao.update(c);
	}

	@Override
	public int delete(int id) {
		return conductoresDao.delete(id);
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
	public Map<String, Object> readnom() {
		// TODO Auto-generated method stub
		return conductoresDao.readnom();
	}
}
