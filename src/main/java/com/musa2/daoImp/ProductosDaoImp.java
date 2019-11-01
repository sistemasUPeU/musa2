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

import com.musa2.dao.ProductosDao;
import com.musa2.entity.Productos;

import oracle.jdbc.OracleTypes;

@Repository
public class ProductosDaoImp implements ProductosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Productos P) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call PKG_ALM_CRUD_PRODUCTOS.pa_mat_productos_ins(?,?,?,?,?,?,?,?,?,?,?)",P.getNombre(),P.getDescripcion(),P.getStockactual(),P.getEstado(),P.getPrecioref(),
				P.getStockmin(),P.getStockmaximo(),P.getUsercreate(),P.getIdprodcategoria(),P.getIdprodmarca(),P.getIdprodunidadmed());
	}

	@Override
	public int update(Productos P) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ALM_CRUD_PRODUCTOS.pa_mat_productos_upd(?,?,?,?,?,?,?,?,?,?,?,?,?)",P.getIdproducto(),P.getNombre(),P.getDescripcion(),P.getStockactual(),P.getEstado(),P.getPrecioref(),
				P.getStockmin(),P.getStockmaximo(),P.getUsercreate(),P.getUsermodify(),P.getIdprodcategoria(),P.getIdprodmarca(),P.getIdprodunidadmed());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ALM_CRUD_PRODUCTOS.pa_mat_productos_Del(?)",id);
	}

	@Override
	public Map<String,Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pa_mat_productos_Get").withCatalogName("PKG_ALM_CRUD_PRODUCTOS")
				.declareParameters(new SqlOutParameter("prod",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_idproducto", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idproducto", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_ALM_CRUD_PRODUCTOS")
				.withProcedureName("PA_MAT_PRODUCTOS_LIS")	
				.declareParameters(new SqlOutParameter("prod", OracleTypes
				.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
}


