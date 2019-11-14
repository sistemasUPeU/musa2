package com.musa2.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa2.dao.Kardex_ProductoDao;
import com.musa2.entity.Kardex_Producto;
import com.musa2.service.Kardex_ProductoService;

@Service
public class Kardex_ProductoServiceImp implements Kardex_ProductoService {
	
	@Autowired
	private Kardex_ProductoDao kpdao; 

	@Override
	public int create(Kardex_Producto kar) {
		// TODO Auto-generated method stub
		return kpdao.create(kar);
	}

	@Override
	public int update(Kardex_Producto kar) {
		// TODO Auto-generated method stub
		return kpdao.update(kar);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return kpdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return kpdao.readAll();
	}

	@Override
	public Map<String, Object> findKardexByComprobante(int nrocomprobante) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
