package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.repository.modelo.Matricula;

public interface IMatriculaJpaService {
	
	public void insertar(Matricula matricula);
	
	public Matricula buscar(Integer id);
	
	public void actualizar(Matricula matricula);
	
	public void eliminar(Integer id);

}
