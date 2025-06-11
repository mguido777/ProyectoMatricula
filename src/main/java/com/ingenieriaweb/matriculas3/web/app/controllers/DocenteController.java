package com.ingenieriaweb.matriculas3.web.app.controllers;

import com.ingenieriaweb.matriculas3.web.app.models.Docente;
import com.ingenieriaweb.matriculas3.web.app.services.DocenteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/docentes")
@CrossOrigin(origins = "*")
public class DocenteController {
	
    private final DocenteService service;
    
    

    public DocenteController(DocenteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Docente> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Docente obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Docente crear(@RequestBody Docente docente) {
        return service.guardar(docente);
    }

    @PutMapping("/{id}")
    public Docente actualizar(@PathVariable Integer id, @RequestBody Docente docente) {
        Docente existente = service.obtenerPorId(id);
        if (existente != null) {
            existente.setPersona(docente.getPersona());
            existente.setUsuario(docente.getUsuario());
            existente.setEstado(docente.getEstado());
            return service.guardar(existente);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }

}
