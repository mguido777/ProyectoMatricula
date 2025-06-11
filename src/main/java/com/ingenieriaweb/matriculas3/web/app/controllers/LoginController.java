package com.ingenieriaweb.matriculas3.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ingenieriaweb.matriculas3.web.app.models.Usuario;
import com.ingenieriaweb.matriculas3.web.app.services.UsuarioDetailsService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	@Autowired
    private UsuarioDetailsService usuarioService;
	  @GetMapping("/login")
	    public String mostrarFormularioLogin() {
	        return "login";
	    }
	  
	  @GetMapping("/registro")
	    public String mostrarFormularioRegistro(Model model) {
	        model.addAttribute("usuario", new Usuario());
	        return "registro";
	    }
	  
	  @GetMapping("/salir")
	  public String salir(HttpServletRequest request, HttpServletResponse response) {
	      // Limpia la sesión y borra cookies
	      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      if (auth != null){
	          new SecurityContextLogoutHandler().logout(request, response, auth);
	      }

	      // Elimina cookies manualmente (opcional)
	      Cookie cookie = new Cookie("JSESSIONID", null);
	      cookie.setPath("/");
	      cookie.setMaxAge(0);
	      response.addCookie(cookie);

	      return "redirect:http://localhost:4321";
	  }





	    
}
