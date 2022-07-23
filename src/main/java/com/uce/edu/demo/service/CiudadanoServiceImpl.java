package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICiudadanoRepository;
import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{
	
	@Autowired
	private ICiudadanoRepository ciudadanoRepository;

	@Override
	public void guardar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.guardar(ciudadano);
		
	}

}
