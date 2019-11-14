package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Mantenimiento;
import com.musa2.service.MantenimientoService;
import com.musa2.service.VehiculosService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/mantenimiento")
public class MantenimientoController {

	@Autowired
	private MantenimientoService mantenimientoService;
	
	@Autowired
    private VehiculosService vehiculosService;
    
    
   @GetMapping("readVehiculos")
  	public Map<String,Object> getVehiculos(){
  		return vehiculosService.readAll();
  	}
   @GetMapping("/readVehi={id}")
  	public Map<String,Object> readVehiculos(@PathVariable int id) {		
  		return vehiculosService.read(id);
  	}
	
	@PostMapping("/create")
	public Map<String, Object> create(@RequestBody Mantenimiento m){
		return mantenimientoService.create(m);
	}
	
	@PutMapping("/update")
	public Map<String, Object> update(@RequestBody Mantenimiento m){
		return mantenimientoService.update(m);
	}
	
	@GetMapping("/read={id}")
	public Map<String, Object> read(@PathVariable int id){
		return mantenimientoService.read(id);
	}
	
	@GetMapping("/readallbytype={type}")
	public Map<String, Object> readAllByMantId(@PathVariable int type){
		return mantenimientoService.readAllByType(type);
	}
	
	@GetMapping("/readalldeta={id}")
	public Map<String, Object> readAllDeta(@PathVariable int id){
		return mantenimientoService.readAllDetaByMantId(id);
	}
	
	@GetMapping("/validar=pendiente/man={id}/emp={idempleado}")
	public Map<String, Object> validarAPendiente(@PathVariable int id, 
												@PathVariable int idempleado){
		return mantenimientoService.updateState(2, id, idempleado);
	}
	@GetMapping("/validar=enproceso/man={id}/emp={idempleado}")
	public Map<String, Object> validarAEnProceso(@PathVariable int id, 
												@PathVariable int idempleado){
		return mantenimientoService.updateState(3, id, idempleado);
	}
	@GetMapping("/validar=finalizado/man={id}/emp={idempleado}")
	public Map<String, Object> validarAFinalizado(@PathVariable int id, 
												@PathVariable int idempleado){
		return mantenimientoService.updateState(4, id, idempleado);
	}
	@GetMapping("/validar=delete/man={id}/emp={idempleado}")
	public Map<String, Object> validarADelete(@PathVariable int id, 
												@PathVariable int idempleado){
		return mantenimientoService.updateState(0, id, idempleado);
	}
	
	@GetMapping("/add/detalle/man={idm}/acc={ida}")
	public Map<String, Object> addDetalle(@PathVariable int idm,
										@PathVariable int ida){
		return mantenimientoService.addDetalle(idm, ida);
	}
	
	@GetMapping("/delete/detalle/man={idm}/acc={ida}")
	public Map<String, Object> delDetalle(@PathVariable int idm,
											@PathVariable int ida){
		return mantenimientoService.updateDetaState(idm, ida, 0);
	}
	
}
