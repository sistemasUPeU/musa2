package com.musa2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.MantenimientoDao;
import com.musa2.entity.Mantenimiento;
import com.musa2.service.MantenimientoService;

@Service
public class MantenimientoServiceImp implements MantenimientoService{

	@Autowired
	private MantenimientoDao mantenimientoDao;

	@Override
	public Map<String, Object> create(Mantenimiento m) {
		// TODO Auto-generated method stub
		return mantenimientoDao.create(m);
	}

	@Override
	public Map<String, Object> update(Mantenimiento m) {
		// TODO Auto-generated method stub
		return mantenimientoDao.update(m);
	}

	@Override
	public Map<String, Object> updateState(int state, int id, int idempleado) {
		// TODO Auto-generated method stub
		return mantenimientoDao.updateState(state, id, idempleado);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return mantenimientoDao.read(id);
	}

	@Override
	public Map<String, Object> readAllByType(int type) {
		// TODO Auto-generated method stub
		return mantenimientoDao.readAllByType(type);
	}

	@Override
	public Map<String, Object> readAllDetaByMantId(int id) {
		// TODO Auto-generated method stub
		return mantenimientoDao.readAllDetaByMantId(id);
	}

	@Override
	public Map<String, Object> addDetalle(int idm, int ida) {
		// TODO Auto-generated method stub
		return mantenimientoDao.addDetalle(idm, ida);
	}

	@Override
	public Map<String, Object> updateDetaState(int idm, int ida, int state) {
		// TODO Auto-generated method stub
		return mantenimientoDao.updateDetaState(idm, ida, state);
	}
	
	

}
