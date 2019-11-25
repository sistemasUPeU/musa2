package com.musa2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.RequisitosDao;
import com.musa2.entity.Requisitos;
import com.musa2.service.RequisitosService;


@Service
public class RequisitosServiceImp implements RequisitosService{
	@Autowired
	private RequisitosDao requisitosDao;
	@Override
	public int create(Requisitos requisito) {
		// TODO Auto-generated method stub
		return requisitosDao.create(requisito);
	}

	@Override
	public int edit(Requisitos requisito) {
		// TODO Auto-generated method stub
		return requisitosDao.edit(requisito);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return requisitosDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return requisitosDao.read(id);
	}

	@Override
	public Map<String, Object> lista() {
		// TODO Auto-generated method stub
		return requisitosDao.lista();
	}


}
