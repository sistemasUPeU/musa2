package com.musa2.dao;
import java.util.Map;

import com.musa2.entity.Opciones;

public interface OpcionesDao {
	public int create(Opciones O);
	public int update(Opciones O);
	public int delete(int id);
	public Map<String,Object> read(int id);
	public Map<String,Object> readn(int nombre);
	public Map<String,Object> reade(int estado);
	public Map<String,Object> readt(int tipo);
	public Map<String,Object> readp(int idpadre);
	public Map<String, Object> readAll();
	public Map<String, Object> obtenerOpciones(int idusuario);
	
}
