package com.ingenieriaweb.matriculas3.web.app.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Integer idPago;

    @Column(name = "fecha_pago", nullable = false)
    private LocalDate fechaPago;

    @Column(name = "monto_pagado", nullable = false)
    private double montoPagado;

    @Column(name = "medio_pago", nullable = false, length = 50)
    private String medioPago;

    @Column(name = "referencia_pago", length = 100)
    private String referenciaPago;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_matricula", nullable = false)
    private Matricula matricula;

    @Column(name = "estado_actual", nullable = false)
    private Integer estadoActual;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    // Constructores

    public Pago() {}

    public Pago(Integer idPago, LocalDate fechaPago, double montoPagado, String medioPago, String referenciaPago,
                Matricula matricula, Integer estadoActual, Boolean estado) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.montoPagado = montoPagado;
        this.medioPago = medioPago;
        this.referenciaPago = referenciaPago;
        this.matricula = matricula;
        this.estadoActual = estadoActual;
        this.estado = estado;
    }

    // Getters y setters

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getReferenciaPago() {
        return referenciaPago;
    }

    public void setReferenciaPago(String referenciaPago) {
        this.referenciaPago = referenciaPago;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Integer getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Integer estadoActual) {
        this.estadoActual = estadoActual;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}


