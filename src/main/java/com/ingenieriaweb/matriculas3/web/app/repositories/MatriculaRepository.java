package com.ingenieriaweb.matriculas3.web.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ingenieriaweb.matriculas3.web.app.models.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

}
