package com.uce.edu.demo.prueba.repository.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@Column(name = "id_vehi")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_vehi_seq")
	@SequenceGenerator(name = "id_vehi_seq", sequenceName = "id_vehi_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "marca_vehi")
	private String marca;
	
	@Column(name = "modelo_vehi")
	private String modelo;
	
	@Column(name = "placa_vehi")
	private String placa;
	
	@Column(name = "tipo_vehi")
	private String tipo;
	
	@Column(name = "precio_vehi")
	private BigDecimal precio;

	
	@OneToOne(mappedBy = "vehiculo")
	private Matricula matricula;
	
	
	//SET Y GET	
	public String getMarca() {
		return marca;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", tipo=" + tipo
				+ ", precio=" + precio + ", matricula=" + matricula + "]";
	}


}
