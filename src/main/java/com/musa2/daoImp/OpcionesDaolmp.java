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

import com.musa2.dao.OpcionesDao;
import com.musa2.entity.Opciones;

import oracle.jdbc.OracleTypes;

@Repository
public class OpcionesDaolmp implements OpcionesDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> create(Opciones o) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SEG_CRUD_OPCIONES").withProcedureName("pr_insertar_opciones")
				.declareParameters(new SqlParameter("p_idpadre",Types.INTEGER),
						new SqlParameter("p_nombre",Types.VARCHAR),
						new SqlParameter("p_descripcion",Types.VARCHAR),
						new SqlParameter("p_enlace",Types.VARCHAR),
						new SqlParameter("p_icono",Types.VARCHAR),
						new SqlParameter("p_tipo",Types.INTEGER),
						new SqlParameter("p_orden",Types.INTEGER),
						new SqlParameter("p_estado",Types.INTEGER),
						new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_opcion_id",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idpadre",o.getIdpadre())
															.addValue("p_nombre", o.getNombre())
															.addValue("p_descripcion", o.getDescripcion())
															.addValue("p_enlace", o.getEnlace())
															.addValue("p_icono", o.getIcono())
															.addValue("p_tipo", o.getTipo())
															.addValue("p_orden", o.getOrden())
															.addValue("p_estado", o.getEstado());
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> update(Opciones o) {
		// TODO Auto-generate d method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SEG_CRUD_OPCIONES").withProcedureName("pr_modificar_opciones")
				.declareParameters(new SqlParameter("p_idpadre",Types.INTEGER),
						new SqlParameter("p_nombre",Types.VARCHAR),
						new SqlParameter("p_descripcion",Types.VARCHAR),
						new SqlParameter("p_enlace",Types.VARCHAR),
						new SqlParameter("p_icono",Types.VARCHAR),
						new SqlParameter("p_tipo",Types.INTEGER),
						new SqlParameter("p_orden",Types.INTEGER),
						new SqlParameter("p_estado",Types.INTEGER),
						new SqlOutParameter("p_error",OracleTypes.INTEGER, new ColumnMapRowMapper()), 
						new SqlParameter("p_opcion_id",Types.INTEGER), 
						new SqlOutParameter("p_msgerror",OracleTypes.VARCHAR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idpadre",o.getIdpadre())
															.addValue("p_nombre", o.getNombre())
															.addValue("p_descripcion", o.getDescripcion())
															.addValue("p_enlace", o.getEnlace())
															.addValue("p_icono", o.getIcono())
															.addValue("p_tipo", o.getTipo())
															.addValue("p_orden", o.getOrden())
															.addValue("p_estado", o.getEstado())
		.addValue("p_opcion_id",o.getIdopcion());
		return simpleJdbcCall.execute(in);
	}

	public Map<String, Object> delete(Opciones o) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SEG_CRUD_OPCIONES")
				.withProcedureName("pr_desactivar_opciones")
				.declareParameters(new SqlParameter("p_opcion_id",Types.INTEGER)
						, new SqlParameter("p_estado", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource()
				.addValue("p_opcion_id", o.getIdopcion())
		.addValue("p_estado", o.getEstado());
		return simpleJdbcCall.execute(in);	
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_SEG_CRUD_OPCIONES")
				.withProcedureName("pr_listar_opciones_id")
				.declareParameters(new SqlOutParameter("hola1",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_OPCION_ID ",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_OPCION_ID", id);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> readn(int nombre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_opciones_nombre").withCatalogName("PKG_SEG_CRUD_OPCIONES")
				.declareParameters(new SqlOutParameter("hola2",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_nombre ",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_nombre ", nombre);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> reade(int estado) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_opciones_estado").withCatalogName("PKG_SEG_CRUD_OPCIONES")
				.declareParameters(new SqlOutParameter("hola3",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_ESTADO",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_ESTADO", estado);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> readt(int tipo) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_opciones_tipo").withCatalogName("PKG_SEG_CRUD_OPCIONES")
				.declareParameters(new SqlOutParameter("hola4",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_tipo ",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_tipo ", tipo);
		return simpleJdbcCall.execute(in);
	}
	
	public Map<String, Object> readp(int idpadre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_opciones_padreid").withCatalogName("PKG_SEG_CRUD_OPCIONES")
				.declareParameters(new SqlOutParameter("hola5",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_idpadre ",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idpadre ", idpadre);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_opciones")
				.withCatalogName("PKG_SEG_CRUD_OPCIONES")
				.declareParameters(new SqlOutParameter("p_cur_opciones", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public Map<String, Object> obtenerOpciones(int idusuario) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_SEG_CRUD_OPCIONES")
				.withProcedureName("pr_obtenerOpciones")
				.declareParameters(new SqlOutParameter("p_cur_opcion",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_idusuario ",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idusuario", idusuario);
		return simpleJdbcCall.execute(in);
		
	}

}
