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

import com.musa2.dao.MantenimientoDao;
import com.musa2.entity.Mantenimiento;

import oracle.jdbc.OracleTypes;

@Repository
public class MantenimientoDaoImp implements MantenimientoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> create(Mantenimiento m) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_crear_mantenimiento").withCatalogName("pkg_mant_crud_mant")
				.declareParameters(new SqlParameter("p_idvehiculo",Types.INTEGER),
						new SqlParameter("p_idempleado",Types.VARCHAR),
						new SqlParameter("p_tipo_mantenimiento",Types.INTEGER),
						new SqlParameter("p_detalle",Types.INTEGER),
						new SqlParameter("p_fechainicio",Types.VARCHAR),
						new SqlParameter("p_usercreate",Types.VARCHAR),
						new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_idmantenimiento",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_masgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idvehiculo",m.getIdVehiculo())
															.addValue("p_idempleado", m.getIdEmpleado())
															.addValue("p_tipo_mantenimiento", m.getTipoMantenimiento())
															.addValue("p_detalle", m.getDetalle())
															.addValue("p_fechainicio", m.getFechaInicio())
															.addValue("p_usercreate", m.getUserCreate());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> update(Mantenimiento m) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_actualizar_mant").withCatalogName("pkg_mant_crud_mant")
				.declareParameters(new SqlParameter("p_idvehiculo",Types.INTEGER),
						new SqlParameter("p_idempleado",Types.VARCHAR),
						new SqlParameter("p_tipo_mantenimiento",Types.INTEGER),
						new SqlParameter("p_detalle",Types.INTEGER),
						new SqlParameter("p_fechainicio",Types.VARCHAR),
						new SqlParameter("p_usercreate",Types.VARCHAR),
						new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_idmantenimiento",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_masgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idvehiculo",m.getIdVehiculo())
															.addValue("p_idempleado", m.getIdEmpleado())
															.addValue("p_tipo_mantenimiento", m.getTipoMantenimiento())
															.addValue("p_detalle", m.getDetalle())
															.addValue("p_fechainicio", m.getFechaInicio())
															.addValue("p_usercreate", m.getUserCreate());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> updateState(int state, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAllByMantId(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_get_mant").withCatalogName("pkg_mant_crud_mant")
				.declareParameters(new SqlParameter("p_idmantenimiento",Types.INTEGER),
								   new SqlOutParameter("p_cursor",OracleTypes.CURSOR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idmantenimiento", id);
		return simpleJdbcCall.execute(in);
	}

}
