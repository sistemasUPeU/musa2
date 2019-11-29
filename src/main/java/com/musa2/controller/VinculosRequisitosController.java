package com.musa2.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.musa2.entity.Roles;
import com.musa2.entity.VinculosRequisitos;
import com.musa2.service.VinculosRequisitosService;
@RestController
@RequestMapping("/vinrequi")
public class VinculosRequisitosController {
	@Autowired
	private VinculosRequisitosService vincu;
	
	
	@Secured("ROLE_ADMIN")
	@PostMapping("/add/{tiporequisito}/{vincurequi}")
	public int create(@PathVariable int tiporequisito,@PathVariable  int vincurequi) {		
		return vincu.insertar(tiporequisito,vincurequi);		
	}
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/actua/{idvincu}/{idrequi}")
	public int update(@PathVariable int idvincu,@PathVariable  int idrequi) {
		VinculosRequisitos vincurequi = new VinculosRequisitos();
		vincurequi.setIdrequisitos(idrequi);
		vincurequi.setIdvinculo(idvincu);
		return vincu.update(vincurequi);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/{id}")
	public Map<String, Object> read( @PathVariable int id) {
		return vincu.read(id);
	}
	
	@Secured("ROLE_ADMIN")
	@DeleteMapping("/{id}")
	public int delete( @PathVariable int id) {
		return vincu.delete(id);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/{idv}/{idr}")
	public VinculosRequisitos listarid( @PathVariable int idv, @PathVariable int idr) {
		return vincu.listarid(idv, idr);
	}
	public void name() {
		
	}
	@Secured("ROLE_ADMIN")
	@PostMapping("/upload")
	public ResponseEntity<?> subirarchivos(@RequestParam("archivo") MultipartFile archivo, @RequestParam("idv") int idv, @RequestParam("idr") int idr){
		Map<String, Object> response = new HashMap<>();
		
		VinculosRequisitos vinre = vincu.listarid(idv, idr);
		
		if(!archivo.isEmpty()) {
			String nombreArchivo = UUID.randomUUID().toString()+"_"+archivo.getOriginalFilename().replace(" ", "");
			Path rutaArchivo = Paths.get("D://Musadoc").resolve(nombreArchivo).toAbsolutePath();
			
			try {
				Files.copy(archivo.getInputStream(), rutaArchivo);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				response.put("mensaje", "Error al subir la imagen : " +nombreArchivo);
				response.put("error", e.getMessage().concat(":").concat(e.getCause().getMessage()));
				return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			String nombrefotoanterior = vinre.getEnlacedoc();
			
			if (nombrefotoanterior != null || nombrefotoanterior.length() >0) {
				Path rutaFotoAnterior = Paths.get("D://Musadoc").resolve(nombrefotoanterior).toAbsolutePath();
				File archivoanterior = rutaFotoAnterior.toFile();
				if (archivoanterior.exists() && archivoanterior.canRead()) {
					archivoanterior.delete();
				}
			}
			vinre.setEnlacedoc(nombreArchivo);
			
			
			vincu.update(idv, idr, nombreArchivo);
			response.put("vinculosrequisitos", vinre);
			response.put("mensaje", "has subido correctamente las fotos " + nombreArchivo);
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	
}
