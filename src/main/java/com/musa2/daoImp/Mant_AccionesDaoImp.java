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
						new SqlParameter("p_nombre",OracleTypes.VARCHAR),
						new SqlParameter("p_tipo",OracleTypes.INTEGER),
						new SqlParameter("p_estado",OracleTypes.INTEGER),
						new SqlParameter("p_descripcion",OracleTypes.VARCHAR),
						new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idaccionpadre", m.getIdaccionpadre())
															.addValue("p_nombre", m.getNombre())
															.addValue("p_tipo", m.getTipo())
															.addValue("p_estado", m.getEstado())
															.addValue("p_descripcion", m.getDescripcion());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> update(int id, Mant_Acciones m) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_mant_crud_acciones").withProcedureName("pr_mat_actualizar_accion")
				.declareParameters(new SqlParameter("p_idmantacciones",OracleTypes.INTEGER),
								   new SqlParameter("p_idaccionpadre",OracleTypes.INTEGER),
								   new SqlParameter("p_nombre",OracleTypes.VARCHAR),
								   new SqlParameter("p_tipo",OracleTypes.INTEGER),
								   new SqlParameter("p_estado",OracleTypes.INTEGER),
								   new SqlParameter("p_descripcion",OracleTypes.VARCHAR),
								   new SqlParameter("p_orden",OracleTypes.INTEGER),
								   new SqlOutParameter("p_error",Types.INTEGER,new ColumnMapRowMapper()),
								   new SqlOutParameter("msgerror",Types.VARCHAR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idmantacciones", id)
														   .addValue("p_idaccionpadre", m.getIdaccionpadre())
														   .addValue("p_nombre", m.getNombre())
														   .addValue("p_tipo", m.getTipo())
														   .addValue("p_estado", m.getEstado())
														   .addValue("p_descripcion", m.getDescripcion())
														   .addValue("p_orden", m.getOrden());
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> updateState(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_cambiar_estado").withCatalogName("pkg_mant_crud_acciones")
				.declareParameters(new SqlParameter("p_idmantacciones",Types.INTEGER),
								   new SqlParameter("p_estado",Types.INTEGER),
								   new SqlOutParameter("p_error",OracleTypes.INTEGER,new ColumnMapRowMapper()),
								   new SqlOutParameter("msgerror",OracleTypes.VARCHAR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idmantacciones", id)
														   .addValue("p_estado", 0);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAllByType(int type) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_mat_listar_por_tipo").withCatalogName("pkg_mant_crud_acciones")
				.declareParameters(new SqlOutParameter("p_cursor",OracleTypes.CURSOR,new ColumnMapRowMapper()),
								   new SqlParameter("p_tipo",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_tipo", type);
		System.out.println(type);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> readById(int id){
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
						 .withProcedureName("pr_mat_listar_por_id").withCatalogName("pkg_mant_crud_acciones")
						 .declareParameters(new SqlParameter("p_idmantacciones", Types.INTEGER),
								 			new SqlOutParameter("p_cursor", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idmantacciones", id);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> readByCat(){
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
						 .withProcedureName("pr_mat_listar_categorias").withCatalogName("pkg_mant_crud_acciones")
						 .declareParameters(new SqlOutParameter("p_cursor", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
