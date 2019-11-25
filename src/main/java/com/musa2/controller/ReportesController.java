package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping("/bus")
	public Map<String,Object> buses(){
		return reportesService.buses();
	}
	@GetMapping("/user")
	public Map<String,Object> usuaios(){
		return reportesService.usuaios();
	}
	@GetMapping("/conductor")
	public Map<String,Object> conductores(){
		return reportesService.conductores();
	}
	@GetMapping("/opr")
	public Map<String,Object> opro(){
		return reportesService.opro();
	}
	@GetMapping("/usro")
	public Map<String,Object> usro(){
		return reportesService.usro();
	}
	@GetMapping("/pedr")
	public Map<String,Object> pedidosR(){
		return reportesService.pedidosR();
	}
	@GetMapping("/pede")
	public Map<String,Object> pedidosE(){
		return reportesService.pedidosE();
	}
	@GetMapping("/peda")
	public Map<String,Object> pedidosA(){
		return reportesService.pedidosA();
	}
	@GetMapping("/vinculo")
	public Map<String,Object> Vinculo(){
		return reportesService.Vinculo();
	}
	@GetMapping("/propietario")
	public Map<String,Object> Propietario(){
		return reportesService.Propietario();
	}
	@GetMapping("/mantr")
	public Map<String,Object> MantR(){
		return reportesService.MantR();
	}
	@GetMapping("/mantv")
	public Map<String,Object> MantV(){
		return reportesService.MantV();
	}
	@GetMapping("/revd")
	public Map<String,Object> RevisionesD(){
		return reportesService.RevisionesD();
	}
}
