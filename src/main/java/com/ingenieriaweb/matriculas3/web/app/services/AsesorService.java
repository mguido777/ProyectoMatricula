package com.ingenieriaweb.matriculas3.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingenieriaweb.matriculas3.web.app.models.Asesor;
import com.ingenieriaweb.matriculas3.web.app.repositories.AsesorRepository;

@Service
public class AsesorService {

    @Autowired
    private AsesorRepository asesorRepository;

    public List<Asesor> listarTodos() {
        return asesorRepository.findAll();
    }
}