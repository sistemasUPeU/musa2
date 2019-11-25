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

import com.musa2.dao.CajaDao;
import com.musa2.entity.Caja;

import oracle.jdbc.OracleTypes;
@Repository
public class CajaDaoImp implements CajaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public Map<String, Object> create(Caja caja) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_VENTAS_CAJA")
				.withProcedureName("pa_mat_ventas_ins")
				.declareParameters(
					new SqlParameter("p_idempleado", Types.INTEGER),
					new SqlParameter("p_tipo", Types.INTEGER),
					new SqlParameter("p_fechainicio",Types.DATE),
					new SqlParameter("p_fechafin",Types.DATE),
					new SqlParameter("p_montoapertura",Types.DOUBLE),
					new SqlParameter("p_montocierre",Types.DOUBLE),
					new SqlParameter("p_usercreate",Types.VARCHAR),
					new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
					new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idempleado", caja.getIdempleado())
												.addValue("p_tipo", caja.getTipo())
												.addValue("p_fechainicio", caja.getFechainicio())
												.addValue("p_fechafin", caja.getFechafin())
												.addValue("p_montoapertura", caja.getMontoapertura())
												.addValue("p_montocierre", caja.getMontocierre())
												.addValue("p_usercreate", caja.getUsercreate());
		return simpleJdbcCall.execute(in);
	}

}
