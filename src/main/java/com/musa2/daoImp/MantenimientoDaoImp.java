package com.musa2.daoImp;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa2.dao.Mantenimientodao;
import com.musa2.entity.Mantenimiento;

import oracle.jdbc.OracleTypes;

@Repository
public class MantenimientoDaoImp implements Mantenimientodao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> create(Mantenimiento m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> update(Mantenimiento m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> updateState(int state, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllByMantId(int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
