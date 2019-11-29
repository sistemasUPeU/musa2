package com.musa2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Vinculos;
import com.musa2.service.VinculosService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
@RequestMapping("/vinculos")
public class VinculosController {
	@Autowired
	private VinculosService vinculoService;
	
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/lis/{tipo}/{estado}")
	public Map<String,Object> listarportipo(@PathVariable int tipo , @PathVariable int estado){
		return vinculoService.readAll(tipo , estado);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/conta/")
	public List<Map<String,Object>> contar(){
		return vinculoService.contar();
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/{id}")
	public Map<String,Object> listarid(@PathVariable int id) {
		return vinculoService.read(id); 
	}
	
	@Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public Map<String, Object> create(@RequestBody Vinculos vinculo) {		
		return vinculoService.create(vinculo);		
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/stado/")
	public Map<String,Object> updestado(@RequestBody Vinculos vinculo) {
		return vinculoService.updateState(vinculo);
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/upd")
	public Map<String, Object> update(@RequestBody Vinculos vinculo){
		return vinculoService.update(vinculo);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/lisc/")
	public Map<String,Object> lisconductor(){
		return vinculoService.lisconductores();
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/lisv/")
	public Map<String,Object> lispropietaio(){
		return vinculoService.lispropietarios();
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/lisp/")
	public Map<String,Object> lisvehiculo(){
		return vinculoService.lisvehiculos();
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/lis/{tipo}")
	public Map<String,Object> lis(@PathVariable int tipo) {
		System.out.println("tipo : " + tipo);
		return vinculoService.list(tipo);
	}
	
	
}
