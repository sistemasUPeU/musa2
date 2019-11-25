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

import com.musa2.entity.Ventas;
import com.musa2.service.VentasService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
@RequestMapping("/ventas")
public class VentasController {
	@Autowired
	
	private VentasService ventasService;
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/lis/{idc}/{estado}")
	public Map<String,Object> listar(@PathVariable int idc , @PathVariable int estado){
		return ventasService.readAll(idc , estado);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/{idc}/{idv}")
	public Map<String,Object> listarid(@PathVariable int idc, @PathVariable int idv) {
		return ventasService.read(idc, idv); 
	}
	
	@Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public Map<String, Object> create(@RequestBody Ventas venta) {		
		return ventasService.create(venta);		
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/stado/")
	public Map<String,Object> updestado(@RequestBody Ventas venta) {
		return ventasService.updateState(venta);
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/upd")
	public Map<String, Object> update(@RequestBody Ventas venta){
		return ventasService.update(venta);
	}
}
