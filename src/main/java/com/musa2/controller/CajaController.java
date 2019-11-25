package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Caja;
import com.musa2.service.CajaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
@RequestMapping("/caja")
public class CajaController {
	@Autowired
	private CajaService cajaService;
	
	@Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public Map<String, Object> create(@RequestBody Caja caja) {		
		return cajaService.create(caja);		
	}
}
