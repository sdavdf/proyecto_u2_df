package com.uce.edu.demo.libreria.repository.modelo.onetomany;

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
@Table(name = "autor")
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor_id_seq")
	@SequenceGenerator(name = "autor_id_seq", sequenceName = "autor_id_seq", allocationSize = 1)
	@Column(name = "autor_id")
	private Integer id;

	@Column(name = "autor_nombre")
	private String nombre;

	@Column(name = "autor_apellido")
	private String apellido;

	@OneToMany(mappedBy = "autor")
	private List<Libro> libros;
	
	

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", libros=" + libros + "]";
	}

	// SET y GET
	public Integer getId() {
		return id;
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

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	

}
