package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Mant_Acciones;
import com.musa2.service.Mant_AccionesService;

@RestController
@RequestMapping("/acciones")
public class Mant_AccionesController {

	@Autowired
	private Mant_AccionesService mant_accionesService;
	
	@PostMapping("/")
	public Map<String, Object> create(@RequestBody Mant_Acciones m){
		return mant_accionesService.create(m);
	}
	
	@PutMapping("/")
	public Map<String, Object> update(@RequestBody Mant_Acciones m){
		return mant_accionesService.update(m);
	}
	
	@GetMapping("/{type}")
	public Map<String, Object> read(@PathVariable int type){
		return mant_accionesService.readAllByType(type);
	}
	
	@GetMapping("/state")
	public Map<String, Object> updateState(@RequestBody Mant_Acciones m){
		return mant_accionesService.updateState(m);
	}
	
}
