package com.ingenieriaweb.matriculas3.web.app.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.matriculas3.web.app.models.Rol;
import com.ingenieriaweb.matriculas3.web.app.services.PersonaService;
import com.ingenieriaweb.matriculas3.web.app.services.RolService;


@Controller
@RequestMapping("/app")
public class IndexController {

	@Autowired
    private PersonaService personaService;
	
	@Autowired
    private RolService rolService;
	
	
	
	@GetMapping({"/", "/index" })
	public String index(){ 
		return "index"; 
		} 
	
	@GetMapping("/usuarios" )
	public String usuarios(){ 
		return "usuarios.index"; 
		} 
	
	@GetMapping("/roles" )
	public String roles(){ 
		return "roles.index"; 
		} 
	
	@GetMapping("/personas" )
	public String personas(Model model) {

	    List<Rol> personas = rolService.findAll(); 
	    model.addAttribute("personas", personas); 
	    return "personas";
	}
	
}