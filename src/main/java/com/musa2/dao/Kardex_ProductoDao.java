package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Kardex_Producto;


public interface Kardex_ProductoDao {
	public int create (Kardex_Producto kar);
	public int update (Kardex_Producto kar);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> getProductoByKardexId(long idKarProd);
	public Map<String, Object> getAllProductos();
}
