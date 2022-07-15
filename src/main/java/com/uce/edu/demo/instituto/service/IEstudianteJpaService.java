package com.uce.edu.demo.instituto.service;

import java.util.List;

import com.uce.edu.demo.instituto.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;

public interface IEstudianteJpaService {
	
	public Estudiante buscarPorId(int id);
	
	public Estudiante buscarPorCorreoTyped(String correo);
	
	public List<Estudiante> buscarPorEdadTyped(Integer edad);
	
	public List<Estudiante> buscarPorNombrenamed(String nombre);
	
	public List<Estudiante> buscarPorApellidoNamed(String apellido);
	
	public Estudiante buscarPorApellidoCedula(String apellido, String cedula);
	
	public Estudiante buscarPorCorreoEdad(String correo, Integer edad);
	
	public List<Estudiante> buscarPorApellidoNative(String apellido);
	
	public List<Estudiante> buscarPorNombreNative(String nombre);
	
	public List<Estudiante> buscarPorEdadNamedNative(Integer edad);
	
	public Estudiante buscarPorCorreoNamedNative(String correo);
	
	public void insertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante);
	
	public void eliminar(int id);

}
