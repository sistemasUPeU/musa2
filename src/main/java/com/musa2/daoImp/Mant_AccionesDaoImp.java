package com.musa2.daoImp;

import java.sql.Types;
import java.util.List;
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

import com.musa2.dao.Mant_AccionesDao;
import com.musa2.entity.Mant_Acciones;

import oracle.jdbc.OracleTypes;

@Repository
public class Mant_AccionesDaoImp implements Mant_AccionesDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> create(Mant_Acciones m) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_crear_accion").withCatalogName("pkg_mant_crud_acciones")
				.declareParameters(new SqlParameter("p_idaccionpadre",OracleTypes.INTEGER),
						new SqlParameter("p_nombre",Types.VARCHAR),
						new SqlParameter("p_tipo",Types.INTEGER),
						new SqlParameter("p_estado",Types.INTEGER),
						new SqlParameter("p_descripcion",Types.VARCHAR),
						new SqlOutParameter("p_error",Types.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_masgerror",Types.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idaccionpadre", m.getIdaccionpadre())
															.addValue("p_nombre", m.getNombre())
															.addValue("p_tipo", m.getTipo())
															.addValue("p_estado", m.getEstado())
															.addValue("p-descripcion", m.getDescripcion());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> update(Mant_Acciones m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> updateState(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAllByType(int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
