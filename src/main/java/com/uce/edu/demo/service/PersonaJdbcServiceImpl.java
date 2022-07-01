package com.uce.edu.demo.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.ProyectoU2DfApplication;
import com.uce.edu.demo.repository.IPersonaJdbcRepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class PersonaJdbcServiceImpl implements IPersonaJdbcService{
	
	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);

	@Autowired
	private IPersonaJdbcRepository iPersonaJdbcRepository;
	
	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepository.insertar(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepository.actualizar(persona);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.iPersonaJdbcRepository.eliminar(id);
	}

	@Override
	public Persona buscar(int id) {
		// TODO Auto-generated method stub
		System.out.println("Se encontro el usuario"+id);
		return this.iPersonaJdbcRepository.buscarPorId(id);
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iPersonaJdbcRepository.buscarTodos();
	}
	
	

}
