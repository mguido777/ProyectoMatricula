package com.ingenieriaweb.matriculas3.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ingenieriaweb.matriculas3.web.app.models.Usuario;
import com.ingenieriaweb.matriculas3.web.app.services.UsuarioDetailsService;

@Controller
public class LoginController {

	@Autowired
    private UsuarioDetailsService usuarioService;
	  @GetMapping("/login")
	    public String mostrarFormularioLogin() {
	        return "login";
	    }
	  
	  @GetMapping("/registro")
	    public String mostrarFormularioRegistro(Model model) {
	        model.addAttribute("usuario", new Usuario());
	        return "registro";
	    }

	    
}
