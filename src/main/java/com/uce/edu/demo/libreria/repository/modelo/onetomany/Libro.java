package com.uce.edu.demo.libreria.repository.modelo.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libro_id_seq")
	@SequenceGenerator(name = "libro_id_seq", sequenceName = "libro_id_seq", allocationSize = 1)
	@Column(name = "libro_id")
	private Integer id;

	@Column(name = "libro_titulo")
	private String titulo;

	@Column(name = "libro_genero")
	private String genero;

	@Column(name = "libro_editorial")
	private String editorial;

	@ManyToOne
	@JoinColumn(name = "libro_id_autor")
	private Autor autor;
	
	

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", editorial=" + editorial + ", autor="
				+ autor + "]";
	}

	// SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}


}
