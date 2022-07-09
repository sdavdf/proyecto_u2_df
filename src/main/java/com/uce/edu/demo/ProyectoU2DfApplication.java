package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.instituto.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJpaService;
@SpringBootApplication
public class ProyectoU2DfApplication implements CommandLineRunner{
	
	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);

//	@Autowired
//	private IEstudianteJdbcService estudianteJdbcService;
	
	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	
//	@Autowired
//	private IEstudianteJpaService estudianteJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		

		// BUSCAR
//		log.info("Dato con jpa: " + this.iPersonaJpaService.buscar(13));
		
		Persona per = new Persona();	
//		per.setId(7);
		per.setNombre("Andrea");
		per.setApellido("Muñoz");
		per.setCedula("213233");
		per.setGenero("F");
		
		this.iPersonaJpaService.guardar(per);
		
		Persona per1 = new Persona();	
//		per.setId(7);
		per1.setNombre("Edgardo");
		per1.setApellido("Castillo");
		per1.setCedula("65732420");
		per1.setGenero("M");
		
		// GUARDAR
//		this.iPersonaJpaService.guardar(per1);
		
		
		//Actualizar con JPQL
		
		//int resultado = this.iPersonaJpaService.actualizarPorApellido("FE", "Perez");
		//log.info("Cantidad de registros: " + resultado);
		
		int resultado1 = this.iPersonaJpaService.eliminarPorGenero("M");
		log.info("Cantidad de eliminados: " + resultado1);
		
	}

}
