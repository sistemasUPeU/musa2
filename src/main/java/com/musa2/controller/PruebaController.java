package com.musa2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa2.service.PruebaService;

@RestController
@RequestMapping("/")
public class PruebaController {
   @Autowired
   private PruebaService pruebaService;
   
   @GetMapping
   public String getmensaje() {
	   String text = "Sistema MUSA";
	   return pruebaService.mensaje(text);
	   
   } 
}
