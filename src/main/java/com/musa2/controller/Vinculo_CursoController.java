package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

	@PostMapping("/add")
	public int save(@RequestBody Vinculo_Curso vc) {
		System.out.println(vc.getFechaemision()+"fechas"+vc.getFechacaducidad());
		return vinculocursoservice.create(vc);
		
	}
	@PutMapping("/{curso}/{conductor}")
	public int update(@RequestBody Vinculo_Curso vc, @PathVariable int curso,@PathVariable int conductor) {
		vc.setCurso(curso);
		vc.setConductor(conductor);
		return vinculocursoservice.update(vc);

	
}
	@PutMapping("/upt/")
	public int delete(@RequestBody Vinculo_Curso vc) {		
	 return vinculocursoservice.delete(vc.getIdcurso(),vc.getIdconductor());
	}
	@GetMapping("/{idcur}/{idcon}")
	public Map<String,Object> read(@PathVariable int idcur,@PathVariable int idcon) {		
		return vinculocursoservice.read(idcur, idcon);
		
	}
	@GetMapping("/")
	public Map<String,Object> get(){
		return vinculocursoservice.readAll();
	}



	@GetMapping("/cur/{curs}")	
	public Map<String, Object> readNombre(@PathVariable String curs) {
	return vinculocursoservice.readNombre(curs);
	}

}
