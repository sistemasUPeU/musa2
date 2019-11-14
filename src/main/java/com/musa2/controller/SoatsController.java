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

import com.musa2.entity.Soats;
import com.musa2.service.SoatsService;

@CrossOrigin("*")
@RestController
@RequestMapping("/soats")
public class SoatsController {
           @Autowired
           private SoatsService soatsService;
           @GetMapping("/")
          	public Map<String,Object> getSoats(){
          		return soatsService.readAll();
          	}
          	@PostMapping("/add")
          	public Map<String, Object> saveSoats(@RequestBody Soats soats) {		
          		return soatsService.create(soats);			
          	}
          	@DeleteMapping("/{id}")
          	public Map<String, Object> deleteSoats(@PathVariable int id) {		
          		return soatsService.delete(id);
          	}
          	@GetMapping("/{id}")
          	public Map<String,Object> readSoats(@PathVariable int id) {		
          		return soatsService.read(id);
          	}
          	@GetMapping("/P/{id}")
          	public Map<String,Object> buscar(@PathVariable int id) {		
          		return soatsService.buscar(id);
          	}
          	@GetMapping("/Po/{id}")
          	public Map<String,Object> estado(@PathVariable int id) {		
          		return soatsService.estado(id);
          	}
          	@PutMapping("/{id}")
          	public Map<String,Object> updatePropietarios(@RequestBody Soats so) {
          		return soatsService.update(so);
          	} 
}
