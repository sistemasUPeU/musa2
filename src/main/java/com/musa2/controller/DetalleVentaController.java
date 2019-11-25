package com.musa2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Detalle_Venta;

import com.musa2.service.DetalleVentaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {
	@Autowired 
	private DetalleVentaService detalleventaService;

	
	@Secured("ROLE_ADMIN")
	@GetMapping("/{id}")
	public Map<String,Object> listar(@PathVariable int iddv) {
		return detalleventaService.readAll(iddv); 
	}
	
	@Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public Map<String, Object> create(@RequestBody Detalle_Venta dventa) {		
		return detalleventaService.create(dventa);		
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/stado/")
	public Map<String,Object> delete(@PathVariable int iddv, @PathVariable int idp) {
		return detalleventaService.delete(iddv, idp);
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/upd")
	public Map<String, Object> update(@RequestBody Detalle_Venta dventa){
		return detalleventaService.update(dventa);
	}
}
