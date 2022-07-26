package com.uce.edu.demo.repository.modelo.manytomany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "autor1")
public class Autor1 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_id_seq")
	@SequenceGenerator(name = "auto_id_seq", sequenceName = "auto_id_seq", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;

	@Column(name = "auto_nombre")
	private String nombre;

	@ManyToMany(mappedBy = "autores")
	private Set<Libro1> libros;

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

	public Set<Libro1> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro1> libros) {
		this.libros = libros;
	}
	

}
