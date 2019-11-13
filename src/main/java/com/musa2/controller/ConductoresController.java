package com.musa2.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Conductores;
import com.musa2.service.ConductoresService;


@CrossOrigin ("*")
@RestController
@RequestMapping("/conductores")
public class ConductoresController {
	@Autowired
    private ConductoresService conductoresService;
	@GetMapping("/")
	public Map<String,Object> get(){
		return conductoresService.readAll();
	}
	@GetMapping("/lis/")
	public Map<String,Object> lis(){
		return conductoresService.lis();
	}
	@PostMapping("/add")
	public Map<String, Object> save(@RequestBody Conductores c) {		
		return conductoresService.create(c);
		
	}
	@DeleteMapping("/{id}")
	public Map<String, Object> delete(@RequestBody Conductores c) {		
	 return conductoresService.delete(c);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read(@PathVariable int id) {		
		return conductoresService.read(id);
		
	}
	@PutMapping("/{id}")
	public Map<String, Object> update(@RequestBody Conductores c, @PathVariable int id) {
		return conductoresService.update(c);
		
		
	}
}