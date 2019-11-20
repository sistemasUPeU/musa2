package com.musa2.daoImp;

import java.sql.Types;
import java.util.ArrayList;
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
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Repository;


import com.musa2.dao.RolesDao;
import com.musa2.entity.Roles;

import oracle.jdbc.OracleTypes;

@Repository
public class RolesDaoImp implements RolesDao{
	@Autowired
	private JdbcTemplate JdbcTemplate;
	private SimpleJdbcCall SimpleJdbcCall;
	@Override
	public int create(Roles r) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_SEG_CRUD_ROLES.pr_insertar_roles(?)", r.getNombre());

	}

	@Override
	public int update(Roles r) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_SEG_CRUD_ROLES.pr_modificar_roles(?,?,?)", r.getIdrol(), r.getNombre(), r.getEstado());

	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return JdbcTemplate.update("call PKG_SEG_CRUD_ROLES.pr_desactivar_roles(?)", id);

	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("pr_listar_roles_id").withCatalogName("PKG_SEG_CRUD_ROLES")
				.declareParameters(new SqlOutParameter("p_cur_rol",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_rol_id", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_rol_id", id);
		return SimpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readN(String nombre) {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("pr_listar_roles_nombre").withCatalogName("PKG_SEG_CRUD_ROLES")
				.declareParameters(new SqlOutParameter("p_cur_rol",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_nombre", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_nombre", nombre);
		return SimpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readE(int estado) {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("pr_listar_roles_estado").withCatalogName("PKG_SEG_CRUD_ROLES")
				.declareParameters(new SqlOutParameter("p_cur_rol",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("p_estado", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_estado", estado);
		return SimpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		SimpleJdbcCall = new SimpleJdbcCall(JdbcTemplate)
				.withProcedureName("pr_listar_roles")
				.withCatalogName("PKG_SEG_CRUD_ROLES")
				.declareParameters(new SqlOutParameter("p_cur_rol", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return SimpleJdbcCall.execute();
	}

	@Override
	public List<GrantedAuthority> readAllid(int idusuario) {
		List<GrantedAuthority> autores = new ArrayList<>();
		String SQL = "select u.idusuario, r.idrol, r.nombre from roles r, usuarios u, rol_usuarios ru where r.idrol=ru.idrol and ru.idusuario= u.idusuario and u.idusuario=?";
		List<Roles> roles = JdbcTemplate.query(SQL, new Object[]{idusuario}, new BeanPropertyRowMapper<Roles>(Roles.class));		
		for(int i=0;i<roles.size();i++) {
			autores.add(new SimpleGrantedAuthority(roles.get(i).getNombre()));
		}
		return autores;
	} 	

}
