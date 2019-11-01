package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Ubigeo;
import com.musa2.service.UbigeoService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/ubigeos")
public class UbigeoController {
@Autowired
private UbigeoService ubigeoService;

@GetMapping("/")
public Map<String, Object> readAll() {
	return ubigeoService.readAll();
}
@GetMapping("{id}")
public Map<String,Object> read1(@PathVariable int id) {
	return ubigeoService.read(id);
}
}
