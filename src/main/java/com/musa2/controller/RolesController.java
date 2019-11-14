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

import com.musa2.entity.Roles;
import com.musa2.service.RolesService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/roles")
public class RolesController {
	@Autowired
	private RolesService rolesService;
	
	@GetMapping("/")
	public Map<String,Object> readAll(){
		return rolesService.readAll();
	}
	@PostMapping("/add")
	public int create(@RequestBody String nombre ) {		
		return rolesService.create(new Roles(nombre));		
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {		
		return rolesService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read(@PathVariable int id) {		
		return rolesService.read(id);
	}
	@GetMapping("/nombre/{nombre}")
	public Map<String,Object> readN(@PathVariable String nombre) {		
		return rolesService.readN(nombre);
	}
	@GetMapping("/estado/{estado}")
	public Map<String,Object> readE(@PathVariable int estado) {		
		return rolesService.readE(estado);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Roles rol, @PathVariable int id) {
		return rolesService.update(rol);
	}
}