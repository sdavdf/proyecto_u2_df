package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJdbcRepository {
	
	public List<Persona> buscarTodos();
	
	public Persona buscarPorId(int id);
	
	public void insertar(Persona persona);
	
	public void actualizar(Persona persona);
	
	public void eliminar(int id);

}
