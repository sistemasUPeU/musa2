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
		return jdbcTemplate.update("call PKG_CRUD_USUARIOS.PR_CREAR_USUARIOS(?,?,?,?)",U.getLogin(),U.getPassword(),
				U.getIdpersona(),U.getUser_create());
	}

	@Override
	public int update(Usuarios U) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_USUARIOS.PR_ACTUALIZAR_USUARIOS(?,?,?,?,?)",U.getIdusuario(),U.getLogin(),U.getPassword(),
				U.getIdpersona(),U.getUser_modify());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_USUARIOS.PR_DESACTIVAR_USUARIOS(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_USUARIOS_ID").withCatalogName("PKG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("usu",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDUSUARIO", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDUSUARIO", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_USUARIOS")
				.withCatalogName("PKG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("usu", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public int validar_login(Usuarios U) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_VALIDAR_LOGIN")
				.withCatalogName("PKG_CRUD_USUARIOS")
				.declareParameters(new SqlParameter("P_LOGIN", Types.VARCHAR), new SqlParameter("P_PASSWORD", Types.VARCHAR)
						,new SqlOutParameter("RESULTADO", OracleTypes.NUMBER, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_LOGIN", U.getLogin()).addValue("P_PASSWORD", U.getPassword());
		Map<String,Object> out = simpleJdbcCall.execute(in);
		java.math.BigDecimal r = (java.math.BigDecimal) out.get("RESULTADO");
		return r.intValue(); 
	}

}
