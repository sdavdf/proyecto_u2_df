package com.uce.edu.demo.prueba.repositorry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

@Repository
@Transactional
public class PropietarioJpaRepositoryImpl implements IPropietarioJpaRepository{

	private static Logger LOG = Logger.getLogger(PropietarioJpaRepositoryImpl.class);
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	@Override
	public void insertar(Propietario propietario) {
		this.entitymanager.persist(propietario);
		
	}

	@Override
	public Propietario buscar(String cedula) {
		Query myQuery = this.entitymanager.createQuery("SELECT p FROM Propietario p WHERE p.cedula=:cedula");
		myQuery.setParameter("cedula", cedula);

		return (Propietario) myQuery.getSingleResult();
	}

	@Override
	public void actualizar(Propietario propietario) {
		LOG.info("Actualizando Propietario ");
		this.entitymanager.merge(propietario);
		
	}

	@Override
	public void eliminar(String cedula) {
		LOG.info("Eliminando por cedula: " + cedula);
		Propietario p = this.buscar(cedula);
		this.entitymanager.remove(p);
		
	}

}
