package com.musa2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Roles;
import com.musa2.entity.VinculosRequisitos;
import com.musa2.service.VinculosRequisitosService;

@CrossOrigin ("*")
@RestController
@RequestMapping("/vinrequi")
public class VinculosRequisitosController {
	@Autowired
	private VinculosRequisitosService vincu;
	@PostMapping("/add/{tiporequisito}")
	public int create(@PathVariable int tiporequisito,@RequestBody  VinculosRequisitos vincurequi) {		
		return vincu.insertar(tiporequisito,vincurequi);		
	}
	@PutMapping("/{idvinculo}/{idrequisitos}")
	public int update(@PathVariable int idvinculo, @PathVariable int idrequisitos) {
		return vincu.update(idvinculo,idrequisitos);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read( @PathVariable int id) {
		return vincu.read(id);
	}
	@DeleteMapping("/{id}")
	public int delete( @PathVariable int id) {
		return vincu.delete(id);
	}
}
