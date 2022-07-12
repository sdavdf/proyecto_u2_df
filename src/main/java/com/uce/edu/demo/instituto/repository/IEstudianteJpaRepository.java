package com.uce.edu.demo.instituto.repository;

import java.util.List;

import com.uce.edu.demo.instituto.repository.modelo.Estudiante;

public interface IEstudianteJpaRepository {
	
	public Estudiante buscarPorId(int id);
	
	public Estudiante buscarPorCorreoTyped(String correo);
	
	public List<Estudiante> buscarPorEdadTyped(Integer edad);
	
	public List<Estudiante> buscarPorNombrenamed(String nombre);
	
	public List<Estudiante> buscarPorApellidoNamed(String apellido);
	
	public Estudiante buscarPorApellidoCedula(String apellido, String cedula);
	
	public Estudiante buscarPorCorreoEdad(String correo, Integer edad);
	
	public void insertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante);
	
	public void eliminar(Integer id);

}
