package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJdbcService {
	
	public List<Persona> buscarTodos();
	
	public void guardar(Persona persona);
	
	public void actualizar(Persona persona);
	
	public void eliminar(int id);
	
	public Persona buscar(int id);

}
