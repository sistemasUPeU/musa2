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

import com.musa2.dao.Tarj_CirculacionDao;
import com.musa2.entity.Tarj_Circulacion;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class Tarj_CirculacionDaoImp implements Tarj_CirculacionDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
  	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public Map<String, Object> create(Tarj_Circulacion tar) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_CV_TARJETAC")
				.withProcedureName("pa_mat_tarjetac_ins")
				.declareParameters(new SqlParameter("p_nrodocumento",Types.INTEGER), 
						new SqlParameter("p_fechaemision", Types.DATE),
						new SqlParameter("p_fechavencimiento", Types.DATE),
						new SqlParameter("p_estado", Types.INTEGER),
						new SqlParameter("p_idvehiculo", Types.INTEGER)
						
						);
		
		SqlParameterSource in = new MapSqlParameterSource()
				.addValue("p_nrodocumento", tar.getNrodocumento())
				.addValue("p_fechaemision", tar.getNrodocumento())
				.addValue("p_fechavencimiento", tar.getNrodocumento())
				.addValue("p_estado", tar.getNrodocumento())
				.addValue("p_idvehiculo", tar.getNrodocumento())
				;
		return simpleJdbcCall.execute(in);
		}
	@Override
	public Map<String, Object> update(Tarj_Circulacion tar) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_CV_TARJETAC")
				.withProcedureName("pa_mat_tarjetac_upd")
				.declareParameters(
						new SqlParameter("p_idtarjetac",Types.INTEGER), 
						new SqlParameter("p_nrodocumento",Types.INTEGER), 
						new SqlParameter("p_fechaemision", Types.DATE),
						new SqlParameter("p_fechavencimiento", Types.DATE),
						new SqlParameter("p_estado", Types.INTEGER),
						new SqlParameter("p_idvehiculo", Types.INTEGER)
						
						);
		
		SqlParameterSource in = new MapSqlParameterSource()
				.addValue("p_idtarjetac", tar.getIdtarjetac())
				.addValue("p_nrodocumento", tar.getNrodocumento())
				.addValue("p_fechaemision", tar.getNrodocumento())
				.addValue("p_fechavencimiento", tar.getNrodocumento())
				.addValue("p_estado", tar.getNrodocumento())
				.addValue("p_idvehiculo", tar.getNrodocumento())
				;
		return simpleJdbcCall.execute(in);
		}
	@Override
	public Map<String, Object> delete(Tarj_Circulacion tar) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_CV_TARJETAc")
				.withProcedureName("pa_mat_tarjetac_del")
				.declareParameters(new SqlParameter("p_idtarjetac",Types.INTEGER)
						, new SqlParameter("p_estado", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource()
				.addValue("P_IDTARJETAC", tar.getIdtarjetac())
		.addValue("p_estado", tar.getIdtarjetac());
		return simpleJdbcCall.execute(in);	
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_CV_TARJETAC")
				.withProcedureName("pa_mat_tarjetac_get")
				.declareParameters(new SqlOutParameter("tarjetas",OracleTypes.CURSOR,new ColumnMapRowMapper
						()), new SqlParameter("P_IDTARJETAC", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDTARJETAC", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_TARJETAC")
				.withProcedureName("pa_mat_tarjetac_list")
				.declareParameters(new SqlOutParameter("tarjetas", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
  	
  	
} 
