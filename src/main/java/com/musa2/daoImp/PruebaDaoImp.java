package com.musa2.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.musa2.dao.PruebaDao;
@Repository
public class PruebaDaoImp implements PruebaDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public String mensaje(String mensaje) {
		// TODO Auto-generated method stub
		return mensaje;
	}

}
