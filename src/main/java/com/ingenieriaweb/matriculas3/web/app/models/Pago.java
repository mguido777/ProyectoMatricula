package com.ingenieriaweb.matriculas3.web.app.models;

public class Pago {

private Integer idPago;
    
    private String fechaPago;
    
    private double montoPagado;
    
    private String medioPago;
    
    private String referenciaPago;
    

    private Matricula matricula;
    
    private Integer estadoActual;
    
    
    private Boolean estado;


	public Pago(Integer idPago, String fechaPago, double montoPagado, String medioPago, String referenciaPago,
			Matricula matricula, Integer estadoActual, Boolean estado) {
		super();
		this.idPago = idPago;
		this.fechaPago = fechaPago;
		this.montoPagado = montoPagado;
		this.medioPago = medioPago;
		this.referenciaPago = referenciaPago;
		this.matricula = matricula;
		this.estadoActual = estadoActual;
		this.estado = estado;
	}


	public Integer getIdPago() {
		return idPago;
	}


	public void setIdPago(Integer idPago) {
		this.idPago = idPago;
	}


	public String getFechaPago() {
		return fechaPago;
	}


	public void setFechaPago(String fechaPago) {
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

