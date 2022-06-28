package com.uce.edu.demo.instituto.service;

import com.uce.edu.demo.instituto.to.Estudiante;

public interface IEstudianteJdbcService {
	
	public void guardar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante);
	
	public void eliminar(int id);
	
	public Estudiante buscar(int id);

}
