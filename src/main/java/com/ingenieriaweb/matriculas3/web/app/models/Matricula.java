package com.ingenieriaweb.matriculas3.web.app.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private Integer idMatricula;

    @Column(name = "fecha_matricula", nullable = false)
    private String fechaMatricula;

    @Column(name = "fecha_limite_pago", nullable = false)
    private String fechaLimitePago;

    @ManyToOne
    @JoinColumn(name = "docente_id", nullable = false)
    private Docente docente;

    @ManyToOne
    @JoinColumn(name = "periodo_id", nullable = false)
    private Periodo periodo;

    @Column(name = "estado_actual", nullable = false)
    private Integer estadoActual;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    public Matricula() {
    }

		public Matricula(Integer idMatricula, String fechaMatricula, String fechaLimitePago, Docente docente,
				Periodo periodo, Integer estadoActual, Boolean estado) {
			super();
			this.idMatricula = idMatricula;
			this.fechaMatricula = fechaMatricula;
			this.fechaLimitePago = fechaLimitePago;
			this.docente = docente;
			this.periodo = periodo;
			this.estadoActual = estadoActual;
			this.estado = estado;
		}

		public Integer getIdMatricula() {
			return idMatricula;
		}

		public void setIdMatricula(Integer idMatricula) {
			this.idMatricula = idMatricula;
		}

		public String getFechaMatricula() {
			return fechaMatricula;
		}

		public void setFechaMatricula(String fechaMatricula) {
			this.fechaMatricula = fechaMatricula;
		}

		public String getFechaLimitePago() {
			return fechaLimitePago;
		}

		public void setFechaLimitePago(String fechaLimitePago) {
			this.fechaLimitePago = fechaLimitePago;
		}

		public Docente getDocente() {
			return docente;
		}

		public void setDocente(Docente docente) {
			this.docente = docente;
		}

		public Periodo getPeriodo() {
			return periodo;
		}

		public void setPeriodo(Periodo periodo) {
			this.periodo = periodo;
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
