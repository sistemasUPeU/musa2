package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.ReportesDao;
import com.musa2.service.ReportesService;

@Service
public class ReportesServiceImp implements ReportesService{
	@Autowired
	private ReportesDao reportesDao;
	@Override
	public Map<String, Object> buses() {
		// TODO Auto-generated method stub
		return reportesDao.buses();
	}

	@Override
	public Map<String, Object> usuaios() {
		// TODO Auto-generated method stub
		return reportesDao.usuaios();
	}

	@Override
	public Map<String, Object> conductores() {
		// TODO Auto-generated method stub
		return reportesDao.conductores();
	}

	@Override
	public Map<String, Object> opro() {
		// TODO Auto-generated method stub
		return reportesDao.opro();
	}

	@Override
	public Map<String, Object> usro() {
		// TODO Auto-generated method stub
		return reportesDao.usro();
	}

	@Override
	public Map<String, Object> pedidosR() {
		// TODO Auto-generated method stub
		return reportesDao.pedidosR();
	}

	@Override
	public Map<String, Object> pedidosE() {
		// TODO Auto-generated method stub
		return reportesDao.pedidosE();
	}

	@Override
	public Map<String, Object> pedidosA() {
		// TODO Auto-generated method stub
		return reportesDao.pedidosA();
	}

	@Override
	public Map<String, Object> Vinculo() {
		// TODO Auto-generated method stub
		return reportesDao.Vinculo();
	}

	@Override
	public Map<String, Object> Propietario() {
		// TODO Auto-generated method stub
		return reportesDao.Propietario();
	}

	@Override
	public Map<String, Object> MantR() {
		// TODO Auto-generated method stub
		return reportesDao.MantR();
	}

	@Override
	public Map<String, Object> MantV() {
		// TODO Auto-generated method stub
		return reportesDao.MantV();
	}

	@Override
	public Map<String, Object> RevisionesD() {
		// TODO Auto-generated method stub
		return reportesDao.RevisionesD();
	}
	
	
}
