package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJpaService;
import com.uce.edu.demo.to.PersonaTo;
@SpringBootApplication
public class ProyectoU2DfApplication implements CommandLineRunner{
	
	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);

//	@Autowired
//	private IEstudianteJdbcService estudianteJdbcService;
	
	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// BUSCAR
		log.info("Dato con jpa: " + this.iPersonaJpaService.buscar(13));
//		System.out.println("Hola Mundo");
		Persona per = new Persona();	
		per.setId(7);
		per.setNombre("Edison");
		per.setApellido("Cayambe");
		
		// GUARDAR
//		this.iPersonaJpaService.guardar(per);
		
		Persona per1 = new Persona();	
		per1.setId(13);
		per1.setNombre("Andrea");
		per1.setApellido("Solis");
		
		// ACTUALIZAR
//		this.iPersonaJpaService.actualizar(per1);
		
		// ELIMINAR
		this.iPersonaJpaService.eliminar(13);
		
		//Actualizar
//		this.iPersonaJdbcService.actualizar(persona);
//		this.iPersonaJdbcService.guardar(per1);
//		this.iPersonaJdbcService.eliminar(12);
//		this.iPersonaJdbcService.buscar(13);
//		iPersonaJdbcService.guardar(per1);
		
		
//		log.info(this.iPersonaJdbcService.buscarTodos());
		
	}

}
