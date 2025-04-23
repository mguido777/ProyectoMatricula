package com.ingenieriaweb.matriculas3.web.app.models;

public class Asesor {

	public int idAsesor;
	

    private Persona persona;


    private Usuario usuario;

    private Boolean estado = true;

	public Asesor(int idAsesor, Persona persona, Usuario usuario, Boolean estado) {
		super();
		this.idAsesor = idAsesor;
		this.persona = persona;
		this.usuario = usuario;
		this.estado = estado;
	}

	public int getIdAsesor() {
		return idAsesor;
	}

	public void setIdAsesor(int idAsesor) {
		this.idAsesor = idAsesor;
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
