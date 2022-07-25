package com.uce.edu.demo.libreria.repositorry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.libreria.repository.modelo.onetomany.Autor;
import com.uce.edu.demo.libreria.repository.modelo.onetomany.Libro;

@Repository
@Transactional
public class LibroRepositoryImpl implements ILibroRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Libro l) {
		this.entityManager.persist(l);
		
	}

	@Override
	public Libro buscar(Integer id) {
		return this.entityManager.find(Libro.class, id);
	}

	@Override
	public void actualizar(Libro l) {
		this.entityManager.merge(l);
		
	}

	@Override
	public void eliminar(Integer id) {
		Libro l = this.buscar(id);

		this.entityManager.remove(l);
		
	}

}
