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

import com.musa2.dao.ConductoresDao;
import com.musa2.entity.Conductores;

import oracle.jdbc.OracleTypes;

@Repository
public class ConductoresDaoImp implements ConductoresDao{
	@Autowired
	private JdbcTemplate  jdbc;
	private SimpleJdbcCall simp;

	@Override
	public Map<String, Object> create(Conductores c) {
		System.out.println(c);
		simp = new SimpleJdbcCall(jdbc).withCatalogName("PKG_CV_CONDUCTOR").withProcedureName("pa_mat_conductor_ins")
				.declareParameters(
						new SqlParameter("p_tipooperador",Types.INTEGER),
						new SqlParameter("p_codigo",Types.INTEGER),
						new SqlParameter("p_estado",Types.INTEGER),
						new SqlParameter("p_idpersona",Types.INTEGER),
						new SqlParameter("p_nrolicencia",Types.INTEGER),
						new SqlParameter("p_cursovial",Types.INTEGER),
						new SqlParameter("p_usercreate",Types.VARCHAR),
						new SqlParameter("p_lincfechainicio",Types.DATE), 
						new SqlParameter("p_lincfechafin",Types.DATE), 
						new SqlParameter("p_clase",Types.CHAR),
						new SqlParameter("p_categoria",Types.INTEGER)
						);
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_tipooperador",c.getTipooperador())
															.addValue("p_codigo", c.getCodigo())
															.addValue("p_estado", c.getEstado())
															.addValue("p_idpersona", c.getIdpersona())
															.addValue("p_nrolicencia", c.getNrolicencia())
															.addValue("p_cursovial", c.getCursovial())
															.addValue("p_usercreate", c.getUsercreate())
															.addValue("p_lincfechainicio",c.getLinc_fechainicio())
															.addValue("p_lincfechafin", c.getLinc_fechafin())
		                                                    .addValue("p_clase", c.getClase())
		                                                    .addValue("p_categoria", c.getCategoria());
		return simp.execute(in);
		}

	@Override
	public Map<String, Object> update(Conductores c) {
		System.out.println(c);
		simp = new SimpleJdbcCall(jdbc).withCatalogName("PKG_CV_CONDUCTOR").withProcedureName("pa_mat_conductor_upd")
				.declareParameters(
						new SqlParameter("p_idconductor",Types.INTEGER),
						new SqlParameter("p_tipooperador",Types.INTEGER),
						new SqlParameter("p_codigo",Types.INTEGER),
						new SqlParameter("p_estado",Types.INTEGER),
						new SqlParameter("p_idpersona",Types.INTEGER),
						new SqlParameter("p_nrolicencia",Types.INTEGER),
						new SqlParameter("p_cursovial",Types.INTEGER),
						new SqlParameter("p_usermodify",Types.VARCHAR),
						new SqlParameter("p_lincfechainicio",Types.DATE), 
						new SqlParameter("p_lincfechafin",Types.DATE), 
						new SqlParameter("p_clase",Types.CHAR),
						new SqlParameter("p_categoria",Types.INTEGER)
						);
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idconductor",c.getIdconductor())
				                                            .addValue("p_tipooperador",c.getTipooperador())
															.addValue("p_codigo", c.getCodigo())
															.addValue("p_estado", c.getEstado())
															.addValue("p_idpersona", c.getIdpersona())
															.addValue("p_nrolicencia", c.getNrolicencia())
															.addValue("p_cursovial", c.getCursovial())
															.addValue("p_usermodify", c.getUsermodify())
															.addValue("p_lincfechainicio",c.getLinc_fechainicio())
															.addValue("p_lincfechafin", c.getLinc_fechafin())
		                                                    .addValue("p_clase", c.getClase())
		                                                    .addValue("p_categoria", c.getCategoria());
		return simp.execute(in);	}

	@Override
	public Map<String, Object> delete(Conductores c) {
		simp = new SimpleJdbcCall(jdbc).withCatalogName("PKG_CV_CONDUCTOR").withProcedureName("pa_mat_conductor_del")
				.declareParameters(
						new SqlParameter("p_idconductor",Types.INTEGER),
						new SqlParameter("p_estado",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idconductor",c.getIdconductor())
				.addValue("p_estado",c.getEstado());
		
		
		return simp.execute(in);
	}


	@Override
	public Map<String, Object> read(int id) {
		simp = new SimpleJdbcCall(jdbc)
				.withCatalogName("PKG_CV_CONDUCTOR")
				.withProcedureName("pa_mat_conductor_get")
				.declareParameters(new SqlParameter("p_idconductor",Types.INTEGER),new SqlOutParameter("con", OracleTypes
				.CURSOR,new ColumnMapRowMapper())
				);
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idconductor",id);
		return simp.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simp = new SimpleJdbcCall(jdbc)
				.withCatalogName("PKG_CV_CONDUCTOR")
				.withProcedureName("pa_mat_conductor_list")
				.declareParameters(new SqlOutParameter("p_conductor", OracleTypes
				.CURSOR,new ColumnMapRowMapper()));
		return simp.execute();
	}

	@Override
	public Map<String, Object> lis() {
		simp = new SimpleJdbcCall(jdbc)
				.withCatalogName("PKG_CV_CONDUCTOR")
				.withProcedureName("pa_mat_conductor_listnombre")
				.declareParameters(new SqlOutParameter("p_conductor", OracleTypes
				.CURSOR,new ColumnMapRowMapper()));
		return simp.execute();
	}

	@Override
	public Map<String, Object> est(int est) {
		simp = new SimpleJdbcCall(jdbc)
				.withCatalogName("PKG_CV_CONDUCTOR")
				.withProcedureName("pa_mat_conductor_est")
				.declareParameters(new SqlParameter("p_estado",Types.INTEGER),new SqlOutParameter("p_conductor", OracleTypes
				.CURSOR,new ColumnMapRowMapper())
				);
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_estado",est);
		return simp.execute(in);
	}

	@Override
	public Map<String, Object> code(int code) {
		simp = new SimpleJdbcCall(jdbc)
				.withCatalogName("PKG_CV_CONDUCTOR")
				.withProcedureName("pa_mat_conductor_code")
				.declareParameters(new SqlParameter("p_codigo",Types.INTEGER),new SqlOutParameter("p_conductor", OracleTypes
				.CURSOR,new ColumnMapRowMapper())
				);
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_codigo",code);
		return simp.execute(in);
	}

}