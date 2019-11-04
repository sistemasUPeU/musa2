package com.musa2.controller;

import java.util.List;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.entity.Personas;
import com.musa2.service.PersonasService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/personas")
public class PersonasController {
	@Autowired
	private PersonasService personasService;
	@GetMapping("/")
	public Map<String, Object> readAll() {
		return personasService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Personas P) {
		return personasService.create(P);
	}
	@DeleteMapping("/{id}")
	public int delete1(@PathVariable int id) {
		return personasService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String,Object> read1(@PathVariable int id) {		
		return personasService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Personas per, @PathVariable int id) {
		per.setIdpersona(id);
		return personasService.update(per);
	}
	@GetMapping("/P/{docu}")
	public Map<String, Object> search(@PathVariable("docu") int nrodoc) {
return personasService.findPersonasByDocumento(nrodoc);
	}
}