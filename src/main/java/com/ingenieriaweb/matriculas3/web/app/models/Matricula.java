package com.ingenieriaweb.matriculas3.web.app.models;

public class Matricula {

		private Integer idMatricula;
	    
	    private String fechaMatricula;
	    
	    private String fechaLimitePago;

	    private Docente docente;
	
	    private Periodo periodo;
	    
	    private Integer estadoActual;
	    
	    private Boolean estado;

		public Matricula(Integer idMatricula, String fechaMatricula, String fechaLimitePago, Docente docente,
				Periodo periodo, Integer estadoActual, Boolean estado) {
			super();
			this.idMatricula = idMatricula;
			this.fechaMatricula = fechaMatricula;
			this.fechaLimitePago = fechaLimitePago;
			this.docente = docente;
			this.periodo = periodo;
			this.estadoActual = estadoActual;
			this.estado = estado;
		}

		public Integer getIdMatricula() {
			return idMatricula;
		}

		public void setIdMatricula(Integer idMatricula) {
			this.idMatricula = idMatricula;
		}

		public String getFechaMatricula() {
			return fechaMatricula;
		}

		public void setFechaMatricula(String fechaMatricula) {
			this.fechaMatricula = fechaMatricula;
		}

		public String getFechaLimitePago() {
			return fechaLimitePago;
		}

		public void setFechaLimitePago(String fechaLimitePago) {
			this.fechaLimitePago = fechaLimitePago;
		}

		public Docente getDocente() {
			return docente;
		}

		public void setDocente(Docente docente) {
			this.docente = docente;
		}

		public Periodo getPeriodo() {
			return periodo;
		}

		public void setPeriodo(Periodo periodo) {
			this.periodo = periodo;
		}

		public Integer getEstadoActual() {
			return estadoActual;
		}

		public void setEstadoActual(Integer estadoActual) {
			this.estadoActual = estadoActual;
		}

		public Boolean getEstado() {
			return estado;
		}

		public void setEstado(Boolean estado) {
			this.estado = estado;
		}
	    
	    
}
