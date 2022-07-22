package com.uce.edu.demo.registro.repositorry;

import com.uce.edu.demo.registro.repository.modelo.CiudadanoTurista;

public interface ICiudadanoTuristaRepository {
	
	public void insertar(CiudadanoTurista c);
	
	public CiudadanoTurista buscar(Integer id);
	
	public void actualizar(CiudadanoTurista c);
	
	public void eliminar(Integer id);

}
