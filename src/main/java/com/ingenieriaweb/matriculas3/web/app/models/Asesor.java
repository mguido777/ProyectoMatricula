package com.ingenieriaweb.matriculas3.web.app.models;

import jakarta.persistence.*;

@Entity
@Table(name = "asesor")
public class Asesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsesor;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona", referencedColumnName = "idPersona")
    private Persona persona;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario")
    private Usuario usuario;

    @Column(nullable = false)
    private Boolean estado = true;

    // Constructor vacío requerido por JPA
    public Asesor() {
    }

    public Asesor(int idAsesor, Persona persona, Usuario usuario, Boolean estado) {
        this.idAsesor = idAsesor;
        this.persona = persona;
        this.usuario = usuario;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(int idAsesor) {
        this.idAsesor = idAsesor;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}