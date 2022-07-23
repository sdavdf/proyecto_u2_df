package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.registro.service.ICiudadanoTuristaService;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoU2DfApplication implements CommandLineRunner {

	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);

	@Autowired
	private IHabitacionService habitacionService;
	
	@Autowired
	private IHotelService hotelService;
	
//	@Autowired
//	private ICiudadanoTuristaService ciudadanoTuristaService;
	
	
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
		

//		Hotel h1 = new Hotel();
//		h1.setNombre("Hilton Colon");
//		h1.setDireccion("Av.Patria");
//		
//		this.hotelService.insertar(h1);
		
		Hotel hote = new Hotel();
		hote.setId(1);
		
		Habitacion habi1 = new Habitacion();
		habi1.setNumero("A234");
		habi1.setPiso("10");
		habi1.setTipo("Familiar");
		habi1.setHotel(hote);
		
		Habitacion habi2 = new Habitacion();
		habi2.setNumero("D435");
		habi2.setPiso("1");
		habi2.setTipo("Matrimonial");
		habi2.setHotel(hote);
		
		this.habitacionService.insertar(habi1);
		this.habitacionService.insertar(habi2);
		
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
//		this.ciudadanoTuristaService.eliminar(3);
		
		
		
		
		
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
