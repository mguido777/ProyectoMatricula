package com.ingenieriaweb.matriculas3.web.app.models;

public class Solicitud_Descuento {

	 private Integer idSolicitudDescuento;
	    
	
	    private Docente docente;
	    
	    private Curso_Asesor cursoAsesor;
	    
	    private String fechaSolicitud;
	    
	    private String motivo;
	    
	    private Integer estadoSolicitud;
	    
	    private Descuento descuento;
	    
	    private Boolean estado;

		public Solicitud_Descuento(Integer idSolicitudDescuento, Docente docente, Curso_Asesor cursoAsesor,
				String fechaSolicitud, String motivo, Integer estadoSolicitud, Descuento descuento, Boolean estado) {
			super();
			this.idSolicitudDescuento = idSolicitudDescuento;
			this.docente = docente;
			this.cursoAsesor = cursoAsesor;
			this.fechaSolicitud = fechaSolicitud;
			this.motivo = motivo;
			this.estadoSolicitud = estadoSolicitud;
			this.descuento = descuento;
			this.estado = estado;
		}

		public Integer getIdSolicitudDescuento() {
			return idSolicitudDescuento;
		}

		public void setIdSolicitudDescuento(Integer idSolicitudDescuento) {
			this.idSolicitudDescuento = idSolicitudDescuento;
		}

		public Docente getDocente() {
			return docente;
		}

		public void setDocente(Docente docente) {
			this.docente = docente;
		}

		public Curso_Asesor getCursoAsesor() {
			return cursoAsesor;
		}

		public void setCursoAsesor(Curso_Asesor cursoAsesor) {
			this.cursoAsesor = cursoAsesor;
		}

		public String getFechaSolicitud() {
			return fechaSolicitud;
		}

		public void setFechaSolicitud(String fechaSolicitud) {
			this.fechaSolicitud = fechaSolicitud;
		}

		public String getMotivo() {
			return motivo;
		}

		public void setMotivo(String motivo) {
			this.motivo = motivo;
		}

		public Integer getEstadoSolicitud() {
			return estadoSolicitud;
		}

		public void setEstadoSolicitud(Integer estadoSolicitud) {
			this.estadoSolicitud = estadoSolicitud;
		}

		public Descuento getDescuento() {
			return descuento;
		}

		public void setDescuento(Descuento descuento) {
			this.descuento = descuento;
		}

		public Boolean getEstado() {
			return estado;
		}

		public void setEstado(Boolean estado) {
			this.estado = estado;
		}
	    
	    
}
