package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repositorry.IVehiculoJpaRepository;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

@Service
public class VehiculoJpaServiceImpl implements IVehiculoJpaService{

	@Autowired
	private IVehiculoJpaRepository iVehiculoJpaRepository;
	
	@Override
	public void insertar(Vehiculo v) {
		this.iVehiculoJpaRepository.insertar(v);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoJpaRepository.buscar(placa);
	}

	@Override
	public void actualizar(Vehiculo v) {
		this.iVehiculoJpaRepository.actualizar(v);
		
	}

	@Override
	public void eliminar(String placa) {
		this.iVehiculoJpaRepository.eliminar(placa);
		
	}

}
