package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Productos;
import com.musa2.service.ProductosService;



@RestController
@RequestMapping("/productos")
public class ProductosController {
	@Autowired
    private ProductosService productosService;
	@GetMapping("/")
	public Map<String,Object> get(){
		return productosService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Productos producto) {		
		return productosService.create(producto);		
	}
	@DeleteMapping("/{id}")
	public int delete1(@PathVariable int id) {		
		return productosService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return productosService.read(id);
	}
	@GetMapping("/get/{nombre}")
	public Map<String,Object> read2(@PathVariable String nombre) {		
		return productosService.read(nombre);
	}
	@PutMapping("/{id}")
	public int update1(@RequestBody Productos pro, @PathVariable int id) {
		pro.setIdproducto(id);
		return productosService.update(pro);
	}
}
