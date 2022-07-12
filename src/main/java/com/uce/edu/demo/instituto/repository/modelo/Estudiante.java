package com.uce.edu.demo.instituto.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")

@NamedQuery(name = "Estudiante.buscarPorNombre", query =
"SELECT p FROM Estudiante p WHERE p.nombre = :datoNombre")

@NamedQuery(name = "Estudiante.buscarPorApellido", query =
"SELECT p FROM Estudiante p WHERE p.apellido = :datoApellido")

@NamedQuery(name = "Estudiante.buscarPorApellidoCedula", query =
"SELECT p FROM Estudiante p WHERE p.apellido = :datoApellido AND p.cedula = :datoCedula")

@NamedQuery(name = "Estudiante.buscarPorCorreoEdad", query =
"SELECT p FROM Estudiante p WHERE p.correo = :datoCorreo AND p.edad = :datoEdad")

public class Estudiante {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	@SequenceGenerator(name = "id_seq", sequenceName = "id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "cedula")
	private String cedula;
	

	
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", edad=" + edad + ", cedula=" + cedula + "]";
	}

	// SET y GET
	
	public Integer getId() {
		return id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
	
	

}
