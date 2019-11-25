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

import com.musa2.dao.DetalleVentaDao;
import com.musa2.entity.Detalle_Venta;

import oracle.jdbc.OracleTypes;

@Repository
public class DetalleVentaDaoImp implements DetalleVentaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public Map<String, Object> create(Detalle_Venta dventa) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_VENTAS")
				.withProcedureName("pa_mat_ventas_detalle_ins")
				.declareParameters(
					new SqlParameter("p_detalle_idventa", Types.INTEGER),
					new SqlParameter("p_idproducto", Types.INTEGER),
					new SqlParameter("p_cantidad",Types.INTEGER),
					new SqlParameter("p_preciounitario",Types.DOUBLE),
					new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
					new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_detalle_idventa", dventa.getIdventa())
												.addValue("p_idproducto", dventa.getIdproducto())
												.addValue("p_cantidad", dventa.getCantidad())
												.addValue("p_preciounitario", dventa.getPreciounitario());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> update(Detalle_Venta dventa) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_VENTAS")
				.withProcedureName("pa_mat_ventas_detalle_upd")
				.declareParameters(
					new SqlParameter("p_detalle_idventa", Types.INTEGER),
					new SqlParameter("p_idproducto", Types.INTEGER),
					new SqlParameter("p_cantidad",Types.INTEGER),
					new SqlParameter("p_preciounitario",Types.DOUBLE),
					new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
					new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_detalle_idventa", dventa.getIdventa())
												.addValue("p_idproducto", dventa.getIdproducto())
												.addValue("p_cantidad", dventa.getCantidad())
												.addValue("p_preciounitario", dventa.getPreciounitario());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> delete(int iddv, int idp) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_VENTAS")
				.withProcedureName("pa_mat_ventas_detalle_del")
				.declareParameters(new SqlOutParameter("ven", OracleTypes
				.CURSOR, new ColumnMapRowMapper()),
						new SqlParameter("p_detalle_idventa", Types.INTEGER),
						new SqlParameter("p_idproducto", Types.INTEGER),
						new SqlOutParameter("p_error",OracleTypes.INTEGER,new ColumnMapRowMapper()),
						new SqlOutParameter("msgerror",OracleTypes.VARCHAR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_detalle_idventa", iddv)
														   .addValue("p_idproducto", idp);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll(int iddv) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_VENTAS")
				.withProcedureName("pa_mat_ventas_detalle_lis")
				.declareParameters(new SqlOutParameter("ven", OracleTypes
				.CURSOR, new ColumnMapRowMapper()),
						new SqlParameter("p_detalle_idventa", Types.INTEGER),
						new SqlOutParameter("p_error",OracleTypes.INTEGER,new ColumnMapRowMapper()),
						new SqlOutParameter("msgerror",OracleTypes.VARCHAR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_detalle_idventa", iddv);
														   
		return simpleJdbcCall.execute(in);
	}

}
