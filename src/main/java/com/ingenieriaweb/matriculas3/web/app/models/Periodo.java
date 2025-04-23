package com.ingenieriaweb.matriculas3.web.app.models;

public class Periodo {

	private Integer idPeriodo;

    private String nombrePeriodo;
    private String fechaInicio;
    private String fechaFin;
    private Boolean estado = true;
	public Periodo(Integer idPeriodo, String nombrePeriodo, String fechaInicio, String fechaFin, Boolean estado) {
		super();
		this.idPeriodo = idPeriodo;
		this.nombrePeriodo = nombrePeriodo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
	}
	public Integer getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public String getNombrePeriodo() {
		return nombrePeriodo;
	}
	public void setNombrePeriodo(String nombrePeriodo) {
		this.nombrePeriodo = nombrePeriodo;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
    
    
    
    
}
