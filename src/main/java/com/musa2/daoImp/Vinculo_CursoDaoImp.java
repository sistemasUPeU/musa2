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

import com.musa2.dao.Vinculo_CursoDao;
import com.musa2.entity.Vinculo_Curso;

import oracle.jdbc.OracleTypes;

@Repository
public class Vinculo_CursoDaoImp implements Vinculo_CursoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Vinculo_Curso vc) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_cv_crud_cursos_conductores.pr_crear_vc(?,?,?,?,?,?)",vc.getIdcurso(),vc.getIdconductor(),vc.getFechaemision(),vc.getFechacaducidad(),vc.getResultado(),vc.getUsercreate());
	}
	@Override
	public int update(Vinculo_Curso vc) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_cv_crud_cursos_conductores.pr_editar_vc(?,?,?,?,?,?,?)",vc.getCurso(),vc.getConductor(),vc.getIdcurso(),vc.getIdconductor(),vc.getFechaemision(),vc.getFechacaducidad(),vc.getResultado());
	}
	@Override
	public int delete(int id, int x) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_cv_crud_cursos_conductores.pr_eliminar_vc(?,?)",id,x);
	}
	@Override
	public Map<String, Object> read(int idcurso, int idconductor) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_cursos_conductores")
				.withProcedureName("pr_listar_id_vc")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes
				.CURSOR, new ColumnMapRowMapper()), new SqlParameter("p_idcursos", Types.INTEGER), new SqlParameter("p_idconductor",Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idcursos", idcurso).addValue("p_idconductor", idconductor);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub	
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_cursos_conductor")
				.withCatalogName("PKG_CV_CRUD_CURSOS_CONDUCTORES")
				.declareParameters(new SqlOutParameter("p_cursor", OracleTypes.CURSOR, new ColumnMapRowMapper()),
									new SqlOutParameter("p_cursor2", OracleTypes.CURSOR, new ColumnMapRowMapper())
									);
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readNombre(String nombrecurso) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_conductores_por_curs")
				.withCatalogName("PKG_CV_CRUD_CURSOS_CONDUCTORES")
				.declareParameters(new SqlOutParameter("curvin", OracleTypes.CURSOR, new ColumnMapRowMapper()),new SqlParameter("p_idcurso",Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idcurso", nombrecurso);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readSelectcur() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_select_cursos")
				.withCatalogName("PKG_CV_CRUD_CURSOS_CONDUCTORES")
				.declareParameters(new SqlOutParameter("p_cursor", OracleTypes.CURSOR, new ColumnMapRowMapper())
									);
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> readSelectcon() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_listar_select_conductores")
				.withCatalogName("PKG_CV_CRUD_CURSOS_CONDUCTORES")
				.declareParameters(new SqlOutParameter("p_cursor", OracleTypes.CURSOR, new ColumnMapRowMapper())
									);
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> name(String nombrecurso) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("pr_buscar_nom_cur")
				.withCatalogName("PKG_CV_CRUD_CURSOS_CONDUCTORES")
				.declareParameters(new SqlOutParameter("P_CURSOR", OracleTypes.CURSOR, new ColumnMapRowMapper()),new SqlParameter("P_NOMBRECURSO",Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_NOMBRECURSO", nombrecurso);
		return simpleJdbcCall.execute(in);
	}
	

}