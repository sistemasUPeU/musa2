package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
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
import com.musa2.service.UsuariosService;

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
@CrossOrigin(origins = {"http:localhost:4200"})

@RestController
@RequestMapping("/roles")
public class RolesController {
	@Autowired
	private RolesService rolesService;
	@Autowired
	private UsuariosService usuariosService;
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/")
	public Map<String,Object> readAll(){
		return rolesService.readAll();
	}
	@Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public int create(@RequestBody String nombre ) {		
		return rolesService.create(new Roles(nombre));		
	}
	@Secured("ROLE_ADMIN")
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {		
		return rolesService.delete(id);
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/{id}")
	public Map<String,Object> read(@PathVariable int id) {		
		return rolesService.read(id);
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/nombre/{nombre}")
	public Map<String,Object> readN(@PathVariable String nombre) {		
		return rolesService.readN(nombre);
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/estado/{estado}")
	public Map<String,Object> readE(@PathVariable int estado) {		
		return rolesService.readE(estado);
	}
	@Secured("ROLE_ADMIN")
	@PutMapping("/{id}")
	public int update(@RequestBody Roles rol, @PathVariable int id) {
		rol.setIdrol(id);
		return rolesService.update(rol);
	}
	
	
}
