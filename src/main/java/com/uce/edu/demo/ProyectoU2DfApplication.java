package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;
import com.uce.edu.demo.prueba.service.IMatriculaJpaService;
import com.uce.edu.demo.prueba.service.IPropietarioJpaService;
import com.uce.edu.demo.prueba.service.IVehiculoJpaService;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJpaService;
@SpringBootApplication
public class ProyectoU2DfApplication implements CommandLineRunner{
	
	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);

	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	


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
		
//		this.iPersonaJpaService.guardar(per);
		
		Persona per1 = new Persona();	
//		per.setId(7);
		per1.setNombre("Edgardo");
		per1.setApellido("Castillo");
		per1.setCedula("3244222");
		per1.setGenero("M");
		
		// GUARDAR
//		this.iPersonaJpaService.guardar(per1);
		

		//1 TypedQuery
		Persona perTyped = this.iPersonaJpaService.buscarPorCedulaTyped("15323211");
		log.info("Persona Typed: " + perTyped);
		
		//2 NamedQuery
		Persona perNamed = this.iPersonaJpaService.buscarPorCedulaNamed("15323211");
		log.info("Persona Named: " + perNamed);
		
		//3 TypedQuery y NamedQuery
		Persona perTypedNamed = this.iPersonaJpaService.buscarPorCedulaTypedNamed("15323211");
		log.info("Persona TypedNamed: " + perTypedNamed);
//		
		//4 Varios NamedQuery
		List<Persona> listaPersona = this.iPersonaJpaService.buscarPorNombreApellido("Edgardo", "Castillo");
		
		for(Persona item: listaPersona) {
			log.info("Persona: " + item);
		}
		
		
		
		
		
		
		//Actualizar con JPQL
		
		//int resultado = this.iPersonaJpaService.actualizarPorApellido("FE", "Perez");
		//log.info("Cantidad de registros: " + resultado);
		
//		int resultado1 = this.iPersonaJpaService.eliminarPorGenero("M");
//		log.info("Cantidad de eliminados: " + resultado1);
		

		
		
	}

}
