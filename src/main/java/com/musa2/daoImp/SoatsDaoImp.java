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

import com.musa2.dao.SoatsDao;
import com.musa2.entity.Soats;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class SoatsDaoImp implements SoatsDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
  	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Soats so) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_SOAT.PR_CREAR_SOATS(?,?,?,?,?,?,?,?,?,?);", so.getNrodocumento(), so.getNropoliza(),
				so.getVigenciadesde(), so.getVigenciahasta(),so.getCertificadodesde(), so.getCertificadohasta(),
				so.getMontoprima(), so.getAseguradora(), so.getIdvehiculo(),
				so.getEstado());
	}
	@Override
	public int update(Soats so) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_SOAT.PR_ACTUALIZAR_SOATS(?,?,?,?,?,?,?,?,?,?,?);", so.getIdsoat(), so.getNrodocumento(), so.getNropoliza(),
				so.getVigenciadesde(), so.getVigenciahasta(),so.getCertificadodesde(), so.getCertificadohasta(), so.getMontoprima(), 
				so.getAseguradora(), so.getIdvehiculo(), so.getEstado());
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_SOAT.PR_ELMINAR_SOATS(?);", id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_SOATS_ID").withCatalogName("PKG_CV_CRUD_SOAT")
				.declareParameters(new SqlOutParameter("soat",OracleTypes.CURSOR,new ColumnMapRowMapper()), 
						new SqlParameter("P_IDSOAT", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_IDSOAT", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("PR_LISTAR_SOATS")
				.withCatalogName("PKG_CV_CRUD_SOAT")
				.declareParameters(new SqlOutParameter("soat", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
    
}
