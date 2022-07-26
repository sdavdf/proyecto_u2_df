package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.manytomany.Libro1;


@Repository
@Transactional
public class Libro1RepositoryImpl implements ILibro1Repository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Libro1 libro) {
		this.entityManager.persist(libro);
		
	}

}
