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


import com.musa2.entity.Cursos;
import com.musa2.service.CursosService;

@RestController
@RequestMapping("/cursos")
public class CursosController {
	@Autowired
    private CursosService cursosService;
	@GetMapping("/")
	public Map<String,Object> get(){
		return cursosService.readAll();
	}

	@PostMapping("/add")
	public int save(@RequestBody Cursos cursos) {		
		return cursosService.create(cursos);
		
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {		
	 return cursosService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read(@PathVariable int id) {		
		return cursosService.read(id);
		
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Cursos cursos, @PathVariable int id) {
		return cursosService.update(cursos);

	
}
	@GetMapping("/nom/")
	public Map<String,Object> get2(@PathVariable String nombrecurso){
		return cursosService.read(nombrecurso);
		
	}
	@GetMapping("/cur/{curs}")	
	public Map<String, Object> search(@PathVariable("curs") int nombrecurso) {
	return cursosService.findCursosByNombre(nombrecurso);
	}
}