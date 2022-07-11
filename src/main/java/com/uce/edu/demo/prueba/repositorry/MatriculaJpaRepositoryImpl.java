package com.uce.edu.demo.prueba.repositorry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.prueba.repository.modelo.Matricula;

@Repository
@Transactional
public class MatriculaJpaRepositoryImpl implements IMatriculaJpaRepository{
	
	private static Logger LOG = Logger.getLogger(MatriculaJpaRepositoryImpl.class);

	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public void insertar(Matricula matricula) {
		LOG.info("Insertando matricula: " + matricula.toString());
		this.entitymanager.persist(matricula);
		
	}

	@Override
	public Matricula buscar(Integer id) {
		LOG.info("buscando matricula por id " + id);
		return this.entitymanager.find(Matricula.class, id);
	}

	@Override
	public void actualizar(Matricula matricula) {
		LOG.info("Actualizando matricula");
		this.entitymanager.merge(matricula);
		
	}

	@Override
	public void eliminar(Integer id) {
		LOG.info("Eliminando por Id: " + id);
		Matricula m = this.buscar(id);
		this.entitymanager.remove(m);
		
	}

}
