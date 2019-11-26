package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Kardex;

public interface KardexService {
		public int create (Kardex kar);
		public int update (Kardex kar);
		public int delete(int id);
		public Map<String,Object> read(int id);
		public Map<String, Object> readAll();
		public Map<String, Object> findKardexByComprobante(int nrocomprobante);
		Map<String, Object> buscarKardexByIdKardexProducto(int idkardex);
	
}
	
