package com.uce.edu.demo.libreria.service;

import com.uce.edu.demo.libreria.repository.modelo.onetomany.Autor;

public interface IAutorService {
	
	public void insertar(Autor a);
	
	public Autor buscar(Integer id); 
	
	public void actualizar(Autor a);
	
	public void eliminar(Integer id);

}
