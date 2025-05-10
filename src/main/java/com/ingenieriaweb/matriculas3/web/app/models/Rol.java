package com.ingenieriaweb.matriculas3.web.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;
    
    @Column(name = "nombre_rol", nullable = false, unique = true, length = 50)
    private String nombreRol;
    
    @Column(length = 255)
    private String descripcion;
    
    @Column(nullable = false)
    private Boolean estado = true;

    // Constructor vacío requerido por JPA
    public Rol() {
    }
    
    public Rol(Integer idRol, String nombreRol, String descripcion, Boolean estado) {
        super();
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        this.estado = estado;
    }

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
    
    @Override
    public String toString() {
        return "Rol [idRol=" + idRol + ", nombreRol=" + nombreRol + 
               ", descripcion=" + descripcion + ", estado=" + estado + "]";
    }
}