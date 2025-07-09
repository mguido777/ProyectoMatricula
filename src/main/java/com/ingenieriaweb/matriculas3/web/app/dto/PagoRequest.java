package com.ingenieriaweb.matriculas3.web.app.dto;

import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

public class PagoRequest {

    // Persona
    private String nombres;
    private String apellidos;
    private String dni;
    private String direccion;
    private String telefono;
    private String correo;

    // Usuario
    private String username;

    // Curso
    private String curso;
    private double precio;

    // Pago
    private String metodoPago;
    private String banco;
    private String numeroCuenta;
    private String referenciaPago;

    // Archivo
    private MultipartFile comprobante;

    // otros campos
    private LocalDate fechaPago;

    public String getNombres() {
        return (nombres != null && !nombres.trim().isEmpty()) ? nombres : "NombreDesconocido";
    }

    public void setNombres(String nombres) {
        this.nombres = (nombres != null && !nombres.trim().isEmpty()) ? nombres : "NombreDesconocido";
    }

    public String getApellidos() {
        return (apellidos != null && !apellidos.trim().isEmpty()) ? apellidos : "S.";
    }

    public void setApellidos(String apellidos) {
        this.apellidos = (apellidos != null && !apellidos.trim().isEmpty()) ? apellidos : "S.";
    }

    public String getDni() {
        return (dni != null && !dni.trim().isEmpty()) ? dni : "00009200";
    }

    public void setDni(String dni) {
        this.dni = (dni != null && !dni.trim().isEmpty()) ? dni : "00023000";
    }

    public String getDireccion() {
        return (direccion != null && !direccion.trim().isEmpty()) ? direccion : "Nicolas de Pierola 736";
    }

    public void setDireccion(String direccion) {
        this.direccion = (direccion != null && !direccion.trim().isEmpty()) ? direccion : "Nicolas de Pierola 736";
    }

    public String getTelefono() {
        return (telefono != null && !telefono.trim().isEmpty()) ? telefono : "999999199";
    }

    public void setTelefono(String telefono) {
        this.telefono = (telefono != null && !telefono.trim().isEmpty()) ? telefono : "999999999";
    }

    public String getCorreo() {
        return (correo != null && !correo.trim().isEmpty()) ? correo : "usdocente5987@gmail.com";
    }

    public void setCorreo(String correo) {
        this.correo = (correo != null && !correo.trim().isEmpty()) ? correo : "usdocente5987@gmail.com";
    }

    public String getUsername() {
        if (username != null && !username.trim().isEmpty()) {
            return username;
        }

        // Generar username a partir de nombre y primera letra del apellido
        String nombreParte = (nombres != null) ? nombres.trim().toLowerCase().replaceAll("\\s+", "") : "usuario";
        String inicialApellido = (apellidos != null && !apellidos.trim().isEmpty()) 
            ? apellidos.trim().substring(0, 1).toLowerCase()
            : "x";

        return nombreParte + inicialApellido;
    }

    public void setUsername(String username) {
        // Si te lo dan explícitamente, úsalo. Si no, se generará en getUsername()
        this.username = (username != null && !username.trim().isEmpty()) ? username : null;
    }


    public String getCurso() {
        return (curso != null && !curso.trim().isEmpty()) ? curso : "CURSO-GENÉRICO";
    }

    public void setCurso(String curso) {
        this.curso = (curso != null && !curso.trim().isEmpty()) ? curso : "CURSO-GENÉRICO";
    }

    public double getPrecio() {
        return (precio > 0) ? precio : 100.0;
    }

    public void setPrecio(double precio) {
        this.precio = (precio > 0) ? precio : 100.0;
    }

    public String getMetodoPago() {
        return (metodoPago != null && !metodoPago.trim().isEmpty()) ? metodoPago : "TRANSFERENCIA";
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = (metodoPago != null && !metodoPago.trim().isEmpty()) ? metodoPago : "TRANSFERENCIA";
    }

    public String getBanco() {
        return (banco != null && !banco.trim().isEmpty()) ? banco : "BANCO-GENÉRICO";
    }

    public void setBanco(String banco) {
        this.banco = (banco != null && !banco.trim().isEmpty()) ? banco : "BANCO-GENÉRICO";
    }

    public String getNumeroCuenta() {
        return (numeroCuenta != null && !numeroCuenta.trim().isEmpty()) ? numeroCuenta : "000000000000";
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = (numeroCuenta != null && !numeroCuenta.trim().isEmpty()) ? numeroCuenta : "000000000000";
    }

    public String getReferenciaPago() {
        return (referenciaPago != null && !referenciaPago.trim().isEmpty()) ? referenciaPago : "REF000000";
    }

    public void setReferenciaPago(String referenciaPago) {
        this.referenciaPago = (referenciaPago != null && !referenciaPago.trim().isEmpty()) ? referenciaPago : "REF000000";
    }

    public MultipartFile getComprobante() {
        return comprobante;
    }

    public void setComprobante(MultipartFile comprobante) {
        this.comprobante = comprobante;
    }

    public LocalDate getFechaPago() {
        return (fechaPago != null) ? fechaPago : LocalDate.now();
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = (fechaPago != null) ? fechaPago : LocalDate.now();
    }
}
