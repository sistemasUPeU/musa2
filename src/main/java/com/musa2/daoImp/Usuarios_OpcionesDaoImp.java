package com.musa2.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa2.dao.Usuarios_OpcionesDao;
import com.musa2.entity.Usuarios_Opciones;

@Repository
public class Usuarios_OpcionesDaoImp implements Usuarios_OpcionesDao{
	@Autowired
	private JdbcTemplate JdbcTemplate;
	private SimpleJdbcCall SimpleJdbcCall;
	@Override
	public int create(Usuarios_Opciones up) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuarios_Opciones up) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
