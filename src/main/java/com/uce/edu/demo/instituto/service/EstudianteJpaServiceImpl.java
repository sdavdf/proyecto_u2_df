package com.uce.edu.demo.instituto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.instituto.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.instituto.repository.modelo.Estudiante;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService{

	@Autowired
	private IEstudianteJpaRepository estudianteJpaRepository;
	
	@Override
	public Estudiante buscarPorId(int id) {
		return this.estudianteJpaRepository.buscarPorId(id);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		this.estudianteJpaRepository.insertar(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.estudianteJpaRepository.actualizar(estudiante);
		
	}

	@Override
	public void eliminar(int id) {
		this.estudianteJpaRepository.eliminar(id);
		
	}

}
