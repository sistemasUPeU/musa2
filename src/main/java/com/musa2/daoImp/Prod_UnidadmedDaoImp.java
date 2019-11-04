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

import com.musa2.dao.Prod_UnidadmedDao;
import com.musa2.entity.Prod_Unidadmed;

import oracle.jdbc.OracleTypes;

@Repository
public class Prod_UnidadmedDaoImp implements Prod_UnidadmedDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Prod_Unidadmed P) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call PKG_ALM_CRUD_PRODUNIDADMED.pa_mat_produnidadmed_ins(?,?,?)",P.getNombrelargo(),P.getNombrecorto(),P.getEstado());
	}

	@Override
	public int update(Prod_Unidadmed P) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ALM_CRUD_PRODUNIDADMED.pa_mat_produnidadmed_upd(?,?,?,?)",P.getIdprodunidadmed(),P.getNombrelargo(),P.getNombrecorto(),P.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ALM_CRUD_PRODUNIDADMED.pa_mat_produnidadmed_Del(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_produnidadmed_Get").withCatalogName("PKG_ALM_CRUD_PRODUNIDADMED")
				.declareParameters(new SqlOutParameter("uni",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_idprodunidadmed", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idprodunidadmed", id);
		return simpleJdbcCall.execute(in);
	}
	
	@Override
	public Map<String, Object> read(String nombrec) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_produnidadmed_GetNomc").withCatalogName("PKG_ALM_CRUD_PRODUNIDADMED")
				.declareParameters(new SqlOutParameter("uni",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_nombrecorto", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_nombrecorto", nombrec);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_ALM_CRUD_PRODUNIDADMED")
				.withProcedureName("PA_MAT_PRODUNIDADMED_LIS")	
				.declareParameters(new SqlOutParameter("uni", OracleTypes
				.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
}
