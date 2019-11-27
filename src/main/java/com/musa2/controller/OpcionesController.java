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

import com.musa2.entity.Opciones;
import com.musa2.service.OpcionesService;



@RestController
@RequestMapping("/opciones")
public class OpcionesController {
	@Autowired
    private OpcionesService opcionesService;
	
	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD"})
	@GetMapping("/")
	public Map<String,Object> get(){
		return opcionesService.readAll();
	}
	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD"})
	@PostMapping("/add")
	public Map<String, Object> save(@RequestBody Opciones opcion) {		
		return opcionesService.create(opcion);		
	}

	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD"})
	@DeleteMapping("/{id}")
	public Map<String,Object> delete1(@PathVariable Opciones o) {		
		return opcionesService.delete(o);
	}

	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD"})
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return opcionesService.read(id);
	}
	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD"})
	@PutMapping("/{id}")
	public Map<String, Object> update1(@RequestBody Opciones pro, @PathVariable int id) {
		pro.setIdopciones(id);
		return opcionesService.update(pro);
	}

	@Secured({"ROLE_ADMIN","ROLE_SEGURIDAD","ROLE_SECRETARIA","ROLE_MECANICO"})
	@GetMapping("/getOPC/{idusuario}")
	public Map<String,Object> obtenerOpciones(@PathVariable int idusuario) {		
		return opcionesService.obtenerOpciones(idusuario);		
	}
}
