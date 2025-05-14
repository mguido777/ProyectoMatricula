package com.ingenieriaweb.matriculas3.web.app.controllers;

import com.ingenieriaweb.matriculas3.web.app.dto.RegisterRequest;
import com.ingenieriaweb.matriculas3.web.app.models.AuthResponse;
import com.ingenieriaweb.matriculas3.web.app.models.LoginRequest;
import com.ingenieriaweb.matriculas3.web.app.models.Rol;
import com.ingenieriaweb.matriculas3.web.app.models.Usuario;
import com.ingenieriaweb.matriculas3.web.app.repositories.RolRepository;
import com.ingenieriaweb.matriculas3.web.app.repositories.UsuarioRepository;
import com.ingenieriaweb.matriculas3.web.app.services.JwtService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4321")
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        Authentication authentication = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(), loginRequest.getPassword()
                )
        );

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String token = jwtService.generateToken(userDetails);

        return ResponseEntity.ok(new AuthResponse(token, userDetails.getAuthorities(), userDetails.getUsername())
);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        if (usuarioRepository.findByUsername(request.getUsername()).isPresent()) {
            return ResponseEntity.badRequest().body("El nombre de usuario ya existe");
        }

        Rol rol = rolRepository.findByNombreRol(request.getRoles())
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));

        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setUsername(request.getUsername());
        nuevoUsuario.setCorreoElectronico(request.getCorreo_electronico());
        nuevoUsuario.setPasswordHash(passwordEncoder.encode(request.getPassword()));
        nuevoUsuario.setEstado(true);
        nuevoUsuario.setRol(rol);

        usuarioRepository.save(nuevoUsuario);

        return ResponseEntity.ok("Usuario registrado correctamente");
    }
}
