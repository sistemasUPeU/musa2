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

import com.musa2.dao.Rol_UsuariosDao;
import com.musa2.entity.Rol_Usuarios;

import oracle.jdbc.OracleTypes;
@Repository
public class Rol_UsuariosDaoImp implements Rol_UsuariosDao {
	@Autowired
	private JdbcTemplate JdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createru(Rol_Usuarios ru) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_CRUD_USUARIOS.PR_CREAR_ROLUSUARIOS(?,?,?)", ru.getIdrol(), ru.getIdusuario(), ru.getUser_create());
	}
	@Override
	public Map<String, Object> readL(String login) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_LISTAR_ROLUSU_USER").withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_USER", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_USER", login);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readE(int estado) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("PR_LISTAR_ROLUSU_ESTADO").withCatalogName("PKG_SEG_CRUD_USUARIOS")
				.declareParameters(new SqlOutParameter("P_CURSOR_USUARIO",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_USES", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_USES", estado);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public int delete(int idrol, int idusuario, String user_modify) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_SEG_CRUD_USUARIOS.PR_ELIMINAR_ROLES_USUARIO(?,?,?)",idrol, idusuario, user_modify);
	}
	@Override
	public int update(Rol_Usuarios rol_Usuarios) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_SEG_CRUD_USUARIOS.PR_MODIFICAR_ROLES_USUARIO(?,?,?,?)", rol_Usuarios.getIdrol(), rol_Usuarios.getIdusuario(), rol_Usuarios.getEstado(), rol_Usuarios.getUser_modify());
	}
	@Override
	public Map<String, Object> read(int idrol, int idusuario) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int activar(int idrol, int idusuario, String user_modify) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_SEG_CRUD_USUARIOS.PR_ACTIVAR_ROLES_USUARIO(?,?,?)",idrol, idusuario, user_modify);
	}
}
