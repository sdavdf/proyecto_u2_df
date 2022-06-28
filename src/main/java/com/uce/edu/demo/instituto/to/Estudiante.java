package com.uce.edu.demo.instituto.to;

public class Estudiante {
	
	private int id;
	private String nombre;
	private String apellido;
	private String correoInst;
	private int edad;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Estudiante(int id, String nombre, String apellido, String correoInst, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoInst = correoInst;
		this.edad = edad;
	}



	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correoInst=" + correoInst
				+ ", edad=" + edad + "]";
	}
	// SET y GET
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getCorreoInst() {
		return correoInst;
	}
	public void setCorreoInst(String correoInst) {
		this.correoInst = correoInst;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
