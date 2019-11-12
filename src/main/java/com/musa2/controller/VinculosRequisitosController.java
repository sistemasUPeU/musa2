package com.musa2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Roles;
import com.musa2.entity.VinculosRequisitos;
import com.musa2.service.VinculosRequisitosService;

@CrossOrigin (origins= "*")
@RestController
@RequestMapping("/vinrequi")
public class VinculosRequisitosController {
	@Autowired
	private VinculosRequisitosService vincu;
	@PostMapping("/add")
	public int create(@RequestBody int idvinculo,@RequestBody int tiporequisitos) {		
		return vincu.insertar(idvinculo,tiporequisitos);		
	}
	@PutMapping("/{idvinculo}/{idrequisitos}")
	public int update(@PathVariable int idvinculo, @PathVariable int idrequisitos) {
		return vincu.update(idvinculo,idrequisitos);
	}
}
