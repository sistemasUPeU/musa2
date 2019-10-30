package com.musa2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Tarj_CirculacionDao;
import com.musa2.entity.Tarj_Circulacion;

@Service
public class Tarj_CinculacionServiceImp implements Tarj_CirculacionDao{
   @Autowired
   private Tarj_CirculacionDao tarj_circulacionDao;

@Override
public int create(Tarj_Circulacion tc) {
	// TODO Auto-generated method stub
	return tarj_circulacionDao.create(tc);
}

@Override
public int update(Tarj_Circulacion tc) {
	// TODO Auto-generated method stub
	return tarj_circulacionDao.update(tc);
}

@Override
public int delete(int key) {
	// TODO Auto-generated method stub
	return tarj_circulacionDao.delete(key);
}

@Override
public Tarj_Circulacion read(int key) {
	// TODO Auto-generated method stub
	return tarj_circulacionDao.read(key);
}

@Override
public List<Map<String, Object>> readAll() {
	// TODO Auto-generated method stub
	return tarj_circulacionDao.readAll();
}
	
   
}
