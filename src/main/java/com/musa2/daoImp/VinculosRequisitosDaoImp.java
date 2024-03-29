package com.musa2.daoImp;

import java.sql.Types;
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
import org.springframework.stereotype.Repository;

import com.musa2.dao.VinculosRequisitosDao;
import com.musa2.entity.VinculosRequisitos;

import oracle.jdbc.OracleTypes;

@Repository
public class VinculosRequisitosDaoImp implements VinculosRequisitosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int insertar(int tiporequisitos,int vincurequi) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_VINCULO_REQUISITO.pa_mat_vinculosrequisitos_ins(?,?)", tiporequisitos,vincurequi);
	}

	@Override
	public int update(int idvinculo,int idrequisito, String enlace) {
		// TODO Auto-generated method stub
		System.out.println(idvinculo+" asd "+idrequisito);
		return jdbcTemplate.update("call PKG_CV_CRUD_VINCULO_REQUISITO.pa_mat_vinculosrequisitos_upt(?,?,?)", idvinculo,idrequisito,enlace);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CV_CRUD_VINCULO_REQUISITO")
				.withProcedureName("pa_mat_vinculosrequisitos_lis")
				.declareParameters(
						new SqlOutParameter("vin", OracleTypes.CURSOR, new ColumnMapRowMapper()),
						new SqlParameter("p_idvinculo", Types.INTEGER),
						new SqlOutParameter("vin",OracleTypes.CURSOR,new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("p_idvinculo", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_VINCULO_REQUISITO.pa_mat_vinculosrequisitos_del(?)", id);
	}

	@Override
	public VinculosRequisitos listarid(int idv, int idr) {
		// TODO Auto-generated method stub
		String sql = " select * from vinculos_requisitos where idvinculo = ? and idrequisito = ? ";
		
		VinculosRequisitos vinrequi = new VinculosRequisitos();
		vinrequi=jdbcTemplate.queryForObject(sql, new Object[]{idv,idr}, new BeanPropertyRowMapper<>(VinculosRequisitos.class));
		vinrequi.setIdrequisitos(idr);
		System.out.println(idv+" vinrequi "+idr);
		return vinrequi;
	}

	@Override
	public int update(VinculosRequisitos vincurequi) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_VINCULO_REQUISITO.pa_mat_vinculosrequisitos_upt(?,?,?)", vincurequi.getIdvinculo(),vincurequi.getIdrequisitos(),vincurequi.getEnlacedoc());
	}


}
