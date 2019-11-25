package com.musa2.service;

import java.util.Map;

import com.musa2.entity.Configuraciones_Grupo;

public interface Configuraciones_GrupoService {
	public int create(Configuraciones_Grupo cg);
	public int SaveUno(Configuraciones_Grupo cg);
	public int SaveDos(Configuraciones_Grupo cg);
	public Map<String, Object> readUNO();
	public Map<String, Object> readDOS();
	public Map<String, Object> readP(int paradero);
}
