package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.DetalleVentaDao;
import com.musa2.entity.Detalle_Venta;
import com.musa2.service.DetalleVentaService;

@Service
public class DetalleVentaServiceImp implements DetalleVentaService{
	@Autowired
	private DetalleVentaDao detalleventaDao;
	@Override
	public Map<String, Object> create(Detalle_Venta dventa) {
		// TODO Auto-generated method stub
		return detalleventaDao.create(dventa);
	}

	@Override
	public Map<String, Object> update(Detalle_Venta dventa) {
		// TODO Auto-generated method stub
		return detalleventaDao.update(dventa);
	}

	@Override
	public Map<String, Object> delete(int iddv, int idp) {
		// TODO Auto-generated method stub
		return detalleventaDao.delete(iddv, idp);
	}

	@Override
	public Map<String, Object> readAll(int iddv) {
		// TODO Auto-generated method stub
		return detalleventaDao.readAll(iddv);
	}

}
