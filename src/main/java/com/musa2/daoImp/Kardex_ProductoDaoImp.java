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

import com.musa2.dao.Kardex_ProductoDao;
import com.musa2.entity.Kardex_Producto;

import oracle.jdbc.OracleTypes;

@Repository
public class Kardex_ProductoDaoImp implements Kardex_ProductoDao{
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Kardex_Producto kar) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_KARDEX_PRODUCTO.PR_CREAR_KARDEX_PRODUCTO(?,?,?,?,?)", kar.getPreciounitario(),kar.getPreciototal(),kar.getCantidad(),kar.getIdproducto(),kar.getIdkardex());
	}

	@Override
	public int update(Kardex_Producto kar) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_KARDEX_PRODUCTO.PR_ACTUALIZAR_KARDEX_PRODUCTO(?,?,?,?,?,?)",kar.getIdkardex_producto(),kar.getPreciounitario(),kar.getPreciototal(),kar.getCantidad(),kar.getIdproducto(),kar.getIdkardex());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_KARDEX_PRODUCTO.PR_ELIMINAR_KARDEX_PRODUCTO(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_KARDEX_PRODUCTO_ID").withCatalogName("PKG_KARDEX_PRODUCTO")
				.declareParameters(new SqlOutParameter("kardpro",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDKARDEX_PRODUCTO", Types.INTEGER)); 
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDKARDEX_PRODUCTO", id);
		return  simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_KARDEX_PRODUCTO")		
				.withCatalogName("PKG_KARDEX_PRODUCTO")
				.declareParameters(new SqlOutParameter("kardpro",OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	

}
