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


import com.musa2.entity.Tarj_Circulacion;
import com.musa2.service.Tarj_CirculacionService;

@RestController
@RequestMapping("/tarjetac")
public class Tarj_CirculacionController {
          @Autowired
          private Tarj_CirculacionService tarj_CirculacionService;
          
          @GetMapping
        	public Map<String,Object> getTarj_Circulacion(){
        		return tarj_CirculacionService.readAll();
        	}
        	@PostMapping("/add")
        	public Map<String,Object> saveTarj_Circulacion(@RequestBody Tarj_Circulacion tarj_Circulacion) {		
        		return tarj_CirculacionService.create(tarj_Circulacion);			
        	}
        	@DeleteMapping("/{id}")
        	public Map<String,Object> deleteTarj_Circulacion(@RequestBody Tarj_Circulacion tarj_Circulacion) {		
        		return tarj_CirculacionService.delete(tarj_Circulacion);
        	}
        	@GetMapping("/{id}")
        	public Map<String,Object> readTarj_Circulacion(@PathVariable int id) {		
        		return tarj_CirculacionService.read(id);
        	}
        	@PutMapping("/{id}")
        	public Map<String,Object> updateTarj_Circulacion(@RequestBody Tarj_Circulacion tar) {
       
        		return tarj_CirculacionService.update(tar);
        	} 
}
