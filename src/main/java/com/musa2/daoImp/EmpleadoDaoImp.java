package com.musa2.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.musa2.dao.EmpleadoDao;
@Repository
public class EmpleadoDaoImp implements EmpleadoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> listar() {
		System.out.println("llegue");
		return jdbcTemplate.queryForList("SELECT e.idempleado , p.nombre FROM empleados e  , personas p where e.idpersona = p.idpersona");
	}

}
