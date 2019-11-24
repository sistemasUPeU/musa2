package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.VentasDao;
import com.musa2.entity.Ventas;
import com.musa2.service.VentasService;

@Service
public class VentasServiceImp implements VentasService{
	@Autowired
	private VentasDao ventasDao;
	@Override
	public Map<String, Object> create(Ventas venta) {
		// TODO Auto-generated method stub
		return ventasDao.create(venta);
	}

	@Override
	public Map<String, Object> update(Ventas venta) {
		// TODO Auto-generated method stub
		return ventasDao.update(venta);
	}

	@Override
	public Map<String, Object> updateState(Ventas venta) {
		// TODO Auto-generated method stub
		return ventasDao.updateState(venta);
	}

	@Override
	public Map<String, Object> read(int idc, int idv) {
		// TODO Auto-generated method stub
		return ventasDao.read(idc, idv);
	}

	@Override
	public Map<String, Object> readAll(int idc, int estado) {
		// TODO Auto-generated method stub
		return ventasDao.readAll(idc, estado);
	}

}
