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

import com.musa2.dao.Usuarios_OpcionesDao;
import com.musa2.entity.Usuarios_Opciones;

import oracle.jdbc.OracleTypes;

@Repository
public class Usuarios_OpcionesDaoImp implements Usuarios_OpcionesDao{
	@Autowired
	private JdbcTemplate JdbcTemplate;
	private SimpleJdbcCall SimpleJdbcCall;
	@Override
	public int create(Usuarios_Opciones up) {
		// TODO Auto-generated method stub
		 return JdbcTemplate.update("call PKG_SEG_ASIGNAR_OPCIONES_USU.PR_ASIGNAR_OPCIONES_USUARIO(?,?,?,?)", up.getIdopcion(), up.getIdopcion2(),up.getIdusuario(),
				up.getUser_create());
		
		
	}

	@Override
	public int update(Usuarios_Opciones up) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_SEG_ASIGNAR_OPCIONES_USU.PR_MODIFICAR_OPCIONES_USUARIO(?,?,?,?)", up.getIdusuario(), up.getIdopcion(), up.getEstado(), up.getUser_modify());
	}

	@Override
	public int delete(int idusuario, int idopcion, String user_modify) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_SEG_ASIGNAR_OPCIONES_USU.PR_ELIMINAR_OPCIONES_USUARIO(?,?,?)",idusuario, idopcion, user_modify);
	}


	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_LISTAR_OPCIONES_USUARIO")
				.withCatalogName("PKG_SEG_ASIGNAR_OPCIONES_USU")
				.declareParameters(new SqlOutParameter("p_opsu", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();
	}

	

	@Override
	public Map<String, Object> readN(String login) {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_LISTAR_OPSU_NOMBRE").withCatalogName("PKG_SEG_ASIGNAR_OPCIONES_USU")
				.declareParameters(new SqlOutParameter("p_opsu",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_nombre", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_nombre", login);
		return SimpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readE(int estado) {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_LISTAR_OPSU_ESTADO").withCatalogName("PKG_SEG_ASIGNAR_OPCIONES_USU")
				.declareParameters(new SqlOutParameter("p_opsu",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_estado", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_estado", estado);
		return SimpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> opcion1() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_OPCION1")
				.withCatalogName("PKG_SEG_ASIGNAR_OPCIONES_USU")
				.declareParameters(new SqlOutParameter("p_opsu", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> opc2(int idopcion2) {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_OPCION2").withCatalogName("PKG_SEG_ASIGNAR_OPCIONES_USU")
				.declareParameters(new SqlOutParameter("p_opsu",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_opcion", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_opcion", idopcion2);
		return SimpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> op3(int idopcion3) {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_OPCION3").withCatalogName("PKG_SEG_ASIGNAR_OPCIONES_USU")
				.declareParameters(new SqlOutParameter("p_opsu",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_opcion", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_opcion", idopcion3);
		return SimpleJdbcCall.execute(in);
	}

	@Override
	public int activar(int idusuario, int idopcion, String user_modify) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_SEG_ASIGNAR_OPCIONES_USU.PR_ACTIVAR_OPCIONES_USUARIO(?,?,?)",idusuario, idopcion, user_modify);
	}
	
}