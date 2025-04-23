package com.ingenieriaweb.matriculas3.web.app.models;

public class Persona {

	 private Integer idPersona;

	    private String nombres;
	    private String apellidos;
	    private String dni;
	    private String direccion;
	    private String telefono;
	    private String correo;
	    private Boolean estado = true;

	    // Getters y Setters
	    public Integer getIdPersona() {
	        return idPersona;
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
}
