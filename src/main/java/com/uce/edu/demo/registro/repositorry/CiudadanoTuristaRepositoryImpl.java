package com.uce.edu.demo.registro.repositorry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.registro.repository.modelo.CiudadanoTurista;

@Repository
@Transactional
public class CiudadanoTuristaRepositoryImpl implements ICiudadanoTuristaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CiudadanoTurista c) {
		this.entityManager.persist(c);
		
	}

	@Override
	public CiudadanoTurista buscar(Integer id) {
		return this.entityManager.find(CiudadanoTurista.class, id);
	}

	@Override
	public void actualizar(CiudadanoTurista c) {
		this.entityManager.merge(c);
		
	}

	@Override
	public void eliminar(Integer id) {
		CiudadanoTurista c = this.buscar(id);

		this.entityManager.remove(c);
		
	}

}
