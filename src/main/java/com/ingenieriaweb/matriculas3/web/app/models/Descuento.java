package com.ingenieriaweb.matriculas3.web.app.models;

public class Descuento {

	 private Integer idDescuento;

	    private String nombre;
	    private String descripcion;
	    private Double porcentaje;
	    private String fechaInicio;
	    private String fechaFin;
	    private Boolean estado = true;
		public Descuento(Integer idDescuento, String nombre, String descripcion, Double porcentaje, String fechaInicio,
				String fechaFin, Boolean estado) {
			super();
			this.idDescuento = idDescuento;
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.porcentaje = porcentaje;
			this.fechaInicio = fechaInicio;
			this.fechaFin = fechaFin;
			this.estado = estado;
		}
		public Integer getIdDescuento() {
			return idDescuento;
		}
		public void setIdDescuento(Integer idDescuento) {
			this.idDescuento = idDescuento;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public Double getPorcentaje() {
			return porcentaje;
		}
		public void setPorcentaje(Double porcentaje) {
			this.porcentaje = porcentaje;
		}
		public String getFechaInicio() {
			return fechaInicio;
		}
		public void setFechaInicio(String fechaInicio) {
			this.fechaInicio = fechaInicio;
		}
		public String getFechaFin() {
			return fechaFin;
		}
		public void setFechaFin(String fechaFin) {
			this.fechaFin = fechaFin;
		}
		public Boolean getEstado() {
			return estado;
		}
		public void setEstado(Boolean estado) {
			this.estado = estado;
		}
	    
	    
}
