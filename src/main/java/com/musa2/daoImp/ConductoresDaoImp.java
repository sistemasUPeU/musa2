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
	public int create(Conductores c) {
		return jdbc.update("call PKG_CV_CONDUCTOR.pa_mat_conductor_ins(?,?,?,?,?,?,?,?,?,?,?)",c.getTipooperador(),c.getCodigo(),c.getEstado(),c.getIdpersona(),c.getNrolicencia(),c.getCursovial(),c.getUsercreate(),c.getLinc_fechainicio(),c.getLinc_fechafin(),c.getClase(),c.getCategoria());
	}

	@Override
	public int update(Conductores c) {
		return jdbc.update("call PKG_CV_CONDUCTOR.pa_mat_conductor_upd(?,?,?,?,?,?,?,?,?,?,?,?)",c.getIdconductor(),c.getTipooperador(),c.getCodigo(),c.getEstado(),c.getIdpersona(),c.getNrolicencia(),c.getCursovial(),c.getUsermodify(),c.getLinc_fechainicio(),c.getLinc_fechafin(),c.getClase(),c.getCategoria());
	}

	@Override
	public int delete(int id) {
		return jdbc.update("call PKG_CV_CONDUCTOR.pa_mat_conductor_del(?)",id);
	}


	@Override
	public Map<String, Object> read(int id) {
		simp = new SimpleJdbcCall(jdbc)
				.withCatalogName("PKG_CV_CONDUCTOR")
				.withProcedureName("pa_mat_conductor_get").declareParameters(new SqlParameter("p_idconductor",Types.INTEGER),new SqlOutParameter("p_idconductor", OracleTypes
				.CURSOR,new ColumnMapRowMapper())
				);
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idconductor",id);
		return simp.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simp = new SimpleJdbcCall(jdbc).withCatalogName("PKG_CV_CONDUCTOR").withProcedureName("pa_mat_conductor_list").declareParameters(new SqlOutParameter("p_idconductor", OracleTypes.CURSOR,new ColumnMapRowMapper()));
		return simp.execute();
	}

}
