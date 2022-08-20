package com.uce.edu.demo.prueba.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {
	
	@Id
	@Column(name = "id_matr")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_matr_seq")
	@SequenceGenerator(name = "id_matr_seq", sequenceName = "id_matr_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "fecha_matr")
	private LocalDateTime fechaMatricula;
	
	@Column(name = "valor_matr")
	private BigDecimal valorMatrciula;
	
	@ManyToOne
	@JoinColumn(name = "matr_prop_id")
	private Propietario propietario;
	
	@OneToOne
	@JoinColumn(name = "matr_veh_id")
	private Vehiculo vehiculo;

	// SET Y GET
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public BigDecimal getValorMatrciula() {
		return valorMatrciula;
	}

	public void setValorMatrciula(BigDecimal valorMatrciula) {
		this.valorMatrciula = valorMatrciula;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fechaMatricula=" + fechaMatricula + ", valorMatrciula=" + valorMatrciula
				+ ", propietario=" + propietario + ", vehiculo=" + vehiculo + "]";
	}


}
