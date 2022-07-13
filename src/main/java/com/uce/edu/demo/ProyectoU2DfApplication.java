package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.instituto.repository.modelo.Estudiante;
import com.uce.edu.demo.instituto.service.IEstudianteJpaService;
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
	
	@Autowired
	private IEstudianteJpaService estudianteJpaService;
	


	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			
//		Estudiante est = new Estudiante();
//		est.setNombre("Fernanda");
//		est.setApellido("Espinoza");
//		est.setCorreo("fespinoza@XX.uce.edu.ec");
//		est.setEdad(22);
//		est.setCedula("87321110");
//		
////		this.estudianteJpaService.insertar(est);
//		
//		//1 TypedQuery
//		Estudiante estTyped1 = this.estudianteJpaService.buscarPorCorreoTyped("fespinoza@XX.uce.edu.ec");
//		log.info("Estudiante Typed 1: " + estTyped1);
//		
//		List<Estudiante> estTyped2 = this.estudianteJpaService.buscarPorEdadTyped(22);
//		for(Estudiante item: estTyped2) {
//			log.info("Estudiante Typed 2: " + estTyped2);
//		}
//		
//		//2 NamedQuery
//		List<Estudiante> estNamed1 = this.estudianteJpaService.buscarPorNombrenamed("Fernanda");
//		for(Estudiante item: estNamed1) {
//			log.info("Estudiante Named 1: " + estNamed1);
//		}
//		
//		List<Estudiante> estNamed2 = this.estudianteJpaService.buscarPorApellidoNamed("Garcia");
//		for(Estudiante item: estNamed2) {
//			log.info("Estudiante Named 2: " + estNamed2);
//		}
//		
//		//3 TypedQuery y NamedQuery
//		Estudiante estTypedNamed1 = this.estudianteJpaService.buscarPorApellidoCedula("Bolaños", "54675875");
//		log.info("Estudiante Typed y Named 1: " + estTypedNamed1);
//		
//		Estudiante estTypedNamed2 = this.estudianteJpaService.buscarPorCorreoEdad("agarcia@XX.uce.edu.ec", 24);
//		log.info("Estudiante Typed y Named 2: " + estTypedNamed2);
		
		
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
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
		
		Persona perNative = this.iPersonaJpaService.buscarPorCedulaNative("15323211");
		log.info("Persona Native: " + perNative);
		
		Persona perNamedNative = this.iPersonaJpaService.buscarPorCedulaNamedNative("15323211");
		log.info("Persona Named y Native: " + perNamedNative);
		
		
		
		
		
		
		

//		//1 TypedQuery
//		Persona perTyped = this.iPersonaJpaService.buscarPorCedulaTyped("15323211");
//		log.info("Persona Typed: " + perTyped);
//		
//		//2 NamedQuery
//		Persona perNamed = this.iPersonaJpaService.buscarPorCedulaNamed("15323211");
//		log.info("Persona Named: " + perNamed);
//		
//		//3 TypedQuery y NamedQuery
//		Persona perTypedNamed = this.iPersonaJpaService.buscarPorCedulaTypedNamed("15323211");
//		log.info("Persona TypedNamed: " + perTypedNamed);
////		
//		//4 Varios NamedQuery
//		List<Persona> listaPersona = this.iPersonaJpaService.buscarPorNombreApellido("Edgardo", "Castillo");
//		
//		for(Persona item: listaPersona) {
//			log.info("Persona: " + item);
//		}
		
		
		//Actualizar con JPQL
		
		//int resultado = this.iPersonaJpaService.actualizarPorApellido("FE", "Perez");
		//log.info("Cantidad de registros: " + resultado);
		
//		int resultado1 = this.iPersonaJpaService.eliminarPorGenero("M");
//		log.info("Cantidad de eliminados: " + resultado1);
		

		
		
	}

}
