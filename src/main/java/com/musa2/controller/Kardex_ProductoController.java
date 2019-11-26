package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Kardex;
import com.musa2.entity.Kardex_Producto;
import com.musa2.service.Kardex_ProductoService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/kardexproducto")
public class Kardex_ProductoController {
	
	@Autowired
	private Kardex_ProductoService kps;
	
	
	@GetMapping("/listar")
	public Map<String, Object> readAll() {
		return kps.readAll();
	}
	
	@PostMapping("/add-kardex-producto")
	public int save(@RequestBody Kardex_Producto kar) {
		return kps.create(kar);
	}
	@DeleteMapping("/kard/{id}")
	public int delete1(@PathVariable int id) {
	return kps.delete(id);
	}
	
	@GetMapping("/listar-prod-kardex/{id}")
	public Map<String, Object> listarProductoByKardexId(@PathVariable("id") int idkardex) {
		return kps.getProductoByKardexId(idkardex);
	}
	
	@GetMapping("/listar-todos-productos")
	public Map<String, Object> getAllProductos() {
		return kps.getAllProductos();
	}
	
}
