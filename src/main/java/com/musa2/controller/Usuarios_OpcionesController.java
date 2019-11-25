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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Roles;
import com.musa2.entity.Usuarios;
import com.musa2.entity.Usuarios_Opciones;
import com.musa2.service.Usuarios_OpcionesService;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/usop")
public class Usuarios_OpcionesController {
	@Autowired
	private Usuarios_OpcionesService usuarios_OpcionesService;
	@Secured("ROLE_ADMIN")
	@GetMapping("/")
	public Map<String,Object> readAll(){
		return usuarios_OpcionesService.readAll();
	}
	@Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public int  create(@RequestBody Usuarios_Opciones up) {		
		return usuarios_OpcionesService.create(up);		
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/nombre/{nombre}")
	public Map<String,Object> readN(@PathVariable String nombre) {		
		return usuarios_OpcionesService.readN(nombre);
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/estado/{estado}")
	public Map<String,Object> readE(@PathVariable int estado) {		
		return usuarios_OpcionesService.readE(estado);
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/opcion1/")
	public Map<String,Object> opcion1() {		
		return usuarios_OpcionesService.opcion1();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/opc2/{idopcion2}")
	public Map<String,Object> opc2(@PathVariable int idopcion2) {		
		return usuarios_OpcionesService.opc2(idopcion2);
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/op3/{idopcion3}")
	public Map<String,Object> op3(@PathVariable int idopcion3) {		
		return usuarios_OpcionesService.op3(idopcion3);
	}
	@Secured("ROLE_ADMIN")
	@PutMapping("/des/{idusuario}/{idopcion}")
	public int delete(@PathVariable int idusuario,@PathVariable int idopcion, @RequestBody String user_modify) {
		return usuarios_OpcionesService.delete(idusuario, idopcion, user_modify);
	}
	@Secured("ROLE_ADMIN")
	@PutMapping("/{idusuario}/{idopcion}")
	public int activar(@PathVariable int idusuario,@PathVariable int idopcion, @RequestBody String user_modify) {
		return usuarios_OpcionesService.activar(idusuario, idopcion, user_modify);
	}
}