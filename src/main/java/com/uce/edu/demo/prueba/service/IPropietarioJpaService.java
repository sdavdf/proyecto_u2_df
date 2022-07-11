package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

public interface IPropietarioJpaService {
	
	public void insertar(Propietario propietario);

	public Propietario buscar(String cedula);

	public void actualizar(Propietario propietario);

	public void eliminar(String cedula);

}
