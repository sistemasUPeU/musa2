package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Roles_Opciones;



public interface Roles_OpcionesDao {
	public int create(Roles_Opciones P);
	public int delete(int idrol);
	public int delete(int idrol, int idopcion);
	public Map<String,Object> read(String nombre);
	public Map<String, Object> readAll();
}
