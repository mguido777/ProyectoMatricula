package com.ingenieriaweb.matriculas3.web.app.services.impl;

import com.ingenieriaweb.matriculas3.web.app.models.Asesor;
import com.ingenieriaweb.matriculas3.web.app.repositories.AsesorRepository;
import com.ingenieriaweb.matriculas3.web.app.services.AsesorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsesorServiceImpl implements AsesorService {

    private final AsesorRepository repository;

    public AsesorServiceImpl(AsesorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Asesor> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Asesor obtenerPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Asesor guardar(Asesor asesor) {
        return repository.save(asesor);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}