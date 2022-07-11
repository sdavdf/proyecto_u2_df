package com.uce.edu.demo;

import java.math.BigDecimal;

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
	

	@Autowired
	private IVehiculoJpaService iVehiculoJpaService;
	
	@Autowired
	private IMatriculaJpaService iMatriculaJpaService;
	
	@Autowired
	private IPropietarioJpaService iPropietarioJpaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		

		// BUSCAR
//		log.info("Dato con jpa: " + this.iPersonaJpaService.buscar(13));
		
//		Persona per = new Persona();	
//		per.setId(7);
//		per.setNombre("Andrea");
//		per.setApellido("Muñoz");
//		per.setCedula("213233");
//		per.setGenero("F");
		
//		this.iPersonaJpaService.guardar(per);
		
//		Persona per1 = new Persona();	
//		per.setId(7);
//		per1.setNombre("Edgardo");
//		per1.setApellido("Castillo");
//		per1.setCedula("65732420");
//		per1.setGenero("M");
//		
		// GUARDAR
//		this.iPersonaJpaService.guardar(per1);
		
		
		//Actualizar con JPQL
		
		//int resultado = this.iPersonaJpaService.actualizarPorApellido("FE", "Perez");
		//log.info("Cantidad de registros: " + resultado);
		
//		int resultado1 = this.iPersonaJpaService.eliminarPorGenero("M");
//		log.info("Cantidad de eliminados: " + resultado1);
		
		Vehiculo v = new Vehiculo();
		v.setMarca("Hyundai");
		v.setModelo("2019");
		v.setPlaca("FDG-231");
		v.setTipo("L");
		v.setPrecio(new BigDecimal(2300));
		
		//Insertar Vehiculo a la base de datos
		//this.iVehiculoJpaService.insertar(v);
		
		Propietario p = new Propietario();
		p.setNombre("Stalyn");
		p.setApellido("Gallardo");
		p.setCedula("034025656");
		
		//Insertar Propietario a la base de datos
		this.iPropietarioJpaService.insertar(p);
		
		//En la matricula como ya se había dicho da error 
		
		
	}

}
