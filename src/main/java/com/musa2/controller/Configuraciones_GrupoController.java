package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Configuraciones_Grupo;
import com.musa2.entity.Roles;
import com.musa2.service.Configuraciones_GrupoService;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/cg")
public class Configuraciones_GrupoController {
	@Autowired 
	private Configuraciones_GrupoService configuraciones_GrupoService;
	@Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public int create(@RequestBody Configuraciones_Grupo cg ) {		
		return configuraciones_GrupoService.create(cg);		
	}
	@Secured("ROLE_ADMIN")
	@PostMapping("/add/1")
	public int saveUno(@RequestBody Configuraciones_Grupo cg ) {		
		return configuraciones_GrupoService.SaveUno(cg);		
	}
	@Secured("ROLE_ADMIN")
	@PostMapping("/add/2")
	public int saveDos(@RequestBody Configuraciones_Grupo cg ) {		
		return configuraciones_GrupoService.SaveDos(cg);		
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/paradero/{paradero}")
	public Map<String,Object> readP(@PathVariable int paradero) {		
		return configuraciones_GrupoService.readP(paradero);
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/1")
	public Map<String,Object> readUNO(){
		return configuraciones_GrupoService.readUNO();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/2")
	public Map<String,Object> readDOS(){
		return configuraciones_GrupoService.readDOS();
	}
}
