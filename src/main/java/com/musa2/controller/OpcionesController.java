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

import com.musa2.entity.Opciones;
import com.musa2.service.OpcionesService;




@RestController
@RequestMapping("/opciones")
public class OpcionesController {
	@Autowired
    private OpcionesService opcionesService;
	@GetMapping
	public Map<String,Object> get(){
		return opcionesService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Opciones opcion) {		
		return opcionesService.create(opcion);		
	}
	@DeleteMapping("/{id}")
	public int delete1(@PathVariable int id) {		
		return opcionesService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return opcionesService.read(id);
	}
	@PutMapping("/{id}")
	public int update1(@RequestBody Opciones pro, @PathVariable int id) {
		pro.setIdopciones(id);
		return opcionesService.update(pro);
	}
}
