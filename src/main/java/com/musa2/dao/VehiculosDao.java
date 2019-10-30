package com.musa2.dao;

import java.util.List;
import java.util.Map;

import com.musa2.entity.Vehiculos;

public interface VehiculosDao {
   public int create(Vehiculos ve);
   public int update(Vehiculos ve);
   public int delete(int key);
   public Vehiculos read(int key);
   public List<Map<String, Object>> readAll();
}
