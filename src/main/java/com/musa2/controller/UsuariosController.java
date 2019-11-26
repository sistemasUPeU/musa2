package com.musa2.controller;

import java.util.List;
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


import com.musa2.entity.Usuarios;
import com.musa2.service.UsuariosService;
@CrossOrigin(origins = {"http:localhost:4200"})
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

@Autowired
	private UsuariosService usuariosService;
	
    @Secured("ROLE_ADMIN")
	@GetMapping("/")
	public Map<String, Object> readAll() {
		return usuariosService.readAll();
	}
     @Secured("ROLE_ADMIN")
 	@GetMapping("/per/")
 	public Map<String, Object> readPer() {
 		return usuariosService.readPer();
 	}
 	@Secured("ROLE_ADMIN")
 	@GetMapping("/per/{nombre}")
 	public Map<String,Object> readPerN(@PathVariable String nombre) {		
 		return usuariosService.readPerN(nombre);
 	}
 	
 	@Secured("ROLE_ADMIN")
 	@GetMapping("/use/")
 	public Map<String, Object> readUse() {
 		return usuariosService.readUse();
 	}
 	@Secured("ROLE_ADMIN")
 	@GetMapping("/use/{login}")
 	public Map<String,Object> readUseN(@PathVariable String login) {		
 		return usuariosService.readUseN(login);
 	}
    @Secured("ROLE_ADMIN")
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return usuariosService.read(id);
	}
    @Secured("ROLE_ADMIN")
	@GetMapping("/nombre/{nombre}")
	public Map<String,Object> readN(@PathVariable String nombre) {		
		return usuariosService.readN(nombre);
	}
    @Secured("ROLE_ADMIN")
	@GetMapping("/estado/{estado}")
	public Map<String,Object> readE(@PathVariable int estado) {		
		return usuariosService.readE(estado);
	}
    @Secured("ROLE_ADMIN")
	@GetMapping("/rol/{rol}")
	public Map<String,Object> readR(@PathVariable String rol) {		
		return usuariosService.readR(rol);
	}
	
    @Secured("ROLE_ADMIN")
	@GetMapping("/user/")
	public Map<String,Object> readUser() {		
		return usuariosService.readUser();
	}
    @Secured("ROLE_ADMIN")
	@GetMapping("/rolus/")
	public Map<String,Object> readRolus() {		
		return usuariosService.readRolus();
	}
	
    @Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public int create(@RequestBody Usuarios U) {
		return usuariosService.create(U);
	}
    @Secured("ROLE_ADMIN")
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return usuariosService.delete(id);
	}
    @Secured("ROLE_ADMIN")
	@PutMapping("/{id}")
	public int update(@RequestBody Usuarios usuario, @PathVariable int id) {
		usuario.setIdusuario(id);
		return usuariosService.update(usuario);
	}
	
	/*@PostMapping("/validar")
	public Map<String, Object> validar(@RequestBody Usuarios usuario) {
		return usuariosService.validar_login(usuario);
	}*/
	
}
