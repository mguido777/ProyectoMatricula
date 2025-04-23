package com.ingenieriaweb.matriculas3.web.app.models;

public class Rol {

    private Integer idRol;
    
    private String nombreRol;
    private String descripcion;
    private Boolean estado = true;

    // Getters y Setters
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

	public Rol(Integer idRol, String nombreRol, String descripcion, Boolean estado) {
		super();
		this.idRol = idRol;
		this.nombreRol = nombreRol;
		this.descripcion = descripcion;
		this.estado = estado;
	}
    
    
}
