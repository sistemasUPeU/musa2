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


import com.musa2.entity.Cursos;
import com.musa2.service.CursosService;
@CrossOrigin("*")
@RestController
@RequestMapping("/cursos")
public class CursosController {
	@Autowired
    private CursosService cursosService;
	@Secured("ROLE_ADMIN")
	@GetMapping("/")
	public Map<String,Object> get(){
		return cursosService.readAll();
	}
	
	@Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public int save(@RequestBody Cursos cursos) {	
		System.out.println(cursos.getNombrecurso()+" si entro hasta controller");
		return cursosService.create(cursos);
		
	}
	@Secured("ROLE_ADMIN")
	@DeleteMapping("/upt/{id}")
	public int delete(@PathVariable int id) {		
	 return cursosService.delete(id);
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/{id}")
	public Map<String,Object> read(@PathVariable int id) {		
		return cursosService.read(id);
		
	}
	@Secured("ROLE_ADMIN")
	@PutMapping("/{id}")
	public int update(@RequestBody Cursos cursos, @PathVariable int id) {
		return cursosService.update(cursos);

	
}
	@Secured("ROLE_ADMIN")
	@GetMapping("/nom/")
	public Map<String,Object> get2(@PathVariable String nombrecurso){
		return cursosService.read(nombrecurso);
		
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/cur/{nombrecurso}")	
	public Map<String, Object> search(@PathVariable String nombrecurso) {
	return cursosService.findCursosByNombre(nombrecurso);
	}
	
}