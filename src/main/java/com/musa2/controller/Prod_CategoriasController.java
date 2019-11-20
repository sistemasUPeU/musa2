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

import com.musa2.entity.Prod_Categorias;
import com.musa2.service.Prod_CategoriasService;


@RestController
@RequestMapping("/prodcategorias")
public class Prod_CategoriasController {
	@Autowired
    private Prod_CategoriasService prod_CategoriasService;
	@GetMapping("/")
	public Map<String,Object> get(){
		return prod_CategoriasService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Prod_Categorias prod_Categorias) {		
		return prod_CategoriasService.create(prod_Categorias);		
	}
	@DeleteMapping("/{id}")
	public int delete1(@PathVariable int id) {		
		return prod_CategoriasService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return prod_CategoriasService.read(id);
	}
	@GetMapping("/get/{nombre}")
	public Map<String,Object> read2(@PathVariable String nombre) {		
		return prod_CategoriasService.read(nombre);
	}
	@PutMapping("/{id}")
	public int update1(@RequestBody Prod_Categorias cat, @PathVariable int id) {
		cat.setIdprodcategoria(id);
		return prod_CategoriasService.update(cat);
	}	
}
