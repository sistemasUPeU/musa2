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

import com.musa2.dao.Prod_CategoriasDao;
import com.musa2.entity.Prod_Categorias;

import oracle.jdbc.OracleTypes;

@Repository
public class Prod_CategoriasDaoImp implements Prod_CategoriasDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Prod_Categorias P) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call PKG_ALM_CRUD_PRODCATEGORIAS.pa_mat_prodcategorias_ins(?,?)",P.getNombre(),P.getEstado());
	}

	@Override
	public int update(Prod_Categorias P) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ALM_CRUD_PRODCATEGORIAS.pa_mat_prodcategorias_upd(?,?,?)",P.getIdprodcategoria(),P.getNombre(),P.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ALM_CRUD_PRODCATEGORIAS.pa_mat_prodcategorias_Del(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_prodcategorias_Get").withCatalogName("PKG_ALM_CRUD_PRODCATEGORIAS")
				.declareParameters(new SqlOutParameter("cat",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_idprodcategoria", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idprodcategoria", id);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> read(String nombre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_prodcategorias_GetNom").withCatalogName("PKG_ALM_CRUD_PRODCATEGORIAS")
				.declareParameters(new SqlOutParameter("cat",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_nombre", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_nombre", nombre);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_ALM_CRUD_PRODCATEGORIAS")
				.withProcedureName("PA_MAT_PRODCATEGORIAS_LIS")	
				.declareParameters(new SqlOutParameter("cat", OracleTypes
				.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
