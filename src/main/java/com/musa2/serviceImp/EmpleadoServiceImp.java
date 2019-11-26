package com.musa2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.EmpleadoDao;
import com.musa2.service.EmpleadoService;
@Service
public class EmpleadoServiceImp implements EmpleadoService {
	 @Autowired
	 private EmpleadoDao emple;
	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return emple.listar();
	}

}