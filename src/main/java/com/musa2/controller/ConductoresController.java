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

import com.musa2.entity.Conductores;
import com.musa2.service.ConductoresService;


@CrossOrigin ("*")
@RestController
@RequestMapping("/conductores")
public class ConductoresController {
	@Autowired
    private ConductoresService conductoresService;
	@Secured("ROLE_ADMIN")
	@GetMapping("/")
	public Map<String,Object> get(){
		return conductoresService.readAll();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/lis/")
	public Map<String,Object> lis(){
		return conductoresService.lis();
	}
	@Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public Map<String, Object> save(@RequestBody Conductores c) {		
		return conductoresService.create(c);
		
	}
	@Secured("ROLE_ADMIN")
	@PutMapping("/D")
	public Map<String, Object> delete(@RequestBody Conductores c) {		
	 return conductoresService.delete(c);
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/{id}")
	public Map<String,Object> read(@PathVariable int id) {		
		return conductoresService.read(id);
		
	}
	@Secured("ROLE_ADMIN")
	@PutMapping("/{id}")
	public Map<String, Object> update(@RequestBody Conductores c, @PathVariable int id) {
		c.setIdconductor(id);
		return conductoresService.update(c);
		
		
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/P/{code}")
	public Map<String,Object> code(@PathVariable int code) {		
		return conductoresService.code(code);
		
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/Po/{est}")
	public Map<String,Object> est(@PathVariable int est) {		
		return conductoresService.est(est);
		
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/Pers")
	public Map<String,Object> pers(){
		return conductoresService.lispers();
	}
}