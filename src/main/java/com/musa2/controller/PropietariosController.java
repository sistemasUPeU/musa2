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

import com.musa2.entity.Propietarios;
import com.musa2.service.PropietariosService;
<<<<<<< HEAD
@CrossOrigin("*")
=======
@CrossOrigin(origins = "*")

>>>>>>> alejo
@RestController
@RequestMapping("/propietarios")
public class PropietariosController {
      @Autowired
      private PropietariosService propietariosService;
      
    @GetMapping
  	public Map<String,Object> getPropietarios(){
  		return propietariosService.readAll();
  	}
  	@PostMapping("/add")
  	public Map<String, Object> save(@RequestBody Propietarios p) {		
  		return propietariosService.create(p);		
  	}
  	@DeleteMapping("/{id}")
  	public int deletePropietarios(@PathVariable int id) {		
  		return propietariosService.delete(id);
  	}
  	@GetMapping("/{id}")
  	public Map<String,Object> readPropietarios(@PathVariable int id) {		
  		return propietariosService.read(id);
  	}
  	@PutMapping("/")
  	public Map<String, Object> updatePropietarios(@RequestBody Propietarios pro) {
  		return propietariosService.update(pro);
  	}
<<<<<<< HEAD
  	@GetMapping("/lis/")
	public Map<String,Object> getn(){
		return propietariosService.readnom();
	}
=======
  	@GetMapping("/nombre/{nombre}")
  	public Map<String,Object> search(@PathVariable String nombre) {		
  		return propietariosService.search(nombre);
  	}
>>>>>>> alejo
}
