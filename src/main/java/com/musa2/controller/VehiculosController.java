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

import com.musa2.entity.Vehiculos;
import com.musa2.service.VehiculosService;

@RestController
@RequestMapping("/vehiculos")
public class VehiculosController {
         @Autowired
         private VehiculosService vehiculosService;
         
         
        @GetMapping
       	public Map<String,Object> getVehiculos(){
       		return vehiculosService.readAll();
       	}
       	@PostMapping("/add")
       	public int saveVehiculos(@RequestBody Vehiculos vehiculos) {		
       		return vehiculosService.create(vehiculos);			
       	}
       	@DeleteMapping("/{id}")
       	public int deleteVehiculo(@PathVariable int id) {		
       		return vehiculosService.delete(id);
       	}
       	@GetMapping("/{id}")
       	public Map<String,Object> readVehiculos(@PathVariable int id) {		
       		return vehiculosService.read(id);
       	}
       	@PutMapping("/{id}")
       	public int updatePropietarios(@RequestBody Vehiculos ve, @PathVariable int id) {
       		ve.setIdvehiculo(id);
       		return vehiculosService.update(ve);
       	} 
}