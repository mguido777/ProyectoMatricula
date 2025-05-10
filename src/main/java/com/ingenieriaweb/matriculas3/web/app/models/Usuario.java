package com.ingenieriaweb.matriculas3.web.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(nullable = false, unique = true, length = 50)
    private String username;
    
    @Column(nullable = false, length = 255)
    private String passwordHash;
    
    @Column(name = "correo_electronico", length = 100)
    private String correoElectronico;
    
    @Column(length = 15)
    private String telefono;
    
    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "idRol")
    private Rol rol;  // ✅ referencia a la entidad Rol


    @Column(nullable = false)
    private Boolean estado = true;
    
    // Constructor vacío requerido por JPA
    public Usuario() {
    }

    public Usuario(Integer idUsuario, String username, String passwordHash, String correoElectronico,
            String telefono, Rol rol, Boolean estado) {
        super();
        this.idUsuario = idUsuario;
        this.username = username;
        this.passwordHash = passwordHash;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.rol = rol;
        this.estado = estado;
    }

    // Getters y Setters
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
 
}