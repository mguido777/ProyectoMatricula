package com.ingenieriaweb.matriculas3.web.app.models;

public class Curso {
private Integer idCurso;
    
    private String nombre;
    
    private String descripcion;
    
    private Integer duracionSemanas;
    
    private double costo;
    
    private Descuento descuento;
    
    private Boolean estado;

	public Curso(Integer idCurso, String nombre, String descripcion, Integer duracionSemanas, double costo,
			Descuento descuento, Boolean estado) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracionSemanas = duracionSemanas;
		this.costo = costo;
		this.descuento = descuento;
		this.estado = estado;
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getDuracionSemanas() {
		return duracionSemanas;
	}

	public void setDuracionSemanas(Integer duracionSemanas) {
		this.duracionSemanas = duracionSemanas;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
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
