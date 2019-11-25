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

import com.musa2.entity.Propietarios;
import com.musa2.service.PropietariosService;
@CrossOrigin(origins = {"http:localhost:4200"})
@RestController
@RequestMapping("/propietarios")
public class PropietariosController {
      @Autowired
      private PropietariosService propietariosService;
      
    @Secured("ROLE_ADMIN")
    @GetMapping
  	public Map<String,Object> getPropietarios(){
  		return propietariosService.readAll();
  	}
  	@PostMapping("/add")
  	public int save(@RequestBody Propietarios propietarios) {		
  		return propietariosService.create(propietarios);		
  	}
  	@DeleteMapping("/{id}")
  	public int deletePropietarios(@PathVariable int id) {		
  		return propietariosService.delete(id);
  	}
  	@GetMapping("/{id}")
  	public Map<String,Object> readPropietarios(@PathVariable int id) {		
  		return propietariosService.read(id);
  	}
  	@PutMapping("/{id}")
  	public int updatePropietarios(@RequestBody Propietarios pro, @PathVariable int id) {
  		pro.setIdpropietario(id);
  		return propietariosService.update(pro);
  	}
}
