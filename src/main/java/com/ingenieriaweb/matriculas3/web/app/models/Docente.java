package com.ingenieriaweb.matriculas3.web.app.models;

public class Docente {


	    private Integer idDocente;

	    private Persona persona;

	    private Usuario usuario;

	    private Boolean estado = true;

	    
		public Docente(Integer idDocente, Persona persona, Usuario usuario, Boolean estado) {
			super();
			this.idDocente = idDocente;
			this.persona = persona;
			this.usuario = usuario;
			this.estado = estado;
		}

		public Integer getIdDocente() {
			return idDocente;
		}

		public void setIdDocente(Integer idDocente) {
			this.idDocente = idDocente;
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
