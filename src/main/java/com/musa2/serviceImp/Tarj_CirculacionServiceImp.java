package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Tarj_CirculacionDao;
import com.musa2.entity.Tarj_Circulacion;
import com.musa2.service.Tarj_CirculacionService;

@Service
public class Tarj_CirculacionServiceImp implements Tarj_CirculacionService{
    @Autowired 
    private Tarj_CirculacionDao tarj_circulacionDao;
	@Override
	public Map<String, Object> create(Tarj_Circulacion tar) {
		// TODO Auto-generated method stub
		return tarj_circulacionDao.create(tar);
	}

	@Override
	public Map<String, Object> update(Tarj_Circulacion tar) {
		// TODO Auto-generated method stub
		return tarj_circulacionDao.update(tar);
	}

	@Override
	public Map<String, Object> delete(Tarj_Circulacion tar) {
		// TODO Auto-generated method stub
		return tarj_circulacionDao.delete(tar);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tarj_circulacionDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tarj_circulacionDao.readAll();
	}
 
}
