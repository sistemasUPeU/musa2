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

import com.musa2.dao.Prod_MarcasDao;
import com.musa2.entity.Prod_Marcas;

import oracle.jdbc.OracleTypes;


@Repository
public class Prod_MarcasDaoImp implements Prod_MarcasDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Prod_Marcas P) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call PKG_ALM_CRUD_PRODMARCAS.pa_mat_prodmarcas_ins(?,?)",P.getNombre(),P.getEstado());
	}

	@Override
	public int update(Prod_Marcas P) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ALM_CRUD_PRODMARCAS.pa_mat_prodmarcas_upd(?,?,?)",P.getIdprodmarca(),P.getNombre(),P.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ALM_CRUD_PRODMARCAS.pa_mat_prodmarcas_Del(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_prodmarcas_Get").withCatalogName("PKG_ALM_CRUD_PRODMARCAS")
				.declareParameters(new SqlOutParameter("marc",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_idprodmarca", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idprodmarca", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_ALM_CRUD_PRODMARCAS")
				.withProcedureName("PA_MAT_PRODMARCAS_LIS")	
				.declareParameters(new SqlOutParameter("marc", OracleTypes
				.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
