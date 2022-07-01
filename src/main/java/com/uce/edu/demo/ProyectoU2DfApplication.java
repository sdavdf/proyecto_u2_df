package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.instituto.repository.modelo.Estudiante;
import com.uce.edu.demo.instituto.service.IEstudianteJpaService;
import com.uce.edu.demo.repository.modelo.Persona;
@SpringBootApplication
public class ProyectoU2DfApplication implements CommandLineRunner{
	
	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);

//	@Autowired
//	private IEstudianteJdbcService estudianteJdbcService;
	
	
//	@Autowired
//	private IPersonaJpaService iPersonaJpaService;
	
	@Autowired
	private IEstudianteJpaService estudianteJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante est1 = new Estudiante();
		
		est1.setId(01);
		est1.setNombre("Stalyn");
		est1.setApellido("Castañeda");
		est1.setCorreo("sdcastaneda@ddd");
		est1.setEdad(21);
		
		Estudiante est2 = new Estudiante();
		
		est2.setId(3);
		est2.setNombre("David");
		est2.setApellido("Garcia");
		est2.setCorreo("dgarcia@ddd");
		est2.setEdad(20);
		
		// GUARDAR
//		this.estudianteJpaService.insertar(est2);
		
		// BUSCAR
//		log.info("Dato con jpa: " + this.estudianteJpaService.buscarPorId(01));
		
		
		// ACTUALIZAR
		Estudiante est3 = new Estudiante();
		
		est3.setId(3);
		est3.setNombre("Benito");
		est3.setApellido("Torres");
		est3.setCorreo("btorres@ddd");
		est3.setEdad(20);
		
//		this.estudianteJpaService.actualizar(est3);
		
		//ELIMINAR
		
		this.estudianteJpaService.eliminar(3);
		
		

		// BUSCAR
//		log.info("Dato con jpa: " + this.iPersonaJpaService.buscar(13));
//		System.out.println("Hola Mundo");
		Persona per = new Persona();	
		per.setId(7);
		per.setNombre("Edison");
		per.setApellido("Cayambe");
		
		// GUARDAR
//		this.iPersonaJpaService.guardar(per);
		
//		Ea per1 = new Persona();	
//		per1.setId(13);
//		per1.setNombre("Andrea");
//		per1.setApellido("Solis");
//		
		// ACTUALIZAR
//		this.iPersonaJpaService.actualizar(per1);
		
		// ELIMINAR
//		this.iPersonaJpaService.eliminar(13);
		
		//Actualizar
//		this.iPersonaJdbcService.actualizar(persona);
//		this.iPersonaJdbcService.guardar(per1);
//		this.iPersonaJdbcService.eliminar(12);
//		this.iPersonaJdbcService.buscar(13);
//		iPersonaJdbcService.guardar(per1);
		
		
//		log.info(this.iPersonaJdbcService.buscarTodos());
		
	}

}
