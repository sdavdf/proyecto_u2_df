package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.registro.repository.modelo.CiudadanoTurista;
import com.uce.edu.demo.registro.repository.modelo.Pasaporte;
import com.uce.edu.demo.registro.service.ICiudadanoTuristaService;

@SpringBootApplication
public class ProyectoU2DfApplication implements CommandLineRunner {

	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);

	
	@Autowired
	private ICiudadanoTuristaService ciudadanoTuristaService;
	
	
//	@Autowired
//	private ICiudadanoService ciudadanoService;
	
//	@Autowired
//	private IPersonaJpaService iPersonaJpaService;
//
//	@Autowired
//	private IEstudianteJpaService estudianteJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		

		//Ciudadadano 1
		CiudadanoTurista ct1 = new CiudadanoTurista();
		ct1.setNombre("Angelica");
		ct1.setApellido("Ruiz");
		ct1.setCedula("3240324032");
		ct1.setFechaNacimiento(LocalDateTime.of(1999, 3, 15, 0, 0));
		
		//Pasaporte 1
		Pasaporte p1 = new Pasaporte();
		p1.setCiudadanoTurista(ct1);
		p1.setNumero("5465");
		p1.setFechaEmision(LocalDateTime.of(2014, 2, 1, 0, 0));
		p1.setFechaCaducidad(LocalDateTime.of(2022, 3, 1, 0, 0));
		
		
		//Ciudadadano 2
		CiudadanoTurista ct2 = new CiudadanoTurista();
		ct2.setNombre("Stiven");
		ct2.setApellido("Villegas");
		ct2.setCedula("5343567");
		ct2.setFechaNacimiento(LocalDateTime.of(1999, 3, 5, 0, 0));
		
		//Pasaporte 2
		Pasaporte p2 = new Pasaporte();
		p2.setCiudadanoTurista(ct2);
		p2.setNumero("1234");
		p2.setFechaEmision(LocalDateTime.of(2016, 4, 6, 0, 0));
		p2.setFechaCaducidad(LocalDateTime.of(2020, 3, 6, 0, 0));
		
		
		
		//Ciudadadano 3
		CiudadanoTurista ct3 = new CiudadanoTurista();
		ct2.setNombre("Lucia");
		ct2.setApellido("Vasconez");
		ct2.setCedula("534347");
		ct2.setFechaNacimiento(LocalDateTime.of(1999, 4, 5, 0, 0));
				
		//Pasaporte 2
		Pasaporte p3 = new Pasaporte();
		p3.setCiudadanoTurista(ct3);
		p3.setNumero("46575");
		p3.setFechaEmision(LocalDateTime.of(2017, 4, 6, 0, 0));
		p3.setFechaCaducidad(LocalDateTime.of(2019, 3, 6, 0, 0));
		
		//Insertar
//		this.ciudadanoTuristaService.insertar(ct3);
	
			
//		//Buscar
//		this.ciudadanoTuristaService.buscar(1);
//				
//		//Actualizar
//				
//		ct3.setApellido("Rodriguez");
//		this.ciudadanoTuristaService.actualizar(ct3);
//		
//		
//		//Eliminar
		this.ciudadanoTuristaService.eliminar(3);
		
		
		
		
		
//		Ciudadano ciu1 = new Ciudadano();
//		ciu1.setNombre("David");
//		ciu1.setApellido("Cayambe");
//		
//		Empleado empl1 = new Empleado();
//		empl1.setCodigoIess("53453");
//		empl1.setSalario(new BigDecimal(50));
//		empl1.setCiudadano(ciu1);
//		
//		ciu1.setEmpleado(empl1);
//		
//		
//		this.ciudadanoService.guardar(ciu1);
		
		
		
		
		
		
//		//Ejemplo 1
//		List<EstudianteBuscar> listaEstudiante = this.estudianteJpaService.buscarPorNombreEdad("Ana", 22);
//		
//		for(EstudianteBuscar estItem: listaEstudiante) {
//			log.info("Estudiante Buscar: " + estItem);
//		}
//		
//		//Ejemplo 2
//		List<EstudianteConteoNombre> listaEstudianteConteo = this.estudianteJpaService.buscarNombreConteo();
//		
//		for(EstudianteConteoNombre estItem: listaEstudianteConteo) {
//			log.info("Estudiante Conteo: " + estItem);
//		}

		

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
	}

}
