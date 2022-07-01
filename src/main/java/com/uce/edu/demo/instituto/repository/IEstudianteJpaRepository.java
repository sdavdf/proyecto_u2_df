package com.uce.edu.demo.instituto.repository;

import com.uce.edu.demo.instituto.repository.modelo.Estudiante;

public interface IEstudianteJpaRepository {
	
	public Estudiante buscarPorId(int id);
	
	public void insertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante);
	
	public void eliminar(Integer id);

}
