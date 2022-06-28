package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.instituto.service.IEstudianteJdbcService;
import com.uce.edu.demo.instituto.to.Estudiante;
@SpringBootApplication
public class ProyectoU2DfApplication implements CommandLineRunner{
	
	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);

	@Autowired
	private IEstudianteJdbcService estudianteJdbcService;
	
//	@Autowired
//	private IPersonaJdbcService iPersonaJdbcService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// Creamos estudiante 1
		Estudiante est1 = new Estudiante();
//		est1.setId(1);
//		est1.setNombre("Andres");
//		est1.setApellido("Gordon");
//		est1.setCorreoInst("agordon@TT");
//		est1.setEdad(20);
		
		// Creamos estudiante 2
		Estudiante est2 = new Estudiante();
		est2.setId(2);
		est2.setNombre("Maria");
		est2.setApellido("Ortega");
		est2.setCorreoInst("mortega@TT");
		est2.setEdad(22);
		
		// Creamos estudiante 3
		Estudiante est3 = new Estudiante();
		est1.setId(3);
		est1.setNombre("Victor");
		est1.setApellido("Calderon");
		est1.setCorreoInst("vcalderon@TT");
		est1.setEdad(21);
		
		
		// CREATE
//		this.estudianteJdbcService.guardar(est1);
//		this.estudianteJdbcService.guardar(est2);
//		this.estudianteJdbcService.guardar(est3);
		
		// READ
		
//		this.estudianteJdbcService.buscar(1);
		
		// UPDATE
		est1.setId(1);
		est1.setNombre("Cristian");
		est1.setApellido("Gordon");
		est1.setCorreoInst("agordon@TT");
		est1.setEdad(20);
		
//		this.estudianteJdbcService.actualizar(est1);
		
		// DELETE
		
		this.estudianteJdbcService.eliminar(1);
		
		
		
		
		
//		System.out.println("Hola Mundo");
//		Persona persona = new Persona(13, "Dario", "Enzo");		
		
//		Persona per1 = new Persona(12, "Made", "Rosero");
//		per1.setId(12);
//		per1.setNombre("Angelica");
//		per1.setApellido("Rosero");
		
		//Actualizar
//		this.iPersonaJdbcService.actualizar(persona);
		
//		this.iPersonaJdbcService.eliminar(12);
//		this.iPersonaJdbcService.buscar(13);
//		iPersonaJdbcService.guardar(per1);
//		log.info("Hola mundo desde LOG");
		
	}

}
