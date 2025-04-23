package com.ingenieriaweb.matriculas3.web.app.models;

public class Administrador {

public int idAdmin;
	

    private Persona persona;


    private Usuario usuario;

    private Boolean estado = true;


    

	public Administrador(int idAdmin, Persona persona, Usuario usuario, Boolean estado) {
		super();
		this.idAdmin = idAdmin;
		this.persona = persona;
		this.usuario = usuario;
		this.estado = estado;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
    
}
