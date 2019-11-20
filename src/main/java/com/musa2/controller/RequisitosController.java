package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Requisitos;
import com.musa2.service.RequisitosService;

@RestController
@RequestMapping("/requisitos")
public class RequisitosController {
	@Autowired
	private RequisitosService requisitosService;
	@GetMapping("/")
	public Map<String,Object> get(){
		return requisitosService.lista();
	}
	@PostMapping("/add")
	public int save(@RequestBody Requisitos requisito) {		
		return requisitosService.create(requisito);		
	}
	@DeleteMapping("/{id}")
	public int delete1(@PathVariable int id) {		
		return requisitosService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return requisitosService.read(id);
	}
	@PutMapping("/{id}")
	public int update1(@RequestBody Requisitos req, @PathVariable int id) {
		req.setIdrequisito(id);;
		return requisitosService.edit(req);
	}
}
