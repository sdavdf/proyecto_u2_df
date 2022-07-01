package com.uce.edu.demo.instituto.to;

public class EstudianteTo {
	
	private int id;
	private String nombre;
	private String apellido;
	private String correo;
	private int edad;
	
	public EstudianteTo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public EstudianteTo(int id, String nombre, String apellido, String correo, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.edad = edad;
	}

	

	// SET y GET

	@Override
	public String toString() {
		return "EstudianteTo [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", edad=" + edad + "]";
	}



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



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	

}
