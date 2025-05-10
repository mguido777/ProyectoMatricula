package com.ingenieriaweb.matriculas3.web.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingenieriaweb.matriculas3.web.app.models.Persona;
import com.ingenieriaweb.matriculas3.web.app.repositories.PersonaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Persona findById(Long idPersona) {
        Optional<Persona> persona = personaRepository.findById(idPersona);
        return persona.orElse(null);
    }

    public void save(Persona persona) {
        personaRepository.save(persona);
    }

    public void deleteById(Long idPersona) {
        personaRepository.deleteById(idPersona);
    }
}

