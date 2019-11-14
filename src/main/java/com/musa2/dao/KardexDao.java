package com.musa2.dao;

import java.util.Map;

import com.musa2.entity.Kardex;

public interface KardexDao {
public int create (Kardex kar);
public int update (Kardex kar);
public int delete(int id);
public Map<String,Object> read(int id);
public Map<String, Object> readAll();
public Map<String, Object> findKardexByComprobante(int nrocomprobante);
<<<<<<< HEAD

Map<String, Object> buscarKardexByIdKardexProducto(int idkardex);

=======
>>>>>>> 543777c207557e7f0333038c3ee2fecdece52641
}
