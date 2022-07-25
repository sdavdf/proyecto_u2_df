package com.uce.edu.demo.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libreria.repositorry.IAutorRepository;
import com.uce.edu.demo.libreria.repository.modelo.onetomany.Autor;

@Service
public class AutorServiceImpl implements IAutorService{
	
	@Autowired
	private IAutorRepository iAutorRepository;

	@Override
	public void insertar(Autor a) {
		this.iAutorRepository.insertar(a);
		
	}

	@Override
	public Autor buscar(Integer id) {
		return this.iAutorRepository.buscar(id);
	}

	@Override
	public void actualizar(Autor a) {
		this.iAutorRepository.actualizar(a);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.iAutorRepository.eliminar(id);
		
	}

}
