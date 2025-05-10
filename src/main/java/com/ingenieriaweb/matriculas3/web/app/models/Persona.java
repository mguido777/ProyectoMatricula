package com.ingenieriaweb.matriculas3.web.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    @Column(nullable = false, length = 100)
    private String nombres;
    
    @Column(nullable = false, length = 100)
    private String apellidos;
    
    @Column(nullable = false, unique = true, length = 8)
    private String dni;
    
    @Column(length = 200)
    private String direccion;
    
    @Column(length = 15)
    private String telefono;
    
    @Column(length = 100)
    private String correo;
    
    @Column(nullable = false)
    private Boolean estado = true;

    public Persona() {
    }

    public Persona(Integer idPersona, String nombres, String apellidos, String dni, String direccion,
            String telefono, String correo, Boolean estado) {
        super();
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    // Getters y Setters
    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombres=" + nombres + ", apellidos=" + apellidos + 
               ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono + 
               ", correo=" + correo + ", estado=" + estado + "]";
    }
}