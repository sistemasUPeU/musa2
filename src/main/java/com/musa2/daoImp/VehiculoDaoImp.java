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

import com.musa2.dao.VehiculosDao;
import com.musa2.entity.Vehiculos;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class VehiculoDaoImp implements VehiculosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
  	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Vehiculos ve) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_VEHICULOS.PR_CREAR_VEHICULOS(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				ve.getNropadron(), ve.getEstado(), ve.getPlaca(), ve.getMotor(), ve.getSerie(), ve.getAnhofabricacion(),
				ve.getPasajerossentados(), ve.getPasajerospie(), ve.getIdvehmodelo(), ve.getIdvehmarca(), ve.getIdvehcategoria(),
				ve.getUso(), ve.getUsercreate(), ve.getDatecreate(), ve.getUsermodify(), ve.getDatemodify());
	}
	@Override
	public int update(Vehiculos ve) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_VEHICULOS.PR_ACTUALIZAR_VEHICULOS(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				ve.getIdvehiculo(), ve.getNropadron(), ve.getEstado(), ve.getPlaca(), ve.getMotor(), ve.getSerie(), ve.getAnhofabricacion(),
				ve.getPasajerossentados(), ve.getPasajerospie(), ve.getIdvehmodelo(), ve.getIdvehmarca(), ve.getIdvehcategoria(),
				ve.getUso(), ve.getUsercreate(), ve.getDatemodify(), ve.getUsermodify(), ve.getDatemodify());
	}
	@Override
	public int delete(int id) {
		return jdbcTemplate.update("call PKG_CV_CRUD_VEHICULOS.PR_ELIMINAR_VEHICULOS(?)", id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_VEHICULOS_ID").withCatalogName("PKG_CV_CRUD_VEHICULOS")
				.declareParameters(new SqlOutParameter("vehi",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDPROPIETARIO", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDVEHICULO", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_VEHICULOS")
				.withCatalogName("PKG_CV_CRUD_VEHICULOS")
				.declareParameters(new SqlOutParameter("vehi", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
  	
  	
}
