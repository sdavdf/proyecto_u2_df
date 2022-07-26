package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ILibro1Repository;
import com.uce.edu.demo.repository.modelo.manytomany.Libro1;

@Service
public class Libro1ServiceImpl implements ILibro1Service{

	@Autowired
	private ILibro1Repository iLibro1Repository;
	
	@Override
	public void insertar(Libro1 libro) {
		this.iLibro1Repository.insertar(libro);
		
	}

}
