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

import com.musa2.dao.VentasDao;
import com.musa2.entity.Ventas;

import oracle.jdbc.OracleTypes;

@Repository
public class VentasDaoImp implements VentasDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public Map<String, Object> create(Ventas venta) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_VENTAS")
				.withProcedureName("pa_mat_ventas_ins")
				.declareParameters(
					new SqlParameter("p_idcaja", Types.INTEGER),
					new SqlParameter("p_nrocomprobante", Types.INTEGER),
					new SqlParameter("p_nroserie",Types.INTEGER),
					new SqlParameter("p_total",Types.DOUBLE),
					new SqlParameter("p_subtotal",Types.DOUBLE),
					new SqlParameter("p_igv",Types.DOUBLE),
					new SqlParameter("p_idpersona",Types.INTEGER),
					new SqlParameter("p_idtipocomprobante",Types.INTEGER),
					new SqlParameter("p_idtipoventa",Types.INTEGER),
					new SqlParameter("p_idpedido",Types.INTEGER),
					new SqlParameter("p_usercreate",Types.VARCHAR),
					new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
					new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idcaja", venta.getIdcaja())
												.addValue("p_nrocomprobante", venta.getNrocomprobante())
												.addValue("p_nroserie", venta.getNroserie())
												.addValue("p_total", venta.getTotal())
												.addValue("p_subtotal", venta.getSubtotal())
												.addValue("p_igv", venta.getIgv())
												.addValue("p_idpersona", venta.getIdpersona())
												.addValue("p_idtipocomprobante", venta.getIdtipocomprobante())
												.addValue("p_idtipoventa", venta.getIdtipoventa())
												.addValue("p_idpedido", venta.getIdpedido())
												.addValue("p_usercreate", venta.getUsercreate());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> update(Ventas venta) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_VENTAS")
				.withProcedureName("pa_mat_ventas_upd")
				.declareParameters(
					new SqlParameter("p_idcaja", Types.INTEGER),
					new SqlParameter("p_idventa", Types.INTEGER),
					new SqlParameter("p_total",Types.DOUBLE),
					new SqlParameter("p_subtotal",Types.DOUBLE),
					new SqlParameter("p_igv",Types.DOUBLE),
					new SqlParameter("p_idpersona",Types.INTEGER),
					new SqlParameter("p_idtipocomprobante",Types.INTEGER),
					new SqlParameter("p_idtipoventa",Types.INTEGER),
					new SqlParameter("p_idpedido",Types.INTEGER),
					new SqlParameter("p_usermodify",Types.VARCHAR),
					new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
					new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idcaja", venta.getIdcaja())
												.addValue("p_idventa", venta.getIdventa())
												.addValue("p_total", venta.getTotal())
												.addValue("p_subtotal", venta.getSubtotal())
												.addValue("p_igv", venta.getIgv())
												.addValue("p_idpersona", venta.getIdpersona())
												.addValue("p_idtipocomprobante", venta.getIdtipocomprobante())
												.addValue("p_idtipoventa", venta.getIdtipoventa())
												.addValue("p_idpedido", venta.getIdpedido())
												.addValue("p_usermodify", venta.getUsermodify());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> updateState(Ventas venta) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_VENTAS")
				.withProcedureName("pa_mat_ventas_cambiar_estado")
				.declareParameters(new SqlParameter("p_idventa",Types.INTEGER),
								   new SqlParameter("p_idcaja",Types.INTEGER),
								   new SqlParameter("p_estado",Types.INTEGER),
								   new SqlOutParameter("p_error",OracleTypes.INTEGER,new ColumnMapRowMapper()),
								   new SqlOutParameter("msgerror",OracleTypes.VARCHAR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idventa", venta.getIdventa())
														   .addValue("p_idcaja", venta.getIdcaja())
														   .addValue("p_estado", venta.getEstado());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> read(int idc, int idv) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_vinculos")
				.withProcedureName("pa_mat_vinculos_get")
				.declareParameters(new SqlOutParameter("ven", OracleTypes
				.CURSOR, new ColumnMapRowMapper()),
						new SqlParameter("p_idventa", Types.INTEGER),
						new SqlParameter("p_idcaja", Types.INTEGER),
						new SqlOutParameter("p_error",OracleTypes.INTEGER,new ColumnMapRowMapper()),
						new SqlOutParameter("msgerror",OracleTypes.VARCHAR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idventa", idv)
														   .addValue("p_idcaja", idc);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll(int idc, int estado) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_vinculos")
				.withProcedureName("pa_mat_vinculos_lis")
				.declareParameters(new SqlOutParameter("ven", OracleTypes
				.CURSOR, new ColumnMapRowMapper()), 
						new SqlParameter("p_idcaja", Types.INTEGER),
						new SqlParameter("p_estado", Types.INTEGER),
						new SqlOutParameter("p_error",OracleTypes.INTEGER,new ColumnMapRowMapper()),
						new SqlOutParameter("msgerror",OracleTypes.VARCHAR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource()
				.addValue("p_idcaja", idc)
				.addValue("p_estado", estado);
		return simpleJdbcCall.execute(in);
	}

}
