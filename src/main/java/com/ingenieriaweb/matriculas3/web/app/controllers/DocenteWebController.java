package com.ingenieriaweb.matriculas3.web.app.controllers;

import com.ingenieriaweb.matriculas3.web.app.models.Docente;
import com.ingenieriaweb.matriculas3.web.app.services.DocenteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/app/docentes")
public class DocenteWebController {

    private final DocenteService docenteService;

    public DocenteWebController(DocenteService docenteService) {
        this.docenteService = docenteService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("docentes", docenteService.listarTodos());
        return "docentes/index"; // Tu vista HTML
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Docente docente = docenteService.obtenerPorId(id);
        model.addAttribute("docente", docente);
        return "docentes/editar"; // Vista con formulario para editar
    }

    @PostMapping("/editar/{id}")
    public String actualizar(@PathVariable Integer id, @ModelAttribute Docente docente) {
        Docente existente = docenteService.obtenerPorId(id);

        if (existente != null) {
            if (docente.getPersona() != null && existente.getPersona() != null) {
                existente.getPersona().setNombres(docente.getPersona().getNombres());
                existente.getPersona().setApellidos(docente.getPersona().getApellidos());
                // NO tocamos el DNI
            }

            // El usuario se conserva
            existente.setUsuario(existente.getUsuario());

            // 🔄 Aquí se actualiza el estado del docente (activo/inactivo)
            existente.setEstado(docente.getEstado());

            docenteService.guardar(existente);
        }

        return "redirect:/app/docentes";
    }


    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        docenteService.eliminar(id);
        return "redirect:/app/docentes";
    }
}
