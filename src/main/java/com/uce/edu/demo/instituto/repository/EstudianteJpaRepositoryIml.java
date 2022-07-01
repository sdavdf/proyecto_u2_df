package com.uce.edu.demo.instituto.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.instituto.repository.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteJpaRepositoryIml implements IEstudianteJpaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Estudiante buscarPorId(int id) {
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);
		
	}

	@Override
	public void eliminar(Integer id) {
		Estudiante estudiante = new Estudiante();
		this.entityManager.remove(estudiante);
		
	}

}
