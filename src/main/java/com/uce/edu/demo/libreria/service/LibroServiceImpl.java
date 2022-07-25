package com.uce.edu.demo.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.libreria.repositorry.ILibroRepository;
import com.uce.edu.demo.libreria.repository.modelo.onetomany.Libro;

@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroRepository iLibroRepository;
	
	@Override
	public void insertar(Libro l) {
		this.iLibroRepository.insertar(l);
		
	}

	@Override
	public Libro buscar(Integer id) {
		return this.iLibroRepository.buscar(id);
	}

	@Override
	public void actualizar(Libro l) {
		this.iLibroRepository.actualizar(l);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.iLibroRepository.eliminar(id);
		
	}

}
