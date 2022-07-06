package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJpaService {
	public List<Persona> buscarPorApellido(String apellido);
	
	public Persona buscarPorCedula(String cedula);

	public Persona buscar(Integer id);
	
	public void guardar(Persona persona);
	
	public void actualizar(Persona persona);
	
	public void eliminar(Integer id);
	
	
}
