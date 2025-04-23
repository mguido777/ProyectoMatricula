package com.ingenieriaweb.matriculas3.web.app.models;

public class Horario {

	private Integer idHorario;
    
    private String diaSemana;
    
    private String horaInicio;
    
    private String horaFin;
    

    private Curso_Asesor cursoAsesor;

    private Periodo periodo;
    
    private Boolean estado;

	public Horario(Integer idHorario, String diaSemana, String horaInicio, String horaFin, Curso_Asesor cursoAsesor,
			Periodo periodo, Boolean estado) {
		super();
		this.idHorario = idHorario;
		this.diaSemana = diaSemana;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.cursoAsesor = cursoAsesor;
		this.periodo = periodo;
		this.estado = estado;
	}

	public Integer getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public Curso_Asesor getCursoAsesor() {
		return cursoAsesor;
	}

	public void setCursoAsesor(Curso_Asesor cursoAsesor) {
		this.cursoAsesor = cursoAsesor;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
    
    
    
    
}
