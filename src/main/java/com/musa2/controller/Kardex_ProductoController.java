package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.service.Kardex_ProductoService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/kardexproducto")
public class Kardex_ProductoController {
	
	@Autowired
	private Kardex_ProductoService kps;
	
	
	@GetMapping("/listar")
	public Map<String, Object> readAll() {
		return kps.readAll();
	}
	
}
