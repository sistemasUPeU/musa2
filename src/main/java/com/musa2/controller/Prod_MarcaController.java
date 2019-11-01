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

import com.musa2.entity.Prod_Marcas;
import com.musa2.service.Prod_MarcasService;



@RestController
@RequestMapping("/prodmarcas")
public class Prod_MarcaController {
	@Autowired
    private Prod_MarcasService prod_MarcasSrvice;
	@GetMapping("/")
	public Map<String,Object> get(){
		return prod_MarcasSrvice.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Prod_Marcas prod_Marcas) {		
		return prod_MarcasSrvice.create(prod_Marcas);		
	}
	@DeleteMapping("/{id}")
	public int delete1(@PathVariable int id) {		
		return prod_MarcasSrvice.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return prod_MarcasSrvice.read(id);
	}
	@PutMapping("/{id}")
	public int update1(@RequestBody Prod_Marcas marc, @PathVariable int id) {
		marc.setIdprodmarca(id);
		return prod_MarcasSrvice.update(marc);
	}	
}
