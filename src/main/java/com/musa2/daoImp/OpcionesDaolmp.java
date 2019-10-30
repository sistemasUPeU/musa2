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

import com.musa2.dao.OpcionesDao;
import com.musa2.entity.Opciones;

import oracle.jdbc.OracleTypes;

@Repository
public class OpcionesDaolmp implements OpcionesDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Opciones O) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call PKG_SEG_CRUD_OPCIONES.pr_insertar_opciones(?,?,?,?,?,?,?);",O.getNombre(),O.getDescripcion(),O.getEnlace(),O.getIcono(),O.getTipo(),O.getOrden(),O.getIdpadre());
	}

	@Override
	public int update(Opciones O) {
		// TODO Auto-generated method stub
		return   jdbcTemplate.update("call PKG_SEG_CRUD_OPCIONES.pr_modificar_opciones(?,?,?,?,?,?,?,?,?);",O.getIdopciones(),O.getNombre(),O.getDescripcion(),O.getEnlace(),O.getIcono(),O.getTipo(),O.getOrden(),O.getEstado(),O.getIdpadre());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call PKG_SEG_CRUD_OPCIONES.pr_desactivar_opciones(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_opciones_Get").withCatalogName("PK_OPCIONES")
				.declareParameters(new SqlOutParameter("p_cur_opciones",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_idopcion ",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idopcion ", id);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> readn(int nombre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_opciones_Get").withCatalogName("PK_OPCIONES")
				.declareParameters(new SqlOutParameter("p_cur_opciones",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_nombre ",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_nombre ", nombre);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> reade(int estado) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_opciones_Get").withCatalogName("PK_OPCIONES")
				.declareParameters(new SqlOutParameter("p_cur_opciones",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_estado ",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_estado ", estado);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> readt(int tipo) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_opciones_Get").withCatalogName("PK_OPCIONES")
				.declareParameters(new SqlOutParameter("p_cur_opciones",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_tipo ",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_tipo ", tipo);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> readp(int idpadre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_opciones_Get").withCatalogName("PK_OPCIONES")
				.declareParameters(new SqlOutParameter("p_cur_opciones",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_idpadre ",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idpadre ", idpadre);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PA_MAT_OPCIONES_LIST")
				.withCatalogName("PK_OPCIONES")
				.declareParameters(new SqlOutParameter("p_cur_opciones", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
