package com.uce.edu.demo.instituto.service;

import com.uce.edu.demo.instituto.repository.modelo.Estudiante;

public interface IEstudianteJpaService {
	
	public Estudiante buscarPorId(int id);
	
	public void insertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante);
	
	public void eliminar(int id);

}
