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

import com.musa2.dao.VinculosDao;
import com.musa2.entity.Vinculos;

import oracle.jdbc.OracleTypes;

@Repository
public class VinculosDaoImp implements VinculosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Vinculos vinculo) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_cv_crud_vincunlos.pa_mat_vinculos_ins(?,?,?,?,?,?,?,?,?)", vinculo.getTipovinculo(), vinculo.getIdconductor(), vinculo.getDescripcion(), vinculo.getFechainicio(), vinculo.getFechafin(), vinculo.getUsercreate(), vinculo.getIdpropietario(), vinculo.getIdempleado(), vinculo.getIdvehiculo());
	}

	@Override
	public int update(Vinculos vinculo) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_cv_crud_vincunlos.pa_mat_vinculos_upd(?,?,?,?,?,?,?,?,?,?,?)", vinculo.getIdvinculo(), vinculo.getTipovinculo(), vinculo.getEstado(), vinculo.getIdconductor(), vinculo.getDescripcion(), vinculo.getFechainicio(), vinculo.getFechafin(), vinculo.getUsermodify(), vinculo.getIdpropietario(), vinculo.getIdempleado(), vinculo.getIdvehiculo());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_cv_crud_vincunlos.pa_mat_vinculos_del(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_vincunlos")
				.withProcedureName("pa_mat_vinculos_get")
				.declareParameters(new SqlOutParameter("vin", OracleTypes
				.CURSOR, new ColumnMapRowMapper()), new SqlParameter("p_idvinculo", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idvinculo", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll(int id) {
		System.out.println("si entre johan-sama"+ id);
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_vincunlos")
				.withProcedureName("pa_mat_vinculos_lis")
				.declareParameters(new SqlOutParameter("vin", OracleTypes
				.CURSOR, new ColumnMapRowMapper()), new SqlParameter("p_tipo_vinculo", Types.INTEGER));
		
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_tipo_vinculo", id);
		return simpleJdbcCall.execute(in);
	}

}
