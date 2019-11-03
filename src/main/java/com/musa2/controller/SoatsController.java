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

import com.musa2.entity.Soats;
import com.musa2.service.SoatsService;

@RestController
@RequestMapping("/soats")
public class SoatsController {
           @Autowired
           private SoatsService soatsService;
           @GetMapping
          	public Map<String,Object> getSoats(){
          		return soatsService.readAll();
          	}
          	@PostMapping("/add")
          	public int saveSoats(@RequestBody Soats soats) {		
          		return soatsService.create(soats);			
          	}
          	@DeleteMapping("/{id}")
          	public int deleteSoats(@PathVariable int id) {		
          		return soatsService.delete(id);
          	}
          	@GetMapping("/{id}")
          	public Map<String,Object> readSoats(@PathVariable int id) {		
          		return soatsService.read(id);
          	}
          	@PutMapping("/{id}")
          	public int updatePropietarios(@RequestBody Soats so , @PathVariable int id) {
          		so.setIdsoat(id);
          		return soatsService.update(so);
          	} 
}
