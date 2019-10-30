package com.musa2.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.PruebaDao;
import com.musa2.service.PruebaService;
@Service
public class PruebaServiceImp implements PruebaService{
	@Autowired
	private PruebaDao pruebadao; 
	@Override
	public String mensaje(String mensaje) {
		// TODO Auto-generated method stub
		return pruebadao.mensaje(mensaje);
	}

}
