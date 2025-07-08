package com.ingenieriaweb.matriculas3.web.app.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ingenieriaweb.matriculas3.web.app.dto.PagoRequest;
import com.ingenieriaweb.matriculas3.web.app.models.Docente;
import com.ingenieriaweb.matriculas3.web.app.models.Matricula;
import com.ingenieriaweb.matriculas3.web.app.models.Pago;
import com.ingenieriaweb.matriculas3.web.app.models.Periodo;
import com.ingenieriaweb.matriculas3.web.app.models.Persona;
import com.ingenieriaweb.matriculas3.web.app.models.Usuario;
import com.ingenieriaweb.matriculas3.web.app.repositories.DocenteRepository;
import com.ingenieriaweb.matriculas3.web.app.repositories.MatriculaRepository;
import com.ingenieriaweb.matriculas3.web.app.repositories.PagoRepository;
import com.ingenieriaweb.matriculas3.web.app.repositories.PeriodoRepository;
import com.ingenieriaweb.matriculas3.web.app.repositories.PersonaRepository;
import com.ingenieriaweb.matriculas3.web.app.repositories.RolRepository;
import com.ingenieriaweb.matriculas3.web.app.repositories.UsuarioRepository;

@Service
public class PagoService {

    @Autowired
    private PagoRepository pagoRepository;
    
    @Autowired
    private PersonaRepository personaRepository;
    
    @Autowired
    private DocenteRepository docenteRepository;
    
    @Autowired
    private RolRepository rolRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private MatriculaRepository matriculaRepository;
    
    @Autowired
    private PeriodoRepository periodoRepository;

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
    
    private String generarUsername(PagoRequest request) {
        String nombre = request.getNombres() != null ? request.getNombres().trim().toLowerCase().replaceAll("\\s+", "") : "usuario";
        int numero = (int)(Math.random() * 900) + 100; // número aleatorio de 3 dígitos
        return nombre + numero;
    }

    
    public void procesarPagoDesdeRequest(PagoRequest request) {
        // 1. Crear Persona
        Persona persona = new Persona();
        persona.setNombres(request.getNombres());
        persona.setApellidos(request.getApellidos());
        persona.setDni(request.getDni());
        persona.setDireccion(request.getDireccion());
        persona.setTelefono(request.getTelefono());
        persona.setCorreo(request.getCorreo());
        persona.setEstado(true);
        persona = personaRepository.save(persona);

        // 2. Crear Usuario genérico
        Usuario usuario = new Usuario();
        usuario.setUsername(request.getUsername() != null ? request.getUsername() : generarUsername(request));
        usuario.setPasswordHash(new BCryptPasswordEncoder().encode("123456"));
        usuario.setCorreoElectronico(request.getCorreo());
        usuario.setTelefono(request.getTelefono());
        usuario.setEstado(true);
        usuario.setRol(rolRepository.findByNombreRol("DOCENTE").orElseThrow());
        usuario = usuarioRepository.save(usuario);

        // 3. Crear Docente
        Docente docente = new Docente();
        docente.setPersona(persona);
        docente.setUsuario(usuario);
        docente.setEstado(true);
        docente = docenteRepository.save(docente);

        Periodo p = new Periodo();
        p.setNombrePeriodo("AGOSTO - DICIEMBRE");
        p.setFechaInicio(LocalDate.of(2025, 8, 1));
        p.setFechaFin(LocalDate.of(2025, 12, 15));
        p.setEstado(true);
        periodoRepository.save(p);
     

        // 5. Crear Matricula
        Matricula matricula = new Matricula();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        matricula.setFechaMatricula(LocalDate.now().format(formatter));
        matricula.setFechaLimitePago(LocalDate.now().plusDays(7).format(formatter));
        matricula.setDocente(docente);
        matricula.setPeriodo(p);
        matricula.setEstadoActual(1);
        matricula.setEstado(true);
        matricula = matriculaRepository.save(matricula);

        // 6. Crear Pago
        Pago pago = new Pago();
        pago.setFechaPago(request.getFechaPago() != null ? request.getFechaPago() : LocalDate.now());
        pago.setMontoPagado(request.getPrecio());
        pago.setMedioPago(request.getMetodoPago());
        pago.setReferenciaPago(request.getReferenciaPago());
        pago.setMatricula(matricula);
        pago.setEstadoActual(1);
        pago.setEstado(true);

        pagoRepository.save(pago);
    }

}
