package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Kardex_Producto;


public interface Kardex_ProductoService {

	public int create (Kardex_Producto kar);
	public int update (Kardex_Producto kar);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> findKardexByComprobante(int nrocomprobante);
}
