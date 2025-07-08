package com.ingenieriaweb.matriculas3.web.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ingenieriaweb.matriculas3.web.app.models.Periodo;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Integer> {
    // Puedes agregar métodos personalizados si los necesitas
}
