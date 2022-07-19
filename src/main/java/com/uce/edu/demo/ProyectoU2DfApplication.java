package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.instituto.repository.modelo.EstudianteBuscar;
import com.uce.edu.demo.instituto.repository.modelo.EstudianteConteoNombre;
import com.uce.edu.demo.instituto.service.IEstudianteJpaService;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2DfApplication implements CommandLineRunner {

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
		
		
		//Ejemplo 1
		List<EstudianteBuscar> listaEstudiante = this.estudianteJpaService.buscarPorNombreEdad("Ana", 22);
		
		for(EstudianteBuscar estItem: listaEstudiante) {
			log.info("Estudiante Buscar: " + estItem);
		}
		
		//Ejemplo 2
		List<EstudianteConteoNombre> listaEstudianteConteo = this.estudianteJpaService.buscarNombreConteo();
		
		for(EstudianteConteoNombre estItem: listaEstudianteConteo) {
			log.info("Estudiante Conteo: " + estItem);
		}

		

//		List<PersonaSencilla> listaPersona = this.iPersonaJpaService.buscarPorApellidoSencillo("Perez");
//		
//		for(PersonaSencilla perItem: listaPersona) {
//			log.info("Persona: " + perItem);
//		}
//		
//		List<PersonaContadorGenero> listaPersonaContador = this.iPersonaJpaService.consultarCantidadPorGenero();
//		
//		for(PersonaContadorGenero perItem: listaPersonaContador) {
//			log.info("Persona Contador: " + perItem);
//		}
		
//		Persona criteriaApi = this.iPersonaJpaService.buscarPorCedulaCriteriaApi("15323211");
//		log.info("Persona Cristeria API: " + criteriaApi);
//		
//		Persona perDinamica = this.iPersonaJpaService.buscarDinamicamente("Diana", "Ortiz", "F");
//		log.info("Persona Dinamica: " + perDinamica);
//		
//		

		// BUSCAR
//		log.info("Dato con jpa: " + this.iPersonaJpaService.buscar(13));

//		Persona per = new Persona();
////		per.setId(7);
//		per.setNombre("Sofia");
//		per.setApellido("Cruz");
//		per.setCedula("756879");
//		per.setGenero("F");
//
//		this.iPersonaJpaService.guardar(per);

//		Persona per1 = new Persona();
////		per.setId(7);
//		per1.setNombre("Diana");
//		per1.setApellido("Ortiz");
//		per1.setCedula("3656457");
//		per1.setGenero("F");

		// GUARDAR
//		this.iPersonaJpaService.guardar(per1);

		// NativeQuery
//		Persona perNative = this.iPersonaJpaService.buscarPorCedulaNative("15323211");
//		log.info("Persona Native: " + perNative);
//
//		// NativeNamedQuery
//		Persona perNamedNative = this.iPersonaJpaService.buscarPorCedulaNamedNative("15323211");
//		log.info("Persona Named y Native: " + perNamedNative);

		// Criteria API Query


		
	
		
		
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

		// Actualizar con JPQL

		// int resultado = this.iPersonaJpaService.actualizarPorApellido("FE", "Perez");
		// log.info("Cantidad de registros: " + resultado);

//		int resultado1 = this.iPersonaJpaService.eliminarPorGenero("M");
//		log.info("Cantidad de eliminados: " + resultado1);

	}

}
