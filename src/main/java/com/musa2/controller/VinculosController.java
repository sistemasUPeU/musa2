package com.musa2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.musa2.entity.Vinculos;
import com.musa2.service.VinculosService;



@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/vinculos")
public class VinculosController {
	@Autowired
	private VinculosService vinculoService;
	@GetMapping("/lis/{tipo}/{estado}")
	public Map<String,Object> listarportipo(@PathVariable int tipo , @PathVariable int estado){
		return vinculoService.readAll(tipo , estado);
	}
	@GetMapping("/conta/")
	public List<Map<String,Object>> contar(){
		return vinculoService.contar();
	}
	@GetMapping("/{id}")
	public Map<String,Object> listarid(@PathVariable int id) {
		return vinculoService.read(id); 
	}
	@PostMapping("/add")
	public Map<String, Object> create(@RequestBody Vinculos vinculo) {	
		System.out.println("formato de fecha"+vinculo.getFechafin());
		return vinculoService.create(vinculo);		
	}
	@PutMapping("/stado/")
	public Map<String,Object> updestado(@RequestBody Vinculos vinculo) {
		return vinculoService.updateState(vinculo);
	}
	@PutMapping("/upd")
	public Map<String, Object> update(@RequestBody Vinculos vinculo){
		
		return vinculoService.update(vinculo);
	}
}
