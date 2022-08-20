package com.uce.edu.demo.prueba.repository.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "propietario")
public class Propietario {

	@Id
	@Column(name = "id_prop")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_prop_seq")
	@SequenceGenerator(name = "id_prop_seq", sequenceName = "id_prop_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "nombre_prop")
	private String nombre;

	@Column(name = "apellido_prop")
	private String apellido;

	@Column(name = "cedula_prop")
	private String cedula;

	@OneToMany(mappedBy = "propietario")
	private List<Matricula> matriculas;

	// SET Y GET

	public String getNombre() {
		return nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	
	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	@Override
	public String toString() {
		return "Propietario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", matriculas=" + matriculas + "]";
	}


}
