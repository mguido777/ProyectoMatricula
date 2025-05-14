package com.ingenieriaweb.matriculas3.web.app.models;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class AuthResponse {
	 private String token;
	    private Collection<? extends GrantedAuthority> roles;
	    private String username;

	    public AuthResponse(String token, Collection<? extends GrantedAuthority> roles, String username) {
	        this.token = token;
	        this.roles = roles;
	        this.username = username;
	    }

	    // Getters y setters obligatorios (puedes generarlos con tu IDE)
	    public String getToken() {
	        return token;
	    }

	    public void setToken(String token) {
	        this.token = token;
	    }

	    public Collection<? extends GrantedAuthority> getRoles() {
	        return roles;
	    }

	    public void setRoles(Collection<? extends GrantedAuthority> roles) {
	        this.roles = roles;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }
}
