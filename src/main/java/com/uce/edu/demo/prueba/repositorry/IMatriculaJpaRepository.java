package com.uce.edu.demo.prueba.repositorry;

import com.uce.edu.demo.prueba.repository.modelo.Matricula;

public interface IMatriculaJpaRepository {

	public void insertar(Matricula matricula);
	
	public Matricula buscar(Integer id);
	
	public void actualizar(Matricula matricula);
	
	public void eliminar(Integer id);
	
}
