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

import com.musa2.entity.Prod_Unidadmed;
import com.musa2.service.Prod_UnidadmedService;

@RestController
@RequestMapping("/produnidadmed")
public class Prod_UnidadmedController {
	@Autowired
    private Prod_UnidadmedService prod_UnidadmedService;
	@GetMapping("/")
	public Map<String,Object> get(){
		return prod_UnidadmedService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Prod_Unidadmed prod_Unidadmed) {		
		return prod_UnidadmedService.create(prod_Unidadmed);		
	}
	@DeleteMapping("/{id}")
	public int delete1(@PathVariable int id) {		
		return prod_UnidadmedService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return prod_UnidadmedService.read(id);
	}
	@PutMapping("/{id}")
	public int update1(@RequestBody Prod_Unidadmed uni, @PathVariable int id) {
		uni.setIdprodunidadmed(id);
		return prod_UnidadmedService.update(uni);
	}	
}
