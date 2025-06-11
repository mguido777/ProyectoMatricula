package com.ingenieriaweb.matriculas3.web.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ingenieriaweb.matriculas3.web.app.models.Persona;
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
	    
	    public List<Usuario> findAll() {
	        return usuarioRepository.findAll();
	    }
	    
	    public Usuario findById(Long idUsuario) {
	        Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
	        return usuario.orElse(null);
	    }
	    
	    public List<Usuario> buscarPorRolId(Long idRol) {
	        return usuarioRepository.findByRol_IdRol(idRol);
	    }


	    public void save(Usuario usuario) {
	    	usuarioRepository.save(usuario);
	    }

	    public void deleteById(Long idUsuario) {
	    	usuarioRepository.deleteById(idUsuario);
	    }
	    
	    public Usuario buscarPorId(Long id) {
	        return usuarioRepository.findById(id).orElse(null);
	    }

	    public void actualizar(Usuario usuario) {
	        usuarioRepository.save(usuario);
	    }
}
