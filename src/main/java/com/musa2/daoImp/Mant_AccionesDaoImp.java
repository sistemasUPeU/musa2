package com.musa2.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.musa2.dao.Mant_AccionesDao;
import com.musa2.entity.Mant_Acciones;

public class Mant_AccionesDaoImp implements Mant_AccionesDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> create(Mant_Acciones m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> update(Mant_Acciones m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> updateState(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllByType(int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
