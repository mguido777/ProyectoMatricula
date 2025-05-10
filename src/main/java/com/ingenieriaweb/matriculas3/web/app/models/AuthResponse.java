package com.ingenieriaweb.matriculas3.web.app.models;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class AuthResponse {
    private String token;
    private Collection<? extends GrantedAuthority> roles;

    public AuthResponse(String token, Collection<? extends GrantedAuthority> roles) {
        this.token = token;
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }
}
