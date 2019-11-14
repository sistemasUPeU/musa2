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
						new SqlParameter("p_idempleado",Types.INTEGER),
						new SqlParameter("p_idconductor",Types.INTEGER),
						new SqlParameter("p_tipo_mantenimiento",Types.INTEGER),
						new SqlParameter("p_detalle",Types.VARCHAR),
						new SqlParameter("p_fechainicio",Types.DATE),
						new SqlParameter("p_usercreate",Types.VARCHAR),
						new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_idmantenimiento",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idvehiculo",m.getIdVehiculo())
															.addValue("p_idempleado", m.getIdEmpleado())
															.addValue("p_idconductor", m.getIdConductor())
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
						new SqlParameter("p_detalle",Types.VARCHAR),
						new SqlParameter("p_idconductor",Types.INTEGER),
						new SqlParameter("p_fechainicio",Types.DATE),
						new SqlParameter("p_usermodify",Types.VARCHAR),
						new SqlParameter("p_idmantenimiento",OracleTypes.INTEGER),
						new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idvehiculo",m.getIdVehiculo())
															.addValue("p_idconductor",m.getIdVehiculo())
															.addValue("p_detalle", m.getDetalle())
															.addValue("p_fechainicio", m.getFechaInicio())
															.addValue("p_usermodify", m.getUserModify())
															.addValue("p_idmantenimiento", m.getIdMantenimiento());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> updateState(int state, int id, int idempleado) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_estado_mant").withCatalogName("pkg_mant_crud_mant")
				.declareParameters(new SqlParameter("p_idmantenimiento",Types.INTEGER),
						new SqlParameter("p_estado",Types.INTEGER),
						new SqlParameter("p_idempleado",Types.INTEGER),
						new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()),
						new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource()	.addValue("p_idmantenimiento",id)
															.addValue("p_estado", state)
															.addValue("p_idempleado", idempleado);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_get_mant").withCatalogName("pkg_mant_crud_mant")
				.declareParameters(new SqlParameter("p_idmantenimiento",Types.INTEGER),
								   new SqlOutParameter("p_cursor",OracleTypes.CURSOR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idmantenimiento", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAllByType(int type){
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_listar_por_tipo").withCatalogName("pkg_mant_crud_mant")
				.declareParameters(new SqlParameter("p_tipomantenimiento",Types.INTEGER),
								   new SqlOutParameter("p_cursor",OracleTypes.CURSOR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_tipomantenimiento", type);
		return simpleJdbcCall.execute(in);
	}; 

	@Override
	public Map<String, Object> readAllDetaByMantId(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_list_deta_mant_id").withCatalogName("pkg_mant_crud_mant")
				.declareParameters(new SqlParameter("p_idmantenimiento",Types.INTEGER),
								   new SqlOutParameter("p_cursor",OracleTypes.CURSOR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idmantenimiento", id);
		return simpleJdbcCall.execute(in);
	}
	
	@Override
	public Map<String, Object> addDetalle(int idm, int ida)//idmantenimiento idaccion
	{
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_crear_detalle_mant").withCatalogName("pkg_mant_crud_mant")
				.declareParameters(new SqlParameter("p_idmantenimiento",Types.INTEGER),
								new SqlParameter("p_idmantenimiento",Types.INTEGER),
								new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
								new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idmantenimiento", idm)
															.addValue("p_idmantacciones", ida);
		return simpleJdbcCall.execute(in);
	}
	
	@Override
    public Map<String, Object> updateDetaState(int idm, int ida, int state)//idmantenimiento idaccion
	{
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_estado_detalle").withCatalogName("pkg_mant_crud_mant")
				.declareParameters(new SqlParameter("p_idmantenimiento",Types.INTEGER),
								new SqlParameter("p_idmantacciones",Types.INTEGER),
								new SqlParameter("p_estado",Types.INTEGER),
								new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
								new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idmantenimiento", idm)
															.addValue("p_idmantacciones", ida)
															.addValue("p_estado", state);
		return simpleJdbcCall.execute(in);
	}
	
}
