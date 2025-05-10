package com.ingenieriaweb.matriculas3.web.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ingenieriaweb.matriculas3.web.app.models.Usuario;
import com.ingenieriaweb.matriculas3.web.app.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	 @Autowired
	    private UsuarioRepository usuarioRepository;

	    @Autowired
	    private PasswordEncoder passwordEncoder;

	    public void registrarUsuario(Usuario usuario) {
	        usuario.setPasswordHash(passwordEncoder.encode(usuario.getPasswordHash()));
	        usuarioRepository.save(usuario);
	    }
}
