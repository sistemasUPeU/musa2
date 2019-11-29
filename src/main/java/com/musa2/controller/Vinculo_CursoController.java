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

import com.musa2.entity.Vinculo_Curso;
import com.musa2.service.Vinculo_CursoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vinculocurso")
public class Vinculo_CursoController {
	@Autowired
    private Vinculo_CursoService vinculocursoservice;
	@Secured("ROLE_ADMIN")
	@PostMapping("/add")
	public int save(@RequestBody Vinculo_Curso vc) {
		System.out.println(vc.getFechaemision()+"fechas"+vc.getFechacaducidad());
		return vinculocursoservice.create(vc);
		
	}
	@Secured("ROLE_ADMIN")
	@PutMapping("/{curso}/{conductor}")
	public int update(@RequestBody Vinculo_Curso vc, @PathVariable int curso,@PathVariable int conductor) {
		vc.setCurso(curso);
		vc.setConductor(conductor);
		return vinculocursoservice.update(vc);

	
}
	@Secured("ROLE_ADMIN")
	@DeleteMapping("/upt/{idcur}/{idcon}")
	public int delete(@PathVariable int idcur,@PathVariable int idcon) {		
	 return vinculocursoservice.delete(idcur, idcon);
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/{idcur}/{idcon}")
	public Map<String,Object> read(@PathVariable int idcur,@PathVariable int idcon) {		
		return vinculocursoservice.read(idcur, idcon);
		
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/")
	public Map<String,Object> get(){
		return vinculocursoservice.readAll();
	}


	@Secured("ROLE_ADMIN")
	@GetMapping("/cur/{curs}")	
	public Map<String, Object> readNombre(@PathVariable String curs) {
	return vinculocursoservice.readNombre(curs);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/nombre/{nombrecurso}")	
	public Map<String, Object> name(@PathVariable String nombrecurso) {
	return vinculocursoservice.name(nombrecurso);
	}
	
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/selcur/")
	public Map<String, Object> readSelectcur(){
		
		return vinculocursoservice.readSelectcur();
	}
	@Secured("ROLE_ADMIN")
	@GetMapping("/selccon/")
	public Map<String, Object> readSelectcon(){
		
		return vinculocursoservice.readSelectcon();
	}
	

}
