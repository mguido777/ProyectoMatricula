package com.ingenieriaweb.matriculas3.web.app.services;

import com.ingenieriaweb.matriculas3.web.app.models.Docente;

import java.util.List;

public interface DocenteService {
	
    List<Docente> listarTodos();
    Docente obtenerPorId(Integer id);
    Docente guardar(Docente docente);
    void eliminar(Integer id);
}
