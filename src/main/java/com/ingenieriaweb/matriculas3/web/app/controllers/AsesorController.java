package com.ingenieriaweb.matriculas3.web.app.controllers;

import com.ingenieriaweb.matriculas3.web.app.models.Asesor;
import com.ingenieriaweb.matriculas3.web.app.services.AsesorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/app/asesores")
public class AsesorController {

    private final AsesorService asesorService;

    public AsesorController(AsesorService asesorService) {
        this.asesorService = asesorService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("asesores", asesorService.listarTodos());
        return "asesores/muestra"; // Crear vista asesores/index.html
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Asesor asesor = asesorService.obtenerPorId(id);
        model.addAttribute("asesor", asesor);
        return "asesores/editar"; // Crear vista asesores/editar.html
    }

    @PostMapping("/editar/{id}")
    public String actualizar(@PathVariable Integer id, @ModelAttribute Asesor asesor) {
        Asesor existente = asesorService.obtenerPorId(id);

        if (existente != null) {
            if (asesor.getPersona() != null && existente.getPersona() != null) {
                existente.getPersona().setNombres(asesor.getPersona().getNombres());
                existente.getPersona().setApellidos(asesor.getPersona().getApellidos());
            }

            existente.setEstado(asesor.getEstado());
            asesorService.guardar(existente);
        }

        return "redirect:/app/asesores";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        asesorService.eliminar(id);
        return "redirect:/app/asesores";
    }
    
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("asesor", new Asesor());
        return "asesores/create"; // crea esta vista
    }

    @PostMapping("/nuevo")
    public String guardarNuevo(@ModelAttribute Asesor asesor) {
        asesorService.guardar(asesor);
        return "redirect:/app/asesores";
    }
    
    
    
}