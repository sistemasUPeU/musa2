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

import com.musa2.dao.PersonasDao;
import com.musa2.entity.Personas;

import oracle.jdbc.OracleTypes;

@Repository
public class PersonasDaoImp implements PersonasDao {
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Personas per) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_PERSONAS.PR_CREAR_PERSONAS(?,?,?,?,?,?,?,?,?,?,?,?,?)",per.getNombre(),per.getApellido(),
				per.getTipodoc(),per.getNrodoc(),per.getSexo(),per.getFechanac(),per.getDireccion(),per.getEstado(),per.getTelefono(),per.getUsercreate(),per.getDatecreate(),per.getIdubigeo(),per.getError());
	}

	@Override
	public int update(Personas per) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_PERSONAS.PR_ACTUALIZAR_PERSONAS(?,?,?,?,?,?,?,?,?,?,?,?,?)",per.getIdpersonas(),per.getNombre(),per.getApellido(),per.getTipodoc(),per.getNrodoc(),
				per.getSexo(),per.getFechanac(),per.getDireccion(),per.getEstado(),per.getTelefono(),per.getUsermodify(),per.getDatemodify(),per.getIdubigeo());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_PERSONAS.PR_ELIMINAR_PERSONAS(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_PERSONAS_ID").withCatalogName("PKG_CRUD_PERSONAS")
				.declareParameters(new SqlOutParameter("pers",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDPERSONA", Types.INTEGER)); 
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDPERSONA", id);
		return  simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_PERSONAS")
				.withCatalogName("PKG_CRUD_PERSONAS")
				.declareParameters(new SqlOutParameter("pers", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> findUbigeoByDocumento(int nrodoc) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_BUSCAR_PERSONAS")
				.withCatalogName("PKG_CRUD_PERSONAS")
				.declareParameters(new SqlOutParameter("pers", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_NRODOC",nrodoc);
		return simpleJdbcCall.execute(in);
	}

}
