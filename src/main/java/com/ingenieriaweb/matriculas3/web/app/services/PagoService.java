package com.ingenieriaweb.matriculas3.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingenieriaweb.matriculas3.web.app.models.Pago;
import com.ingenieriaweb.matriculas3.web.app.repositories.PagoRepository;

@Service
public class PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    public List<Pago> listarTodos() {
        return pagoRepository.findAll();
    }

    public Pago guardar(Pago pago) {
        return pagoRepository.save(pago);
    }

    public Pago obtenerPorId(Integer id) {
        return pagoRepository.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        pagoRepository.deleteById(id);
    }
}
