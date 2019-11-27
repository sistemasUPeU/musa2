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
	public Map<String, Object> create(Requisitos requisito) {
		// TODO Auto-generated method stub
		return requisitosDao.create(requisito);
	}

	@Override
	public  Map<String, Object> update(Requisitos r) {
		// TODO Auto-generated method stub
		return requisitosDao.update(r);
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
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return requisitosDao.readAll();
	}

	@Override
	public Map<String, Object> list(int tipo) {
		// TODO Auto-generated method stub
		System.out.println("llego al servicio " + tipo);
		return requisitosDao.list(tipo);
	}

	@Override
	public Map<String, Object> buscar_tipo(String tiporequisito) {
		// TODO Auto-generated method stub
		return requisitosDao.buscar_tipo(tiporequisito);
	}
}
