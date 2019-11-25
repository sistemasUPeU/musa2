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

import com.musa2.dao.Tarj_CirculacionDao;
import com.musa2.entity.Tarj_Circulacion;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class Tarj_CirculacionDaoImp implements Tarj_CirculacionDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
  	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Tarj_Circulacion tar) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_TARJ_CIRCULACION.PR_CREAR_TARJ_CIRCULACION(?,?,?,?,?);", tar.getNrodocumento(),
				tar.getFechaemision(), tar.getFechavencimiento(), tar.getEstado(), tar.getIdvehiculo());
	}
	@Override
	public int update(Tarj_Circulacion tar) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_TARJ_CIRCULACION.PR_ACTUALIZAR_TARJ_CIRCULACION(?,?,?,?,?,?)", tar.getIdtarjetac(),
				tar.getNrodocumento(), tar.getFechaemision(), tar.getFechavencimiento(), tar.getEstado(), tar.getIdvehiculo());
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_TARJ_CIRCULACION.PR_ELIMINAR_TARJ_CIRCULACION(?)", id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_TARJ_CIRCULACION_ID").withCatalogName("PKG_CV_CRUD_TARJ_CIRCULACION")
				.declareParameters(new SqlOutParameter("tarj",OracleTypes.CURSOR,new ColumnMapRowMapper
						()), new SqlParameter("P_IDTARJETAC", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDTARJETAC", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_TARJ_CIRCULACION")
				.withCatalogName("PKG_CV_CRUD_TARJ_CIRCULACION")
				.declareParameters(new SqlOutParameter("tarj", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
  	
  	
} 
