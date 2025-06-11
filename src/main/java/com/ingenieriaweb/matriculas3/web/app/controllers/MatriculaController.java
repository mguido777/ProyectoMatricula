package com.ingenieriaweb.matriculas3.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MatriculaController {
	
	@GetMapping("/matriculas")
    public String mostrarVistaAsesor(Model model) {
        
        return "matriculas/index"; // busca 'asesor.html' en /resources/templates
    }
	
	@GetMapping("/matriculas/registrar")
    public String registrar(Model model) {
        
        return "matriculas/registrar"; // busca 'asesor.html' en /resources/templates
    }


}