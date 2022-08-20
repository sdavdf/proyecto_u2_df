package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.prueba.repository.modelo.Matricula;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;
import com.uce.edu.demo.prueba.service.IGestorMatriculaService;
import com.uce.edu.demo.prueba.service.IPropietarioJpaService;
import com.uce.edu.demo.prueba.service.IVehiculoJpaService;

@SpringBootApplication
public class ProyectoU2DfApplication implements CommandLineRunner {

	private static Logger log = Logger.getLogger(ProyectoU2DfApplication.class);

	@Autowired
	private IGestorMatriculaService matriculaGestor;

	@Autowired
	private IPropietarioJpaService propietarioService;

	@Autowired
	private IVehiculoJpaService vehiculoService;

//	@Autowired
//	private IHotelService hotelService;
//
//	@Autowired
//	private IHabitacionService habitacionService;
//	
//	@Autowired
//	private ICiudadanoService ciudadanoService;

//	@Autowired
//	private IPersonaJpaService iPersonaJpaService;
//
//	@Autowired
//	private IEstudianteJpaService estudiantegitJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//Insert de VEHICULO
//		Vehiculo v1 = new Vehiculo();
//		v1.setMarca("Mazda");
//		v1.setPlaca("TYU-8908");
//		v1.setTipo("Pesado");
//		v1.setModelo("XSS");
//		v1.setPrecio(new BigDecimal(34510));
//		this.vehiculoService.insertar(v1);

		// Insert de PROPIETARIO
//		Propietario p1 = new Propietario();
//		p1.setNombre("Juan");
//		p1.setApellido("Velez");
//		p1.setCedula("528468436");
//		this.propietarioService.insertar(p1);
		
		
//		List<Matricula> matriculas=new ArrayList();
//		
//		p1.setMatriculas(null);
//		

		this.matriculaGestor.matricularVehiculo("528468436", "TYU-8908");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// ONE TO ONE ---Empleado-Ciudadano

		// Tabla secundaria primero(Ciudadano)
//		Ciudadano ciu1 = new Ciudadano();
//		ciu1.setNombre("Stalyn");
//		ciu1.setApellido("Lopez");
//		
//		//Tabla principal(Empleado)
//		Empleado empl1 = new Empleado();
//		empl1.setCodigoIess("r43853j");
//		empl1.setSalario(new BigDecimal(100));
//		empl1.setCiudadano(ciu1);
//		
//		ciu1.setEmpleado(empl1);
//		
//		this.ciudadanoService.guardar(ciu1);

		////////////////////////////////////////////////////////////////////////////////////////////

		// ONE TO MANY ---Hotel-Habitacion

		// Primero se debe ingresar el elemento de la entidad principal

//		Hotel h1 = new Hotel();
//		//h1.setId(4);
//		h1.setNombre("Hotel dos");
//		h1.setDireccion("Junin y Uruguay");
//			
//		this.hotelService.insertar(h1);

		// Buscamos el hotel para asignarle la habitacion
//		Hotel hote = new Hotel();
//		hote.setId(3);
//		
//		
//		Habitacion habi1 = new Habitacion();
//		habi1.setNumero("431");
//		habi1.setPiso("34");
//		habi1.setTipo("Familiar");
//		habi1.setHotel(hote);
//		
//		this.habitacionService.insertar(habi1);

		// 1 AUTOR CON 2 LIBROS

//		Autor1 auto3 = new Autor1();
//		auto3.setNombre("Julio Garcia");
//
//		Libro1 libr2 = new Libro1();
//		libr2.setTitulo("World of war I");
//		libr2.setCantidadPaginas(1200);
//
//		Libro1 libr3 = new Libro1();
//		libr3.setTitulo("Cronicas de Narnia");
//		libr3.setCantidadPaginas(320);
//
//		this.iAutor1Service.insertar(auto3);
//		this.iLibro1Service.insertar(libr2);
//		this.iLibro1Service.insertar(libr3);
//
//		this.libroAutorService.insertar(auto3.getNombre(), libr2.getTitulo());
//		this.libroAutorService.insertar(auto3.getNombre(), libr3.getTitulo());
//		
//		
//		
//		// 1 LIBRO CON 2 AUTORES
//
//		Libro1 libr1 = new Libro1();
//		libr1.setTitulo("Harry Potter");
//		libr1.setCantidadPaginas(10000);
//
//		Autor1 auto1 = new Autor1();
//		auto1.setNombre("J.K. Rolling");
//
//		Autor1 auto2 = new Autor1();
//		auto2.setNombre("Antonio Mosquera");
//
//		this.iLibro1Service.insertar(libr1);
//		this.iAutor1Service.insertar(auto1);
//		this.iAutor1Service.insertar(auto2);
//
//		this.libroAutorService.insertar(auto1.getNombre(), libr1.getTitulo());
//		this.libroAutorService.insertar(auto2.getNombre(), libr1.getTitulo());

//		Autor1 autor1 = new Autor1();
//		autor1.setNombre("Juan Perez2");
//		Set<Autor1> autores = new HashSet<>();
//		autores.add(autor1);
//		
//		// LIBRO 1
//		Libro1 lb1 = new Libro1();
//		lb1.setTitulo("World of war I");
//		lb1.setCantidadPaginas(100);
//		
//		lb1.setAutores(autores);
//		
//		this.iLibro1Service.insertar(lb1);

//		this.habitacionService.insertar(habi1);
//		this.habitacionService.insertar(habi2);

		// AUTOR 1
//		Autor autor1 = new Autor();
//		autor1.setNombre("Julio");
//		autor1.setApellido("García");
//
//		Autor au1 = new Autor();
//		au1.setId(1);
//		
//		// AUTOR 2
//		Autor autor2 = new Autor();
//		autor2.setNombre("Antonio");
//		autor2.setApellido("Mendez");
//		
//		Autor au2 = new Autor();
//		au2.setId(2);
//
//		// LIBRO 1
//		Libro libr1 = new Libro();
//		libr1.setTitulo("World of war II");
//		libr1.setEditorial("Santillana");
//		libr1.setGenero("Historia");
//		libr1.setAutor(au1);
//		
//		Libro lb = new Libro();
//		lb.setId(1);
//		
//		// LIBRO 2
//		Libro libr2 = new Libro();
//		libr2.setTitulo("Harry Potter");
//		libr2.setEditorial("Parco");
//		libr2.setGenero("Fantasia");
//		libr2.setAutor(au1);
//		
//		// LIBRO 3
//		Libro libr3 = new Libro();
//		libr3.setTitulo("Crepúsculo");
//		libr3.setEditorial("Stephenie Meyer");
//		libr3.setGenero("Drama-Romance");
//		libr3.setAutor(au1);

		// Insertar
//		this.iLibroService.insertar(libr1);;
//		this.iLibroService.insertar(libr2);;
//		this.iLibroService.insertar(libr3);;

		// Buscar
//		this.iLibroService.buscar(1);
//		this.iLibroService.buscar(2);

		// Actualizar
//		libr2.setEditorial("Anstom");
//		this.iLibroService.actualizar(libr2);

		// Eliminar
//		this.iLibroService.eliminar(3);

		// Insertar
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
