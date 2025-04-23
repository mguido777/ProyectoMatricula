package com.ingenieriaweb.matriculas3.web.app.models;

public class Detalle_Pago_Descuento {

	private Integer idDetallePagoDescuento;
    
    private Pago pago;
    
    private Solicitud_Descuento solicitudDescuento;
    
    private float montoDescontado;
    
    private Boolean estado;

	public Detalle_Pago_Descuento(Integer idDetallePagoDescuento, Pago pago, Solicitud_Descuento solicitudDescuento,
			float montoDescontado, Boolean estado) {
		super();
		this.idDetallePagoDescuento = idDetallePagoDescuento;
		this.pago = pago;
		this.solicitudDescuento = solicitudDescuento;
		this.montoDescontado = montoDescontado;
		this.estado = estado;
	}

	public Integer getIdDetallePagoDescuento() {
		return idDetallePagoDescuento;
	}

	public void setIdDetallePagoDescuento(Integer idDetallePagoDescuento) {
		this.idDetallePagoDescuento = idDetallePagoDescuento;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Solicitud_Descuento getSolicitudDescuento() {
		return solicitudDescuento;
	}

	public void setSolicitudDescuento(Solicitud_Descuento solicitudDescuento) {
		this.solicitudDescuento = solicitudDescuento;
	}

	public float getMontoDescontado() {
		return montoDescontado;
	}

	public void setMontoDescontado(float montoDescontado) {
		this.montoDescontado = montoDescontado;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
    
    
}
