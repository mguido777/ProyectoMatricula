package com.ingenieriaweb.matriculas3.web.app.models;

public class Detalle_Matricula {


		private Integer idDetalleMatricula;

	    private Matricula matricula;
	    
	 
	    private Curso_Asesor cursoAsesor;
	    
	    private Boolean estado;

		public Detalle_Matricula(Integer idDetalleMatricula, Matricula matricula, Curso_Asesor cursoAsesor,
				Boolean estado) {
			super();
			this.idDetalleMatricula = idDetalleMatricula;
			this.matricula = matricula;
			this.cursoAsesor = cursoAsesor;
			this.estado = estado;
		}

		public Integer getIdDetalleMatricula() {
			return idDetalleMatricula;
		}

		public void setIdDetalleMatricula(Integer idDetalleMatricula) {
			this.idDetalleMatricula = idDetalleMatricula;
		}

		public Matricula getMatricula() {
			return matricula;
		}

		public void setMatricula(Matricula matricula) {
			this.matricula = matricula;
		}

		public Curso_Asesor getCursoAsesor() {
			return cursoAsesor;
		}

		public void setCursoAsesor(Curso_Asesor cursoAsesor) {
			this.cursoAsesor = cursoAsesor;
		}

		public Boolean getEstado() {
			return estado;
		}

		public void setEstado(Boolean estado) {
			this.estado = estado;
		}
	    
	    
}
