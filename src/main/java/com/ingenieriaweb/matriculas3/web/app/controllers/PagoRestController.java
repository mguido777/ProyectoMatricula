package com.ingenieriaweb.matriculas3.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingenieriaweb.matriculas3.web.app.dto.PagoRequest;
import com.ingenieriaweb.matriculas3.web.app.services.PagoService;

@RestController
@RequestMapping("/api/pagos")
@CrossOrigin(origins = "*") // Habilita solicitudes desde Astro
public class PagoRestController {

    @Autowired
    private PagoService pagoService;

    @PostMapping(consumes = "multipart/form-data")
    public String registrarPago(@ModelAttribute PagoRequest request) {
        // Puedes imprimir campos para verificar
        System.out.println("Recibido pago de: " + request.getNombres());

        pagoService.procesarPagoDesdeRequest(request);

        return "Pago registrado correctamente en la base de datos";
    }
}
