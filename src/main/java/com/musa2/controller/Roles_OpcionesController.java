package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Roles_Opciones;
import com.musa2.service.Roles_OpcionesService;



@RestController
@RequestMapping("/rolesopciones")
public class Roles_OpcionesController {
	@Autowired
    private Roles_OpcionesService roles_OpcionesService;
	@GetMapping("/")
	public Map<String,Object> get(){
		return roles_OpcionesService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Roles_Opciones roles_Opciones) {		
		return roles_OpcionesService.create(roles_Opciones);		
	}
	@DeleteMapping("/{idrol}")
	public int delete1(@PathVariable int idrol) {
		return roles_OpcionesService.delete(idrol);
	}
	@DeleteMapping("/del/{idrol},{idopcion}")
	public int delete2(@PathVariable int idrol,@PathVariable int idopcion) {		
		return roles_OpcionesService.delete(idrol, idopcion);
	}
	@GetMapping("/get/{nombre}")
	public Map<String,Object> read2(@PathVariable String nombre) {		
		return roles_OpcionesService.read(nombre);
	}
}
