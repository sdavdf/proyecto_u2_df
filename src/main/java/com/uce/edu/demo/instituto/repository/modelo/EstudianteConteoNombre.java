package com.uce.edu.demo.instituto.repository.modelo;

public class EstudianteConteoNombre {
	
	private String nombre;
	private Long  numero;
	
	public EstudianteConteoNombre() {
		// TODO Auto-generated constructor stub
	}
	
	public EstudianteConteoNombre(String nombre, Long numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "EstudianteConteoEdad [nombre=" + nombre + ", numero=" + numero + "]";
	}

	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	

}
