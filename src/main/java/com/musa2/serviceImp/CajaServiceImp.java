package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.CajaDao;
import com.musa2.entity.Caja;
import com.musa2.service.CajaService;

@Service
public class CajaServiceImp implements CajaService{
	@Autowired
	private CajaDao cajaDao;
	@Override
	public Map<String, Object> create(Caja caja) {
		// TODO Auto-generated method stub
		return cajaDao.create(caja);
	}
	
}
