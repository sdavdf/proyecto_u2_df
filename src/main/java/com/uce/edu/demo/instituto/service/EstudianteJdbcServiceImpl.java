package com.uce.edu.demo.instituto.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.ProyectoU2DfApplication;
import com.uce.edu.demo.instituto.repository.IEstudianteJdbcRepository;
import com.uce.edu.demo.instituto.repository.modelo.Estudiante;

@Service
public class EstudianteJdbcServiceImpl implements IEstudianteJdbcService{
	
	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);
	
	@Autowired
	private IEstudianteJdbcRepository iEstudianteJdbcRepository;

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		log.info("Se ha guardado el estudiante: " + estudiante);
		this.iEstudianteJdbcRepository.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		log.info("Se ha actualizado el estudiante: " + estudiante);
		this.iEstudianteJdbcRepository.actualizar(estudiante);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		log.info("Se ha eliminado el estudiante de ID: " + id);
		this.iEstudianteJdbcRepository.eliminar(id);
	}

	@Override
	public Estudiante buscar(int id) {
		// TODO Auto-generated method stub
		log.info("Se ha buscado el estudiante de ID: " + id);
		return this.iEstudianteJdbcRepository.buscarPorId(id);
	}

}
