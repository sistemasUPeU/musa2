package com.musa2.controller;

import java.util.List;
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

import com.musa2.entity.Rol_Usuarios;
import com.musa2.entity.Roles;
import com.musa2.entity.Usuarios;
import com.musa2.service.Rol_UsuariosService;
import com.musa2.service.UsuariosService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

@Autowired
	private UsuariosService usuariosService;
	private Rol_UsuariosService rol_UsuariosService;
	
	@GetMapping("/")
	public Map<String, Object> readAll() {
		return usuariosService.readAll();
	}
	
	@GetMapping("/per/")
	public Map<String, Object> readPer() {
		return usuariosService.readPer();
	}
	
	@GetMapping("/per/{nombre}")
	public Map<String,Object> readPerN(@PathVariable String nombre) {		
		return usuariosService.readPerN(nombre);
	}
	

	@GetMapping("/use/")
	public Map<String, Object> readUse() {
		return usuariosService.readUse();
	}
	
	@GetMapping("/use/{login}")
	public Map<String,Object> readUseN(@PathVariable String login) {		
		return usuariosService.readUseN(login);
	}
	
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return usuariosService.read(id);
	}
	
	@GetMapping("/nombre/{nombre}")
	public Map<String,Object> readN(@PathVariable String nombre) {		
		return usuariosService.readN(nombre);
	}
	
	@GetMapping("/estado/{estado}")
	public Map<String,Object> readE(@PathVariable int estado) {		
		return usuariosService.readE(estado);
	}
	
	@GetMapping("/rol/{rol}")
	public Map<String,Object> readR(@PathVariable String rol) {		
		return usuariosService.readR(rol);
	}
	

	@GetMapping("/user/")
	public Map<String,Object> readUser() {		
		return usuariosService.readUser();
	}
	
	@GetMapping("/rolus/")
	public Map<String,Object> readRolus() {		
		return usuariosService.readRolus();
	}
	
	@PostMapping("/add")
	public int create(@RequestBody Usuarios usuario) {
		return usuariosService.create(usuario);
	}
	
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return usuariosService.delete(id);
	}
	
	@PutMapping("/{id}")
	public int update(@RequestBody Usuarios usuario, @PathVariable int id) {
		usuario.setIdusuario(id);
		return usuariosService.update(usuario);
	}
	
	
	
	@PostMapping("/validar")
	public int validar(@RequestBody Usuarios usuario) {
		return usuariosService.validar_login(usuario);
	}
	
}

