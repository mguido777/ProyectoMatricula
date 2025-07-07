package com.ingenieriaweb.matriculas3.web.app.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ingenieriaweb.matriculas3.web.app.models.Rol;
import com.ingenieriaweb.matriculas3.web.app.models.Usuario;
import com.ingenieriaweb.matriculas3.web.app.models.Docente;
import com.ingenieriaweb.matriculas3.web.app.models.Pago;
import com.ingenieriaweb.matriculas3.web.app.services.PersonaService;
import com.ingenieriaweb.matriculas3.web.app.services.RolService;
import com.ingenieriaweb.matriculas3.web.app.services.UsuarioService;
import com.ingenieriaweb.matriculas3.web.app.services.DocenteService;


@Controller
@RequestMapping("/app")
public class IndexController {

	@Autowired
    private PersonaService personaService;
	
	@Autowired
    private RolService rolService;
	
	@Autowired
    private UsuarioService usuarioService;
	
	@Autowired
	private DocenteService docenteService;

	
	@GetMapping({"/", "/index" })
	public String index(){ 
		return "index"; 
	} 
	
	@GetMapping("/usuarios")
	public String usuarios(@RequestParam(required = false) Long rol, Model model) {
	    List<Usuario> usuarios;

	    if (rol != null) {
	        usuarios = usuarioService.buscarPorRolId(rol);
	        model.addAttribute("rolSeleccionado", rol);
	    } else {
	        usuarios = usuarioService.findAll();
	        model.addAttribute("rolSeleccionado", null);
	    }

	    model.addAttribute("usuarios", usuarios);
	    return "usuarios/index";
	}

	
	@GetMapping("/roles")
	public String roles(Model model) {
	    List<Rol> roles = rolService.findAll();
	    model.addAttribute("roles", roles);
	    return "roles/index";
	}
	
	@GetMapping("/personas" )
	public String personas(Model model) {

	    List<Rol> personas = rolService.findAll(); 
	    model.addAttribute("personas", personas); 
	    return "personas";
	}
	

}