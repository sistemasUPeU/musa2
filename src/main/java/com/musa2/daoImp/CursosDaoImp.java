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

import com.musa2.dao.CursosDao;
import com.musa2.entity.Cursos;

import oracle.jdbc.OracleTypes;

@Repository
public class CursosDaoImp implements CursosDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(Cursos cursos) {
		// TODO Auto-generated method stub
		System.out.println(cursos.getNombrecurso()+" "+cursos.getNombreinstitucion()+" "+cursos.getLugar()+" "+cursos.getFechainicio()+" "+cursos.getFechafin());
		return jdbcTemplate.update("call pkg_cv_crud_cursos.pr_crear_cursos(?,?,?,?,?);",cursos.getNombrecurso(),cursos.getNombreinstitucion(),cursos.getLugar(),cursos.getFechainicio(),cursos.getFechafin());
	}

	@Override
	public int update(Cursos cursos) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_cv_crud_cursos.pr_actualizar_cursos(?,?,?,?,?,?,?);",cursos.getIdcursos(),cursos.getNombrecurso(),cursos.getNombreinstitucion(),cursos.getLugar(),
				cursos.getFechainicio(),cursos.getFechafin(),cursos.getEstado());
	
	
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_cv_crud_cursos.pr_eliminar_cursos(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_cursos")
				.withProcedureName("pr_listar_cursos_id")
				.declareParameters(new SqlOutParameter("cur", OracleTypes
				.CURSOR, new ColumnMapRowMapper()), new SqlParameter("p_idcursos", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idcursos", id);
		return simpleJdbcCall.execute(in);
	}


	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_cursos")
				.withCatalogName("pkg_cv_crud_cursos")
				.declareParameters(new SqlOutParameter("cur", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> read(String nombrecurso) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_cursos")
				.withProcedureName("pr_listar_cursos_nombrecurso")
				.declareParameters(new SqlOutParameter("cur", OracleTypes
				.CURSOR, new ColumnMapRowMapper()), new SqlParameter("p_nombrecurso", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_nombrecurso", nombrecurso);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> findCursosByNombre(int nombrecurso) {
			// TODO Auto-generated method stub
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
					.withProcedureName("pr_buscar_nombrecurso")
					.withCatalogName("PKG_CV_CRUD_CURSOS")
					.declareParameters(new SqlOutParameter("pers", OracleTypes.CURSOR, new ColumnMapRowMapper()));
			SqlParameterSource in = new MapSqlParameterSource().addValue("p_nombrecurso",nombrecurso);
			return simpleJdbcCall.execute(in);
		}

	}

	