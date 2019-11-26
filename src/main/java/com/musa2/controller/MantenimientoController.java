package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
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

@CrossOrigin("*")
@RestController
@RequestMapping("/mantenimiento")
public class MantenimientoController {

	@Autowired
	private MantenimientoService mantenimientoService;
	
	@Autowired
    private VehiculosService vehiculosService;
    
	@Secured("ROLE_ADMIN")
   @GetMapping("/readVehiculos")
  	public Map<String,Object> getVehiculos(){
  		return vehiculosService.readAll();
  	}
	
	@Secured("ROLE_ADMIN")
   @GetMapping("/readVehi={id}")
  	public Map<String,Object> readVehiculos(@PathVariable int id) {		
  		return vehiculosService.read(id);
  	}
	
	@Secured("ROLE_ADMIN")
	@PostMapping("/create")
	public Map<String, Object> create(@RequestBody Mantenimiento m){
		return mantenimientoService.create(m);
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/update")
	public Map<String, Object> update(@RequestBody Mantenimiento m){
		return mantenimientoService.update(m);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/read={id}")
	public Map<String, Object> read(@PathVariable int id){
		return mantenimientoService.read(id);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/readallbytype={type}")
	public Map<String, Object> readAllByMantId(@PathVariable int type){
		return mantenimientoService.readAllByType(type);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/readalldeta={id}")
	public Map<String, Object> readAllDeta(@PathVariable int id){
		return mantenimientoService.readAllDetaByMantId(id);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/validar=pendiente/man={id}/emp={idempleado}")
	public Map<String, Object> validarAPendiente(@PathVariable int id, 
												@PathVariable int idempleado){
		return mantenimientoService.updateState(2, id, idempleado);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/validar=enproceso/man={id}/emp={idempleado}")
	public Map<String, Object> validarAEnProceso(@PathVariable int id, 
												@PathVariable int idempleado){
		return mantenimientoService.updateState(3, id, idempleado);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/validar=finalizado/man={id}/emp={idempleado}")
	public Map<String, Object> validarAFinalizado(@PathVariable int id, 
												@PathVariable int idempleado){
		return mantenimientoService.updateState(4, id, idempleado);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/validar=delete/man={id}/emp={idempleado}")
	public Map<String, Object> validarADelete(@PathVariable int id, 
												@PathVariable int idempleado){
		return mantenimientoService.updateState(0, id, idempleado);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/add/detalle/man={idm}/acc={ida}")
	public Map<String, Object> addDetalle(@PathVariable int idm,
										@PathVariable int ida){
		return mantenimientoService.addDetalle(idm, ida);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/delete/detalle/man={idm}/acc={ida}")
	public Map<String, Object> delDetalle(@PathVariable int idm,
											@PathVariable int ida){
		return mantenimientoService.updateDetaState(idm, ida, 0);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/update/detalle/man={idm}/acc={ida}/sta={sta}")
	public Map<String, Object> updateDetalle(@PathVariable int idm,
											@PathVariable int ida,
											@PathVariable int sta){
		return mantenimientoService.updateDetaState(idm, ida, sta);
	}
	
}