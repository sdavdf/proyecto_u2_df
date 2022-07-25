package com.uce.edu.demo.libreria.repositorry;

import com.uce.edu.demo.libreria.repository.modelo.onetomany.Autor;

public interface IAutorRepository {

	public void insertar(Autor a);
	
	public Autor buscar(Integer id); 
	
	public void actualizar(Autor a);
	
	public void eliminar(Integer id);
}
