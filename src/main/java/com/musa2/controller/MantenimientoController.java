package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Mantenimiento;
import com.musa2.service.MantenimientoService;

@RestController
@RequestMapping("/mantenimiento")
public class MantenimientoController {

	@Autowired
	private MantenimientoService mantenimientoService;
	
	@GetMapping("/")
	public Map<String, Object> create(@RequestBody Mantenimiento m){
		return mantenimientoService.create(m);
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> readAllByMantId(@PathVariable int id){
		return mantenimientoService.readAllByMantId(id);
	}
	
	@GetMapping("/update/detalle/man={idm}/acc={ida}/sta={sta}")
	public Map<String, Object> updateDetalle(@PathVariable int idm,
											@PathVariable int ida,
											@PathVariable int sta){
		return mantenimientoService.updateDetaState(idm, ida, sta);
	}
	
}
