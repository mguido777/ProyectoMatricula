package com.ingenieriaweb.matriculas3.web.app.services.impl;

import com.ingenieriaweb.matriculas3.web.app.models.Docente;
import com.ingenieriaweb.matriculas3.web.app.repositories.DocenteRepository;
import com.ingenieriaweb.matriculas3.web.app.services.DocenteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImpl implements DocenteService {

    private final DocenteRepository repository;

    public DocenteServiceImpl(DocenteRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Docente> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Docente obtenerPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Docente guardar(Docente docente) {
        return repository.save(docente);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
    
}
