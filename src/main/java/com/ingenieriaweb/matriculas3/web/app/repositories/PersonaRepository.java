package com.ingenieriaweb.matriculas3.web.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingenieriaweb.matriculas3.web.app.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
