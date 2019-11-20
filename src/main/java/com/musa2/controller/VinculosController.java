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

import com.musa2.entity.Vinculos;
import com.musa2.service.VinculosService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
@RequestMapping("/vinculos")
public class VinculosController {
	@Autowired
	private VinculosService vinculoService;
	@GetMapping("/lis/{id}")
	public Map<String,Object> readAll(@PathVariable int id){
		return vinculoService.readAll(id);
	}
	@PostMapping("/add")
	public int create(@RequestBody Vinculos vinculo) {		
		return vinculoService.create(vinculo);		
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {		
		return vinculoService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read(@PathVariable int id) {		
		return vinculoService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Vinculos vin, @PathVariable int id) {
		vin.setIdvinculo(id);
		return vinculoService.update(vin);
	}
}
