package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Vehiculos;

public interface VehiculosDao {
	public Map<String, Object> create(Vehiculos ve);
	public Map<String, Object> update(Vehiculos ve);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	Map<String, Object> readplaca();
<<<<<<< HEAD
=======
	public Map<String, Object> search(int nropadron);
>>>>>>> 13551fd04dd5048e5e6a574dda893675f8575b84
}
