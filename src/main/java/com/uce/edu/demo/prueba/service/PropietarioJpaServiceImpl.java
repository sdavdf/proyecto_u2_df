package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repositorry.IPropietarioJpaRepository;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;

@Service
public class PropietarioJpaServiceImpl implements IPropietarioJpaService{
	
	@Autowired
	private IPropietarioJpaRepository iPropietarioJpaRepository;

	@Override
	public void insertar(Propietario propietario) {
		this.iPropietarioJpaRepository.insertar(propietario);
		
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioJpaRepository.buscar(cedula);
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.iPropietarioJpaRepository.actualizar(propietario);
		
	}

	@Override
	public void eliminar(String cedula) {
		this.iPropietarioJpaRepository.eliminar(cedula);
		
	}

}
