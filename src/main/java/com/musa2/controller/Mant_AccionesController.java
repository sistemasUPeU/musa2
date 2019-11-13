package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Mant_Acciones;
import com.musa2.service.Mant_AccionesService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/acciones")
public class Mant_AccionesController {

	@Autowired
	private Mant_AccionesService mant_accionesService;
	
	@PostMapping("/")
	public Map<String, Object> create(@RequestBody Mant_Acciones m){
		return mant_accionesService.create(m);
	}
	
	@PutMapping("/{id}")
	public Map<String, Object> update(@PathVariable int id, @RequestBody Mant_Acciones m){
		return mant_accionesService.update(id, m);
	}
	
	@GetMapping("/{type}")
	public Map<String, Object> read(@PathVariable int type){
		return mant_accionesService.readAllByType(type);
	}
	
	@GetMapping("/state/{id}")
	public Map<String, Object> updateState(@PathVariable int id){
		return mant_accionesService.updateState(id);
	}
	
	@GetMapping("/edit/{id}")
	public Map<String, Object> readById(@PathVariable int id){
		return mant_accionesService.readById(id);
	}
	
	@GetMapping("/cat")
	public Map<String, Object> readByCat(){
		return mant_accionesService.readByCat();
	}
	
}
