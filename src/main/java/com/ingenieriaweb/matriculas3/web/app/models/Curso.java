package com.ingenieriaweb.matriculas3.web.app.models;

import jakarta.persistence.*;


public class Curso {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
    
	@Column(nullable = false, unique = true, length = 50)
    private String nombre;
    
	@Column(nullable = false, length = 255)
    private String descripcion;
    
    private Integer duracionSemanas;
    
    private double costo;
    
    @ManyToOne
    @JoinColumn(name = "descuento_id")
    private Descuento descuento;
    
    @Column(nullable = false)
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
