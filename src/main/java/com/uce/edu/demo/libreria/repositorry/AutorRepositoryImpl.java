package com.uce.edu.demo.libreria.repositorry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.libreria.repository.modelo.onetomany.Autor;


@Repository
@Transactional
public class AutorRepositoryImpl implements IAutorRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Autor a) {
		this.entityManager.persist(a);
		
	}

	@Override
	public Autor buscar(Integer id) {
		return this.entityManager.find(Autor.class, id);
	}

	@Override
	public void actualizar(Autor a) {
		this.entityManager.merge(a);
		
	}

	@Override
	public void eliminar(Integer id) {
		Autor a = this.buscar(id);

		this.entityManager.remove(a);
		
	}

}
