package com.musa2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.SoatsDao;
import com.musa2.entity.Soats;
import com.musa2.service.SoatsService;

@Service
public class SoatsSeviceImp implements SoatsService{
   @Autowired
   private SoatsDao soatsDao;

@Override
public int create(Soats so) {
	// TODO Auto-generated method stub
	return soatsDao.create(so);
}

@Override
public int update(Soats so) {
	// TODO Auto-generated method stub
	return soatsDao.update(so);
}

@Override
public int delete(int key) {
	// TODO Auto-generated method stub
	return soatsDao.delete(key);
}

@Override
public Soats read(int key) {
	// TODO Auto-generated method stub
	return soatsDao.read(key);
}

@Override
public List<Map<String, Object>> readAll() {
	// TODO Auto-generated method stub
	return soatsDao.readAll();
}
  
   
}
