package com.musa2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.service.EmpleadoService;
@CrossOrigin("*")

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	private EmpleadoService emp;
	
	@GetMapping("/lis")
	public List<Map<String,Object>> listar() {
		System.out.println(emp.listar());
		return emp.listar();
	}
	@GetMapping("/")
	public String asd() {
		System.out.println("no se por que no funciona");
		return "hola nick";
	}
}





