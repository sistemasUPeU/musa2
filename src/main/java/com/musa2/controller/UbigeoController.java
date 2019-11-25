package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Ubigeo;
import com.musa2.service.UbigeoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ubigeos")
public class UbigeoController {
@Autowired
private UbigeoService ubigeoService;

@Secured("ROLE_ADMIN")
@GetMapping("/")
public Map<String, Object> readAll() {
	return ubigeoService.readAll();
}
@PostMapping("/add")
public int save(@RequestBody Ubigeo ubi) {
	return ubigeoService.create(ubi);
}
@DeleteMapping("/ubi/{id}")
public int delete1(@PathVariable int id) {
	return ubigeoService.delete(id); 
}

@GetMapping("/{id}")
public Map<String,Object> read1(@PathVariable int id) {
	return ubigeoService.read(id);
}
@PutMapping("/{id}")
public int update(@RequestBody Ubigeo ub, @PathVariable int id ) {
	ub.setIdubigeo(id);
	return ubigeoService.update(ub);
	
}
@GetMapping("/ubi/{cod}")
public Map<String, Object> search(@PathVariable("cod") int codigo) {
	
	return ubigeoService.findUbigeoByCodigo(codigo);
}
}
