package com.musa2.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa2.dao.VinculosRequisitosDao;
import com.musa2.entity.VinculosRequisitos;

@Repository
public class VinculosRequisitosDaoImp implements VinculosRequisitosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int insertar(int idvinculo,int tiporequisitos) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_VINCULO_REQUISITO.pa_mat_vinculosrequisitos_ins(?,?)", idvinculo, tiporequisitos);
	}

	@Override
	public int update(int idvinculo,int idrequisito) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CV_CRUD_VINCULO_REQUISITO.pa_mat_vinculosrequisitos_upt(?,?)", idvinculo,idrequisito);
	}

}
