package com.ingenieriaweb.matriculas3.web.app.models;

import jakarta.persistence.*;

@Entity
@Table(name = "docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDocente;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona", referencedColumnName = "idPersona")
    private Persona persona;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario")
    private Usuario usuario;

    @Column(nullable = false)
    private Boolean estado = true;

    // Constructor vacío (requerido por JPA)
    public Docente() {
    }

    // Constructor con parámetros
    public Docente(Integer idDocente, Persona persona, Usuario usuario, Boolean estado) {
        this.idDocente = idDocente;
        this.persona = persona;
        this.usuario = usuario;
        this.estado = estado;
    }

    // Getters y Setters
    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
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
