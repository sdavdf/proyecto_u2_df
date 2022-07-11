package com.uce.edu.demo.prueba.repositorry;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

public interface IPropietarioJpaRepository {

	
	public void insertar(Propietario propietario);

	public Propietario buscar(String cedula);

	public void actualizar(Propietario propietario);

	public void eliminar(String cedula);
}
