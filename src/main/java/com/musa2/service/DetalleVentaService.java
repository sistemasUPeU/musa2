package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Detalle_Venta;

public interface DetalleVentaService {
	public Map<String, Object> create(Detalle_Venta dventa); 
    public Map<String, Object> update(Detalle_Venta dventa);
    public Map<String, Object> delete(int iddv, int idp);
	public Map<String, Object> readAll(int iddv);
}
