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

import com.musa2.dao.PropietariosDao;
import com.musa2.entity.Propietarios;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class PropietariosDaoImp implements PropietariosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Propietarios p) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_P.PR_CREAR_PROPIETARIOS(?,?,?);", p.getTipopropietario(),
				p.getEstado(), p.getIdpersona());	
	}
	@Override
	public int update(Propietarios p) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_PROPIETAIROS.PR_ACTUALIZAR_PROPIETARIOS(?,?,?,?);", p.getIdpropietario(),
				p.getTipopropietario(), p.getEstado(), p.getIdpersona());
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_PROPIETARIOS.PR_ELIMINAR_PROPIETARIOS(?);", id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_PROPIETARIOS_ID").withCatalogName("PKG_CV_CRUD_PROPIETARIOS")
				.declareParameters(new SqlOutParameter("pro",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDPROPIETARIO", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDPROPIETARIO", id);
		return  simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_PROPIETARIOS")
				.withCatalogName("PKG_CV_CRUD_PROPIETARIOS")
				.declareParameters(new SqlOutParameter("pro", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readnom() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_PROPIETARIOS")
				.withProcedureName("PR_LISTAR_NOMBRE")
				.declareParameters(new SqlOutParameter("con", OracleTypes
				.CURSOR,new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	
}
