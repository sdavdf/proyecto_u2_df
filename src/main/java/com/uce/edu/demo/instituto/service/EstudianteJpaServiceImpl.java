package com.uce.edu.demo.instituto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.instituto.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.instituto.repository.modelo.Estudiante;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService{

	@Autowired
	private IEstudianteJpaRepository estudianteJpaRepository;
	
	@Override
	public Estudiante buscarPorId(int id) {
		return this.estudianteJpaRepository.buscarPorId(id);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		this.estudianteJpaRepository.insertar(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.estudianteJpaRepository.actualizar(estudiante);
		
	}

	@Override
	public void eliminar(int id) {
		this.estudianteJpaRepository.eliminar(id);
		
	}

	@Override
	public Estudiante buscarPorCorreoTyped(String correo) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorCorreoTyped(correo);
	}

	@Override
	public List<Estudiante> buscarPorEdadTyped(Integer edad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorEdadTyped(edad);
	}

	@Override
	public List<Estudiante> buscarPorNombrenamed(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorNombrenamed(nombre);
	}

	@Override
	public List<Estudiante> buscarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorApellidoNamed(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoCedula(String apellido, String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorApellidoCedula(apellido, cedula);
	}

	@Override
	public Estudiante buscarPorCorreoEdad(String correo, Integer edad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorCorreoEdad(correo, edad);
	}

}
