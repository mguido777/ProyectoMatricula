package com.ingenieriaweb.matriculas3.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ingenieriaweb.matriculas3.web.app.models.Usuario;
import com.ingenieriaweb.matriculas3.web.app.repositories.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        List<GrantedAuthority> authorities = List.of(
        	    new SimpleGrantedAuthority("ROLE_" + usuario.getRol().getNombreRol())
        	);


        return new org.springframework.security.core.userdetails.User(
                usuario.getUsername(),
                usuario.getPasswordHash(),
                usuario.getEstado(),
                true, true, true,
                authorities
        );
    }

}

