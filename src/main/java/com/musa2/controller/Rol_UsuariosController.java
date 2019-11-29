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

import com.musa2.entity.Rol_Usuarios;
import com.musa2.entity.Usuarios_Opciones;
import com.musa2.service.Rol_UsuariosService;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/ru")
public class Rol_UsuariosController {
	@Autowired
	private Rol_UsuariosService rol_usuariosservice;
	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD"})
	@PostMapping("/ru/add")
	public int createru(@RequestBody Rol_Usuarios ru) {
		return rol_usuariosservice.createru(ru);
	}
	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD"})
	@GetMapping("/rol1/{login}")
	public Map<String,Object> readL(@PathVariable String login) {		
		return rol_usuariosservice.readL(login);
	}
	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD"})
	@GetMapping("/rol/{estado}")
	public Map<String,Object> readE(@PathVariable int estado) {		
		return rol_usuariosservice.readE(estado);
	}
	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD"})
	@PutMapping("des/{idrol}/{idusuario}")
	public int delete(@PathVariable int idrol,@PathVariable int idusuario, @RequestBody String user_modify) {
		return rol_usuariosservice.delete(idrol, idusuario, user_modify);
	}
	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD"})
	@PutMapping("/{idrol}/{idusuario}")
	public int activar(@PathVariable int idrol,@PathVariable int idusuario, @RequestBody String user_modify) {
		return rol_usuariosservice.activar(idrol, idusuario, user_modify);
	}
	
}
