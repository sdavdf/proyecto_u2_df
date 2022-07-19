package com.uce.edu.demo.instituto.repository.modelo;

public class EstudianteBuscar {
	

	private String nombre;
	private Integer edad;
	
	public EstudianteBuscar() {
		// TODO Auto-generated constructor stub
	}

	public EstudianteBuscar(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	
	
	@Override
	public String toString() {
		return "PersonaBuscar [nombre=" + nombre + ", edad=" + edad + "]";
	}

	// SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
	
	
}
