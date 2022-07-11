package com.uce.edu.demo.prueba.repositorry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

@Repository
@Transactional
public class VehiculoJpaRepositoryImpl implements IVehiculoJpaRepository{
	

	private static Logger LOG = Logger.getLogger(VehiculoJpaRepositoryImpl.class);
	
	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public void insertar(Vehiculo v) {
		LOG.debug("Insertanddo vehiculo: " + v.toString());
		this.entitymanager.persist(v);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		Query myQuery = this.entitymanager.createQuery("SELECT v FROM Vehiculo v WHERE v.placa=:placa");
		myQuery.setParameter("placa", placa);
		return (Vehiculo) myQuery.getSingleResult();
	}

	@Override
	public void actualizar(Vehiculo v) {
		LOG.debug("Actualizando vehiculo ");
		this.entitymanager.merge(v);
		
	}

	@Override
	public void eliminar(String placa) {
		LOG.debug("Eliminando vehiculo por placa: "+placa);
		Vehiculo v = this.buscar(placa);
		this.entitymanager.remove(v);
		
	}

}
