package com.ingenieriaweb.matriculas3.web.app.models;

public class Usuario {

	    private Integer idUsuario;

	    private String username;
	    private String passwordHash;
	    private String correoElectronico;
	    private String telefono;
	    

	    private Rol rol;

	    private Boolean estado = true;
	    
	    

	    public Usuario(Integer idUsuario, String username, String passwordHash, String correoElectronico,
				String telefono, Rol rol, Boolean estado) {
			super();
			this.idUsuario = idUsuario;
			this.username = username;
			this.passwordHash = passwordHash;
			this.correoElectronico = correoElectronico;
			this.telefono = telefono;
			this.rol = rol;
			this.estado = estado;
		}

		// Getters y Setters
	    public Integer getIdUsuario() {
	        return idUsuario;
	    }

	    public void setIdUsuario(Integer idUsuario) {
	        this.idUsuario = idUsuario;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPasswordHash() {
	        return passwordHash;
	    }

	    public void setPasswordHash(String passwordHash) {
	        this.passwordHash = passwordHash;
	    }

	    public String getCorreoElectronico() {
	        return correoElectronico;
	    }

	    public void setCorreoElectronico(String correoElectronico) {
	        this.correoElectronico = correoElectronico;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }

	    public Rol getRol() {
	        return rol;
	    }

	    public void setRol(Rol rol) {
	        this.rol = rol;
	    }

	    public Boolean getEstado() {
	        return estado;
	    }

	    public void setEstado(Boolean estado) {
	        this.estado = estado;
	    }
	
	
	
	

}
