package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repositorry.IMatriculaJpaRepository;
import com.uce.edu.demo.prueba.repository.modelo.Matricula;

@Service
public class MatriculaJpaServiceImpl implements IMatriculaJpaService{

	@Autowired
	private IMatriculaJpaRepository iMatriculaJpaRepository;
	
	@Override
	public void insertar(Matricula matricula) {
		this.iMatriculaJpaRepository.insertar(matricula);
		
	}

	@Override
	public Matricula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iMatriculaJpaRepository.buscar(id);
	}

	@Override
	public void actualizar(Matricula matricula) {
		this.iMatriculaJpaRepository.actualizar(matricula);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.iMatriculaJpaRepository.eliminar(id);
		
	}

}
