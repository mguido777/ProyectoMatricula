package com.ingenieriaweb.matriculas3.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ingenieriaweb.matriculas3.web.app.models.Rol;
import com.ingenieriaweb.matriculas3.web.app.models.Usuario;
import com.ingenieriaweb.matriculas3.web.app.services.RolService;
import com.ingenieriaweb.matriculas3.web.app.services.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	
	@Autowired
    private UsuarioService usuarioService;
	
	@Autowired
    private RolService rolService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
		@GetMapping("/crear")
	    public String mostrarFormularioCrear(Model model) {
	        model.addAttribute("usuario", new Usuario());
	        model.addAttribute("roles", rolService.findAll());
	        return "usuarios/create"; // carpeta templates/usuarios/create.html
	    }

		 @PostMapping("/guardar")
	    public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
	        String hashed = new BCryptPasswordEncoder().encode(usuario.getPasswordHash());
	        usuario.setPasswordHash(hashed);

	        usuarioService.save(usuario);
	        return "redirect:/app/usuarios";
	    }

	    @GetMapping("/eliminar/{id}")
	    public String eliminarUsuario(@PathVariable Long id) {
	    	usuarioService.deleteById(id);
	        return "redirect:/app/usuarios";
	    }
	    
	    @GetMapping("/editar/{id}")
	    public String editar(@PathVariable("id") Long id, Model model) {
	        Usuario usuario = usuarioService.buscarPorId(id);
	        if (usuario == null) {
	            return "redirect:/usuarios";
	        }
	        model.addAttribute("usuario", usuario);
	        return "usuarios/edit"; 
	    }
	    
	    @PostMapping("/actualizar")
	    public String actualizarUsuario(
	            @ModelAttribute("usuario") Usuario usuarioActualizado,
	            @RequestParam(required = false) String nuevaPassword,
	            @RequestParam(required = false) String confirmarPassword,
	            @RequestParam("rol") Long idRol) {

	    	Long id = usuarioActualizado.getIdUsuario().longValue();
	    	Usuario usuarioExistente = usuarioService.buscarPorId(id);

	        if (usuarioExistente == null) {
	            return "redirect:/usuarios";
	        }

	        usuarioExistente.setUsername(usuarioActualizado.getUsername());
	        usuarioExistente.setCorreoElectronico(usuarioActualizado.getCorreoElectronico());

	        if (nuevaPassword != null && !nuevaPassword.isEmpty()
	                && confirmarPassword != null && !confirmarPassword.isEmpty()) {
	            if (nuevaPassword.equals(confirmarPassword)) {
	                String encryptedPassword = passwordEncoder.encode(nuevaPassword);
	                usuarioExistente.setPasswordHash(encryptedPassword);
	            } else {
	                return "redirect:/usuarios/editar/" + usuarioActualizado.getIdUsuario();
	            }
	        }


	        Rol nuevoRol = new Rol();
	        nuevoRol.setIdRol(idRol.intValue());

	        usuarioExistente.setRol(nuevoRol);

	        usuarioService.actualizar(usuarioExistente);
	        return "redirect:/app/usuarios";
	    }

}
