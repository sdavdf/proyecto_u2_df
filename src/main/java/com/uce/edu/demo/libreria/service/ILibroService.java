package com.uce.edu.demo.libreria.service;

import com.uce.edu.demo.libreria.repository.modelo.onetomany.Libro;

public interface ILibroService {

	public void insertar(Libro l);
	
	public Libro buscar(Integer id); 
	
	public void actualizar(Libro l);
	
	public void eliminar(Integer id);
}
