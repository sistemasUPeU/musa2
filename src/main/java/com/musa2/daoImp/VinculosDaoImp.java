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
	public Map<String, Object> create(Vinculos vinculo) {
		// TODO Auto-generated method stub
				simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
						.withCatalogName("pkg_cv_crud_vinculos")
						.withProcedureName("pa_mat_vinculos_ins")
						.declareParameters(
							new SqlParameter("p_tipovinculo", Types.INTEGER),
							new SqlParameter("p_idconductor", Types.INTEGER),
							new SqlParameter("p_descripcion",Types.VARCHAR),
							new SqlParameter("p_fechainicio",Types.DATE),
							new SqlParameter("p_fechafin",Types.DATE),
							new SqlParameter("p_usercreate",Types.VARCHAR),
							new SqlParameter("p_idpropietario",Types.INTEGER),
							new SqlParameter("p_idempleado",Types.INTEGER),
							new SqlParameter("p_idvehiculo",Types.INTEGER),
							new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
							new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
				SqlParameterSource in = new MapSqlParameterSource().addValue("p_tipovinculo", vinculo.getTipovinculo())
														.addValue("p_idconductor", vinculo.getIdconductor())
														.addValue("p_descripcion", vinculo.getDescripcion())
														.addValue("p_fechainicio", vinculo.getFechainicio())
														.addValue("p_fechafin", vinculo.getFechafin())
														.addValue("p_usercreate", vinculo.getUsercreate())
														.addValue("p_idpropietario", vinculo.getIdpropietario())
														.addValue("p_idempleado", vinculo.getIdempleado())
														.addValue("p_idvehiculo", vinculo.getIdvehiculo());
				return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> update(Vinculos vinculo) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_vinculos")
				.withProcedureName("pa_mat_vinculos_upd")
				.declareParameters(
					new SqlParameter("p_idvinculo", Types.INTEGER),	
					new SqlParameter("p_tipovinculo", Types.INTEGER),
					new SqlParameter("p_idconductor", Types.INTEGER),
					new SqlParameter("p_descripcion",Types.VARCHAR),
					new SqlParameter("p_fechainicio",Types.DATE),
					new SqlParameter("p_fechafin",Types.DATE),
					new SqlParameter("p_usermodify",Types.VARCHAR),
					new SqlParameter("p_idpropietario",Types.INTEGER),
					new SqlParameter("p_idempleado",Types.INTEGER),
					new SqlParameter("p_idvehiculo",Types.INTEGER),
					new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
					new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idvinculo", vinculo.getIdvinculo())
												.addValue("p_tipovinculo", vinculo.getTipovinculo())
												.addValue("p_idconductor", vinculo.getIdconductor())
												.addValue("p_descripcion", vinculo.getDescripcion())
												.addValue("p_fechainicio", vinculo.getFechainicio())
												.addValue("p_fechafin", vinculo.getFechafin())
												.addValue("p_usermodify", vinculo.getUsercreate())
												.addValue("p_idpropietario", vinculo.getIdpropietario())
												.addValue("p_idempleado", vinculo.getIdempleado())
												.addValue("p_idvehiculo", vinculo.getIdvehiculo());
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> updateState(Vinculos vinculo) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_vinculos")
				.withProcedureName("pa_mat_vinculos_del")
				.declareParameters(new SqlParameter("p_idvinculo",Types.INTEGER),
								   new SqlParameter("p_estado",Types.INTEGER),
								   new SqlOutParameter("p_error",OracleTypes.INTEGER,new ColumnMapRowMapper()),
								   new SqlOutParameter("msgerror",OracleTypes.VARCHAR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idvinculo", vinculo.getIdvinculo())
														   .addValue("p_estado", vinculo.getEstado());
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
				simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
						.withCatalogName("pkg_cv_crud_vinculos")
						.withProcedureName("pa_mat_vinculos_get")
						.declareParameters(new SqlOutParameter("vin", OracleTypes
						.CURSOR, new ColumnMapRowMapper()),
								new SqlParameter("p_idvinculo", Types.INTEGER),
								new SqlOutParameter("p_error",OracleTypes.INTEGER,new ColumnMapRowMapper()),
								new SqlOutParameter("msgerror",OracleTypes.VARCHAR,new ColumnMapRowMapper()));
				SqlParameterSource in = new MapSqlParameterSource().addValue("p_idvinculo", id);
				return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_vinculos")
				.withProcedureName("pa_mat_vinculos_lis")
				.declareParameters(new SqlOutParameter("vin", OracleTypes
				.CURSOR, new ColumnMapRowMapper()), 
						new SqlParameter("p_tipo_vinculo", Types.INTEGER),
						new SqlOutParameter("p_error",OracleTypes.INTEGER,new ColumnMapRowMapper()),
						new SqlOutParameter("msgerror",OracleTypes.VARCHAR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_tipo_vinculo", id);
		return simpleJdbcCall.execute(in);
	}
}
