package com.ingenieriaweb.matriculas3.web.app.dto;

public class RegisterRequest {
	private String username;
    private String password;
    private String correo_electronico;
    private String nombreRol; // puede ser un String como "ROLE_ADMIN"
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public String getRoles() {
		return nombreRol;
	}
	public void setRoles(String nombreRol) {
		this.nombreRol = nombreRol;
	}
    
    
}
