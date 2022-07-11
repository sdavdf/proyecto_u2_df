package com.uce.edu.demo.prueba.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

public class MatriculaTo {
	
	private LocalDateTime fechaMatricula;
	private BigDecimal valorMatrciula;
	private Propietario propietario;
	private Vehiculo vehiculo;

	// SET Y GET
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
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
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMatrciula=" + valorMatrciula + ", propietario="
				+ propietario + ", vehiculo=" + vehiculo + "]";
	}

}
