package com.uce.edu.demo.registro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.registro.repositorry.ICiudadanoTuristaRepository;
import com.uce.edu.demo.registro.repository.modelo.CiudadanoTurista;

@Service
public class CiudadanoTuristaServiceImpl implements ICiudadanoTuristaService{

	@Autowired
	private ICiudadanoTuristaRepository ciudadanoTuristaRepository;
	
	@Override
	public void insertar(CiudadanoTurista c) {
		this.ciudadanoTuristaRepository.insertar(c);
		
	}

	@Override
	public CiudadanoTurista buscar(Integer id) {
		return this.ciudadanoTuristaRepository.buscar(id);
	}

	@Override
	public void actualizar(CiudadanoTurista c) {
		this.ciudadanoTuristaRepository.actualizar(c);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.ciudadanoTuristaRepository.eliminar(id);
		
	}

}
