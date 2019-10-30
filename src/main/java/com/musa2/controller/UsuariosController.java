package com.musa2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Usuarios;
import com.musa2.service.UsuariosService;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	@Autowired
	private UsuariosService usuariosService;
	
	
	@GetMapping("/")
	public Map<String, Object> readAll() {
		return usuariosService.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return usuariosService.read(id);
	}
	
	@PostMapping("/add")
	public int save(@RequestBody Usuarios usuario) {
		return usuariosService.create(usuario);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return usuariosService.delete(id);
	}
	
}
