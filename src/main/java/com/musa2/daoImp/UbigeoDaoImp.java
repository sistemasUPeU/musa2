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

import com.musa2.dao.UbigeoDao;
import com.musa2.entity.Ubigeo;

import oracle.jdbc.OracleTypes;

@Repository
public class UbigeoDaoImp implements UbigeoDao {
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;
@Override
public int create(Ubigeo ubi) {
	// TODO Auto-generated method stub
	return jdbcTemplate.update("call PKG_REP_CRUD_ubigeo.PR_CREAR_UBIGEO(?,?,?,?,?,?,?,?)",ubi.getCodubigeo(),ubi.getCoddepto(),
			ubi.getDepartamento(),ubi.getCodprov(),ubi.getProvincia(),ubi.getCoddist(),ubi.getDistrito(),ubi.getEstado());
	// TODO Auto-generated method stub
}
@Override
public int update(Ubigeo ubi) {
	// TODO Auto-generated method stub
			return jdbcTemplate.update("call PKG_REP_CRUD_ubigeo.PR_ACTUALIZAR_UBIGEO(?,?,?,?,?,?,?,?,?)",ubi.getIdubigeo(),ubi.getCodubigeo(),ubi.getCoddepto(),ubi.getDepartamento(),ubi.getCodprov(),ubi.getProvincia(),ubi.getCoddist(),
					ubi.getDistrito(),ubi.getEstado());
}
@Override
public int delete(int id) {
	// TODO Auto-generated method stub
			return jdbcTemplate.update("call PKG_REP_CRUD_ubigeo.PR_ELIMINAR_UBIGEO(?)",id);
}
@Override
public Map<String, Object> read(int id) {
	simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
			.withProcedureName("PR_LISTAR_UBIGEO_ID").withCatalogName("PKG_REP_CRUD_ubigeo")
			.declareParameters(new SqlOutParameter("ubig",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDUBIGEO", Types.INTEGER)); 
	SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDUBIGEO", id);		
	return  simpleJdbcCall.execute(in);
}
@Override
public Map<String, Object> readAll() {
	// TODO Auto-generated method stub
	simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
			.withProcedureName("PR_LISTAR_UBIGEO")
			.withCatalogName("PKG_REP_CRUD_ubigeo")
			.declareParameters(new SqlOutParameter("ubig", OracleTypes.CURSOR, new ColumnMapRowMapper()));
	return simpleJdbcCall.execute();
}
}
