package com.ingenieriaweb.matriculas3.web.app.services;
import com.ingenieriaweb.matriculas3.web.app.models.Asesor;
import java.util.List;


public interface AsesorService {

    List<Asesor> listarTodos();
    Asesor obtenerPorId(Integer id);
    Asesor guardar(Asesor asesor);
    void eliminar(Integer id);
}