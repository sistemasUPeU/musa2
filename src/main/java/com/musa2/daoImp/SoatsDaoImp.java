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
	public Map<String, Object> create(Soats so) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_CV_CRUD_SOAT")
				.withProcedureName("PR_CREAR_SOATS")
				.declareParameters(
						new SqlParameter("p_nrodocumento",Types.INTEGER), 
						new SqlParameter("p_nropoliza", Types.INTEGER),
						new SqlParameter("p_vigenciadesde", Types.DATE),
						new SqlParameter("p_vigenciahasta", Types.DATE),
						new SqlParameter("p_certificadodesde", Types.DATE),
						new SqlParameter("P_certificadohasta", Types.DATE),
						new SqlParameter("p_montoprima", Types.INTEGER),
						new SqlParameter("p_aseguradora", Types.VARCHAR),
						new SqlParameter("p_idvehiculo", Types.INTEGER),
						new SqlParameter("p_estado", Types.INTEGER)
						);
		SqlParameterSource in = new MapSqlParameterSource()
				.addValue("p_nrodocumento", so.getNrodocumento())
				.addValue("p_nropoliza", so.getNropoliza())
				.addValue("p_vigenciadesde", so.getVigenciadesde())
				.addValue("p_vigenciahasta", so.getVigenciahasta())
				.addValue("p_certificadodesde", so.getCertificadodesde())
				.addValue("P_certificadohasta", so.getCertificadohasta())
				.addValue("p_montoprima", so.getMontoprima())
				.addValue("p_aseguradora", so.getAseguradora())
				.addValue("p_idvehiculo", so.getIdvehiculo())
				.addValue("p_estado", so.getEstado())
				;
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> update(Soats so) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_CV_CRUD_SOAT")
				.withProcedureName("PR_ACTUALIZAR_SOATS")
				.declareParameters(
						new SqlParameter("p_idsoat",Types.INTEGER),
						new SqlParameter("p_nrodocumento",Types.INTEGER), 
						new SqlParameter("p_nropoliza", Types.INTEGER),
						new SqlParameter("p_vigenciadesde", Types.DATE),
						new SqlParameter("p_vigenciahasta", Types.DATE),
						new SqlParameter("p_certificadodesde", Types.DATE),
						new SqlParameter("P_certificadohasta", Types.DATE),
						new SqlParameter("p_montoprima", Types.INTEGER),
						new SqlParameter("p_aseguradora", Types.VARCHAR),
						new SqlParameter("p_idvehiculo", Types.INTEGER),
						new SqlParameter("p_estado", Types.INTEGER)
						);
		SqlParameterSource in = new MapSqlParameterSource()
				.addValue("p_idsoat", so.getIdsoat())
				.addValue("p_nrodocumento", so.getNrodocumento())
				.addValue("p_nropoliza", so.getNropoliza())
				.addValue("p_vigenciadesde", so.getVigenciadesde())
				.addValue("p_vigenciahasta", so.getVigenciahasta())
				.addValue("p_certificadodesde", so.getCertificadodesde())
				.addValue("P_certificadohasta", so.getCertificadohasta())
				.addValue("p_montoprima", so.getMontoprima())
				.addValue("p_aseguradora", so.getAseguradora())
				.addValue("p_idvehiculo", so.getIdvehiculo())
				.addValue("p_estado", so.getEstado())
				;
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> delete(Soats so) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_CV_CRUD_SOAT")
				.withProcedureName("PR_ELIMINAR_SOAT")
				.declareParameters(new SqlParameter("p_idsoat",Types.INTEGER), 
						           new SqlParameter("p_estado", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idsoat", so.getIdsoat())
				.addValue("p_estado",so.getEstado());
		return simpleJdbcCall.execute(in);
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
