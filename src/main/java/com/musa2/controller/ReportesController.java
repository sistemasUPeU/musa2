package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.service.ReportesService;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/reporte")
public class ReportesController {
	@Autowired
	private ReportesService reportesService;
	@Secured("ROLE_ADMIN")
	@GetMapping("/bus")
	public Map<String,Object> buses(){
		return reportesService.buses();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/user")
	public Map<String,Object> usuaios(){
		return reportesService.usuaios();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/conductor")
	public Map<String,Object> conductores(){
		return reportesService.conductores();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/opr")
	public Map<String,Object> opro(){
		return reportesService.opro();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/usro")
	public Map<String,Object> usro(){
		return reportesService.usro();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/pedr")
	public Map<String,Object> pedidosR(){
		return reportesService.pedidosR();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/pede")
	public Map<String,Object> pedidosE(){
		return reportesService.pedidosE();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/peda")
	public Map<String,Object> pedidosA(){
		return reportesService.pedidosA();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/vinculo")
	public Map<String,Object> Vinculo(){
		return reportesService.Vinculo();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/propietario")
	public Map<String,Object> Propietario(){
		return reportesService.Propietario();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/mantr")
	public Map<String,Object> MantR(){
		return reportesService.MantR();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/mantv")
	public Map<String,Object> MantV(){
		return reportesService.MantV();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/revd")
	public Map<String,Object> RevisionesD(){
		return reportesService.RevisionesD();
	}
}
