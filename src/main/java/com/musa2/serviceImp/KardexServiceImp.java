package com.musa2.serviceImp;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.KardexDao;
import com.musa2.entity.Kardex;
import com.musa2.service.KardexService;

@Service
public class KardexServiceImp implements KardexService {
	@Autowired
	private KardexDao kardexDao;
	@Override
	public int create(Kardex kar) {
		// TODO Auto-generated method stub
		return kardexDao.create(kar) ;
	}

	@Override
	public int update(Kardex kar) {
		// TODO Auto-generated method stub
		return kardexDao.update(kar);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return kardexDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return kardexDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return kardexDao.readAll();
	}

	@Override
	public Map<String, Object> findKardexByComprobante(int nrocomprobante) {
		// TODO Auto-generated method stub
		return kardexDao.findKardexByComprobante(nrocomprobante);
	}

	@Override
	public Map<String, Object> buscarKardexByIdKardexProducto(int idkardex) {
		// TODO Auto-generated method stub
		return kardexDao.buscarKardexByIdKardexProducto(idkardex);
	}

}
