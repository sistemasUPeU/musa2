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

import com.musa2.entity.Vehiculos;
import com.musa2.service.VehiculosService;

@RestController
@RequestMapping("/vehiculos")
public class VehiculosController {
         @Autowired
         private VehiculosService vehiculosService;
         
         @Secured("ROLE_ADMIN") 
        @GetMapping
       	public Map<String,Object> getVehiculos(){
       		return vehiculosService.readAll();
       	}
         @Secured("ROLE_ADMIN")
       	@PostMapping("/add")
       	public Map<String, Object> saveVehiculos(@RequestBody Vehiculos vehiculos) {		
       		return vehiculosService.create(vehiculos);			
       	}
         @Secured("ROLE_ADMIN")
       	@PutMapping("/delete/{id}")
       	public int deleteVehiculo(@PathVariable int id) {		
       		return vehiculosService.delete(id);
       	}
         @Secured("ROLE_ADMIN")
       	@GetMapping("/{id}")
       	public Map<String,Object> readVehiculos(@PathVariable int id) {		
       		return vehiculosService.read(id);
       	}
         @Secured("ROLE_ADMIN")
       	@PutMapping("/update/")
       	public Map<String, Object> updatePropietarios(@RequestBody Vehiculos ve) {
       		return vehiculosService.update(ve);
       	} 
        @Secured("ROLE_ADMIN")
     	@GetMapping("/nropadron/{nropadron}")
       	public Map<String,Object> searchVehiculos(@PathVariable int nropadron) {		
       		return vehiculosService.search(nropadron);
       	}
        @Secured("ROLE_ADMIN")
       	@GetMapping("/modelo/")
       	public Map<String,Object> getVehmodelo(){
       		return vehiculosService.readmodelId();
       	}
        @Secured("ROLE_ADMIN")
       	@GetMapping("/marca/")
       	public Map<String,Object> getVehmarca(){
       		return vehiculosService.readmarcaId();
       	}
        @Secured("ROLE_ADMIN")
       	@GetMapping("/categoria/")
       	public Map<String,Object> getVehcatgoria(){
       		return vehiculosService.readcatId();
       	} 
}
