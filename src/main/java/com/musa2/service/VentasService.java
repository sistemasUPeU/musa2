package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Ventas;

public interface VentasService {
	public Map<String, Object> create(Ventas venta); 
    public Map<String, Object> update(Ventas venta);
    public Map<String, Object> updateState(Ventas venta);
	public Map<String, Object> read(int idc, int idv);
	public Map<String, Object> readAll(int idc, int estado);
}
