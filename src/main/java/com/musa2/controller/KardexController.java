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

import com.musa2.entity.Kardex;
import com.musa2.service.KardexService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/kardes")
public class KardexController {
@Autowired
private KardexService kardexService;

@GetMapping("/")
public Map<String, Object> readAll() {
	return kardexService.readAll();
}
@PostMapping("/add")
public int save(@RequestBody Kardex kar) {
	return kardexService.create(kar);
}
@DeleteMapping("/kar/{id}")
public int delete1(@PathVariable int id) {
return kardexService.delete(id);
}
@GetMapping("/{id}")
public Map<String,Object> read1(@PathVariable int id) {
	return kardexService.read(id);
}
@PutMapping("ka/{id}")
public int update(@RequestBody Kardex kar, @PathVariable int id ) {
	kar.setIdkardex(id);
	return kardexService.update(kar);
}
@GetMapping("/kar/{comp}")
public Map<String, Object> search(@PathVariable("comp") int nrocomprobante){
	return kardexService.findKardexByComprobante(nrocomprobante);
}

@GetMapping("/listandope/{idkardex}")
public Map<String, Object> buscarKardexByIdKardexProducto(@PathVariable("idkardex") int idkardex){
	System.out.println("baiscoasjdoasjdoasjdosaj");
	return kardexService.buscarKardexByIdKardexProducto(idkardex);
}


}