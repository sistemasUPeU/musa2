package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.UbigeoDao;
import com.musa2.entity.Ubigeo;
import com.musa2.service.UbigeoService;

@Service
public class UbigeoServiceImp implements UbigeoService{
@Autowired
private UbigeoDao ubigeoDao;

	@Override
	public int create(Ubigeo ubi) {
		// TODO Auto-generated method stub
		return ubigeoDao.create(ubi);
	}

	@Override
	public int update(Ubigeo ubi) {
		// TODO Auto-generated method stub
		return ubigeoDao.update(ubi);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return ubigeoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return ubigeoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return ubigeoDao.readAll();
	}

	@Override
	public Map<String, Object> findUbigeoByCodigo(int codUbigeo) {
		// TODO Auto-generated method stub
		return ubigeoDao.findUbigeoByCodigo(codUbigeo);
	}

}
