package com.ingenieriaweb.matriculas3.web.app.models;

public class Curso_Asesor {


    private Integer idCursoAsesor;

    private Curso curso;
    
   
    private Asesor asesor;
    
    private Boolean estado;

	public Curso_Asesor(Integer idCursoAsesor, Curso curso, Asesor asesor, Boolean estado) {
		super();
		this.idCursoAsesor = idCursoAsesor;
		this.curso = curso;
		this.asesor = asesor;
		this.estado = estado;
	}

	public Integer getIdCursoAsesor() {
		return idCursoAsesor;
	}

	public void setIdCursoAsesor(Integer idCursoAsesor) {
		this.idCursoAsesor = idCursoAsesor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Asesor getAsesor() {
		return asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
    
    
}
