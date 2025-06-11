package com.ingenieriaweb.matriculas3.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class CursosController {
	
	@GetMapping("/cursos")
    public String mostrarVistaAsesor(Model model) {
        
        return "cursos/index"; // busca 'asesor.html' en /resources/templates
    }


}