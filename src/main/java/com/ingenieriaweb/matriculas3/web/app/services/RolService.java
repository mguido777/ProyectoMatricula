package com.ingenieriaweb.matriculas3.web.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingenieriaweb.matriculas3.web.app.models.Persona;
import com.ingenieriaweb.matriculas3.web.app.models.Rol;
import com.ingenieriaweb.matriculas3.web.app.repositories.PersonaRepository;
import com.ingenieriaweb.matriculas3.web.app.repositories.RolRepository;

@Service
public class RolService {
	 @Autowired
	    private RolRepository rolRepository;

	    public List<Rol> findAll() {
	        return rolRepository.findAll();
	    }

	    public Rol findById(int idRol) {
	        Optional<Rol> rol = rolRepository.findById(idRol);
	        return rol.orElse(null);
	    }

	    public void save(Rol rol) {
	    	rolRepository.save(rol);
	    }

	    public void deleteById(int idRol) {
	    	rolRepository.deleteById(idRol);
	    }
}
