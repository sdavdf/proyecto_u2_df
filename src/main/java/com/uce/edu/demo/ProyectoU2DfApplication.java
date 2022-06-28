package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Persona;
@SpringBootApplication
public class ProyectoU2DfApplication implements CommandLineRunner{
	
	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);
	
	@Autowired
	private IPersonaJdbcService iPersonaJdbcService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		System.out.println("Hola Mundo");
		Persona persona = new Persona(13, "Dario", "Eenzo");		
		
		Persona per1 = new Persona(12, "Angelica", "Rosero");
//		per1.setId(12);
//		per1.setNombre("Angelica");
//		per1.setApellido("Rosero");
		
		//Actualizar
//		this.iPersonaJdbcService.actualizar(per1);
		
//		this.iPersonaJdbcService.eliminar(12);
		this.iPersonaJdbcService.buscar(13);
		
//		log.info("Hola mundo desde LOG");
		
	}

}
