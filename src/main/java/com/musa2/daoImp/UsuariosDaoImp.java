package com.musa2.daoImp;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.musa2.dao.UsuariosDao;
import com.musa2.entity.Usuarios;

import oracle.jdbc.OracleTypes;

@Repository
public class UsuariosDaoImp implements UsuariosDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(Usuarios U) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_USUARIOS.PR_CREAR_USUARIOS(?,?,?,?)", U.getLogin(), new BCryptPasswordEncoder().encode((U.getPassword())),
				U.getIdpersona(), U.getUser_create());
	}
	
	

	@Override
	public int update(Usuarios U) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_USUARIOS.PR_ACTUALIZAR_USUARIOS(?,?,?,?,?)", U.getIdusuario(),
				U.getLogin(), new BCryptPasswordEncoder().encode((U.getPassword())), U.getIdpersona(), U.getUser_modify());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_USUARIOS.PR_DESACTIVAR_USUARIOS(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("PR_LISTAR_USUARIOS_ID")
				.withCatalogName("PKG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("usu", OracleTypes.CURSOR, new ColumnMapRowMapper()),
						new SqlParameter("P_IDUSUARIO", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDUSUARIO", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("PR_LISTAR_USUARIOS")
				.withCatalogName("PKG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	/*@Override
	public Map<String, Object> validar_login(Usuarios U) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("PR_VALIDAR_LOGIN")
				.withCatalogName("PKG_CRUD_USUARIOS").declareParameters(new SqlParameter("P_LOGIN", Types.VARCHAR),
						new SqlParameter("P_PASSWORD", Types.VARCHAR),
						new SqlOutParameter("USUARIO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_LOGIN", U.getLogin()).addValue("P_PASSWORD",
				bcryptPasswordEncoder.encode(U.getPassword()));
		Map out = simpleJdbcCall.execute(in);
		List<Map<String, Object>> hola = (List<Map<String, Object>>) out.get("USUARIO");
		 java.math.BigDecimal r = (java.math.BigDecimal) out.get("RESULTADO"); 
		return hola.get(0);
	}*/

	@Override
	public Map<String, Object> readN(String nombre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_USUARIOS_APELLIDOS").withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_APELLIDO", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_APELLIDO", nombre);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readR(String rol) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_USUARIOS_ROLES").withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_ROLES", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_ROLES", rol);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readE(int estado) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_USUARIOS_ESTADO").withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_ESTADO", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_ESTADO", estado);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readPer() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_PER")
				.withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readPerN(String nombre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_PER_NAME").withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_NAME", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_NAME", nombre);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readUser() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_USU")
				.withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readRolus() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_ROLUSU")
				.withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readUse() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_USUL")
				.withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> readUseN(String login) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_USUL_NAME").withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_NAME", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_NAME", login);
		return simpleJdbcCall.execute(in);
	}

	/*@Override
	public Map<String, Object> validar_nom_user(String login) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("PR_VALIDAR_NOM_USER")
				.withCatalogName("PKG_CRUD_USUARIOS").declareParameters(new SqlParameter("P_LOGIN", Types.VARCHAR),
						new SqlOutParameter("USUARIO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_LOGIN", login);
		Map out = simpleJdbcCall.execute(in);
		List<Map<String, Object>> lista = (List<Map<String, Object>>) out.get("USUARIO");
		return lista.get(0);
	}*/

	@Override
	@Transactional(readOnly = true)
	public Usuarios validarUsuario(String username) {
		// TODO Auto-generated method stub
		String SQL = "SELECT *FROM USUARIOS WHERE LOGIN =? and estado=1";
		Usuarios user = new Usuarios();
		user = (Usuarios)jdbcTemplate.queryForObject(SQL, new Object[]{username}, BeanPropertyRowMapper.newInstance(Usuarios.class));
		return user;
	}
	
	@Override
	public Map<String, Object> datosUsuario(String username) {
		// TODO Auto-generated method stub
		String SQL = "select p.idpersona as idpersona, p.nombre as nombres, p.apellido as apellidos ,r.detalle as rol, r.nombre as nom_rol from personas p, usuarios u ,roles r , rol_usuarios ru where p.idpersona = u.idpersona and r.idrol=ru.idrol and u.IDUSUARIO=ru.IDUSUARIO and u.login=?";
		Map<String, Object> map= jdbcTemplate.queryForMap(SQL, username);
		return map;
	}

}
