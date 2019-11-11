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

import com.musa2.dao.RequisitosDao;
import com.musa2.entity.Requisitos;

import oracle.jdbc.OracleTypes;

@Repository
public class RequisitosDaoImp implements RequisitosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Requisitos requisito) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_cv_crud_requisitos.pa_mat_requisitos_ins(?,?)",requisito.getNombre(), requisito.getTiporequisito());
	}

	@Override
	public int edit(Requisitos requisito) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_cv_crud_requisitos.pa_mat_requisitos_upd(?,?,?,?)",requisito.getIdrequisito(),requisito.getNombre(),requisito.getEstado(),requisito.getTiporequisito());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		//return jdbcTemplate.update("call pkg_requisitos.pa_mat_requisitos_del(?)",id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_requisitos")
				.withProcedureName("pa_mat_requisitos_del");
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_requisitoid", id);
		Map<String, Object> out = simpleJdbcCall.execute(in);
		System.out.println("p_error: " + out.get("p_error"));
		System.out.println("p_msgerror: " + out.get("p_msgerror"));
		return 1;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		System.out.println("No debr¿eria entrar : " + id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_requisitos")
				.withProcedureName("pa_mat_requisitos_get")
				.declareParameters(new SqlOutParameter("req", OracleTypes
				.CURSOR, new ColumnMapRowMapper()), new SqlParameter("p_requisitoid", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_requisitoid", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> lista() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_requisitos")
				.withProcedureName("pa_mat_requisitos_lis")
				.declareParameters(new SqlOutParameter("req", OracleTypes
				.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> list(int tipo) {
		System.out.println("tipo: " + tipo);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pkg_cv_crud_requisitos")
				.withProcedureName("pa_mat_requisitos_lis_por_tipo")
				.declareParameters(new SqlOutParameter("req", OracleTypes
				.CURSOR, new ColumnMapRowMapper()), 
						new SqlParameter("p_tiporequisito", Types.INTEGER),
						new SqlOutParameter("p_error",OracleTypes.INTEGER,new ColumnMapRowMapper()),
						new SqlOutParameter("msgerror",OracleTypes.VARCHAR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_tiporequisito", tipo);
		return simpleJdbcCall.execute(in);
	}


}
