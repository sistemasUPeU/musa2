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
	public int create(Personas P) {
		
		return  jdbcTemplate.update("call PKG_CRUD_personas.PR_CREAR_PERSONAS(?,?,?,?,?,?,?,?,?,?,?,?);",P.getNombre(),P.getApellido(),P.getTipodoc(),P.getNrodoc(),P.getSexo(),P.getFechanac(),
				P.getDireccion(),P.getEstado(),P.getTelefono(),P.getUsercreate(),P.getDatecreate(),P.getIdubigeo());
	}

	@Override
	public int update(Personas P) {
		
		return jdbcTemplate.update("call PKG_CRUD_personas.PR_ACTUALIZAR_PERSONAS(?,?,?,?,?,?,?,?,?,?,?,?,?)",P.getIdpersona(),P.getNombre(),P.getApellido(),P.getTipodoc(),P.getNrodoc(),P.getSexo(),P.getFechanac(),
				P.getDireccion(),P.getEstado(),P.getTelefono(),P.getUsermodify(),P.getDatemodify(),P.getIdubigeo());
	}

	@Override
	public int delete(int id) {
		
		return jdbcTemplate.update("call PKG_CRUD_personas.PR_ELIMINAR_PERSONAS(?)",id);
	}

	@Override
	public Map<String,Object> read(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_PERSONAS_ID").withCatalogName("PKG_CRUD_personas")
				.declareParameters(new SqlOutParameter("pers",OracleTypes.CURSOR,new ColumnMapRowMapper()), new SqlParameter("P_IDPERSONA", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDPERSONA", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_PERSONAS")
				.withCatalogName("PKG_CRUD_personas")
				.declareParameters(new SqlOutParameter("pers", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
