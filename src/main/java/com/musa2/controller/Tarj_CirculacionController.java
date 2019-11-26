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


import com.musa2.entity.Tarj_Circulacion;
import com.musa2.service.Tarj_CirculacionService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/tarjetac")
public class Tarj_CirculacionController {
          @Autowired
          private Tarj_CirculacionService tarj_CirculacionService;
          @Secured("ROLE_ADMIN")
          @GetMapping("/")
        	public Map<String,Object> getTarj_Circulacion(){
        		return tarj_CirculacionService.readAll();
        	}
          @Secured("ROLE_ADMIN")
        	@PostMapping("/add")
        	public Map<String,Object> saveTarj_Circulacion(@RequestBody Tarj_Circulacion tarj_Circulacion) {		
        		return tarj_CirculacionService.create(tarj_Circulacion);			
        	}
          @Secured("ROLE_ADMIN")
        	@DeleteMapping("/{id}")
        	public Map<String,Object> deleteTarj_Circulacion(@PathVariable int id) {		
        		return tarj_CirculacionService.delete(id);
        	}
          @Secured("ROLE_ADMIN")
        	@GetMapping("/{id}")
        	public Map<String,Object> readTarj_Circulacion(@PathVariable int id) {		
        		return tarj_CirculacionService.read(id);
        	}
          @Secured("ROLE_ADMIN")
        	@PutMapping("/{id}")
        	public Map<String,Object> updateTarj_Circulacion(@RequestBody Tarj_Circulacion tar,@PathVariable int id) {
                  tar.setIdtarjetac(id);
        		return tarj_CirculacionService.update(tar);
        	} 
          @Secured("ROLE_ADMIN")
        	@GetMapping("/P/{nrodocumento}")
        	public Map<String,Object> buscar(@PathVariable  int nrodocumento) {		
        		return tarj_CirculacionService.buscar(nrodocumento);
        	}
          @Secured("ROLE_ADMIN")
        	@GetMapping("/Po/{estado}")
        	public Map<String,Object> buscarestado(@PathVariable  int estado) {		
        		return tarj_CirculacionService.listest(estado);
        	}
}
