package com.musa2.daoImp;

import java.sql.Types;
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

import com.musa2.dao.Roles_OpcionesDao;
import com.musa2.entity.Roles_Opciones;

import oracle.jdbc.OracleTypes;


@Repository
public class Roles_OpcionesDaoImp implements Roles_OpcionesDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Roles_Opciones P) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SEG_ASIGNAR_ROLES_OPCIONES.pr_asignar_roles_opciones(?,?)",P.getIdrol(),P.getIdopcion());
	}

	@Override
	public int delete(int idrol) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SEG_ASIGNAR_ROLES_OPCIONES.pr_eliminar_roles_opciones(?)",idrol);
	}

	@Override
	public int delete(int idrol, int idopcion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SEG_ASIGNAR_ROLES_OPCIONES.pr_eliminar_rol_opcion_id(?,?)",idrol, idopcion);
	}
 
	@Override
	public Map<String, Object> read(String nombre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_rolop_nombre").withCatalogName("PKG_SEG_ASIGNAR_ROLES_OPCIONES")
				.declareParameters(new SqlOutParameter("p_cur_rolop",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_nombre", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_nombre", nombre);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_SEG_ASIGNAR_ROLES_OPCIONES")
				.withProcedureName("pr_listar_roles_opciones")	
				.declareParameters(new SqlOutParameter("p_cur_rolop", OracleTypes
				.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
}
