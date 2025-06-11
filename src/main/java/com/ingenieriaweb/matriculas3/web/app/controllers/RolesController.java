package com.ingenieriaweb.matriculas3.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ingenieriaweb.matriculas3.web.app.models.Rol;
import com.ingenieriaweb.matriculas3.web.app.services.RolService;

@Controller

public class RolesController {
	
	@Autowired
    private RolService rolService;

	@GetMapping("/roles/crear")
    public String mostrarFormularioCrearRol(Model model) {
        model.addAttribute("rol", new Rol());
        return "/roles/create";
    }

    @PostMapping("/roles/guardar")
    public String guardarRol(@ModelAttribute("rol") Rol rol) {
        rolService.save(rol);
        return "redirect:/app/roles";
    }
    
    @GetMapping("/roles/eliminar/{id}")
    public String eliminarRol(@PathVariable("id") int idRol) {
        rolService.deleteById(idRol);
        return "redirect:/app/roles";
    }



}
