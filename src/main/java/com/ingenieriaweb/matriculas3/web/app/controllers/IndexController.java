package com.ingenieriaweb.matriculas3.web.app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/", "/index" })
	public String index(){ 
		return "index"; 
		} 
	@GetMapping("/usuarios" )
	public String usuarios(){ 
		return "usuarios"; 
		} 
	
}