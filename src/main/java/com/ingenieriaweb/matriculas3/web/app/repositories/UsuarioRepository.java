package com.ingenieriaweb.matriculas3.web.app.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingenieriaweb.matriculas3.web.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
    List<Usuario> findByRol_IdRol(Long idRol); // ✅ Esto sí funciona
}