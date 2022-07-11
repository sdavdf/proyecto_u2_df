package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.uce.edu.demo.prueba.repository.modelo.Matricula;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

public class GestorMatriculaServiceImpl implements IGestorMatriculaService{
	
	private static Logger LOG = Logger.getLogger(GestorMatriculaServiceImpl.class);

	@Autowired
	private IPropietarioJpaService iPropietarioJpaService;

	@Autowired
	private IVehiculoJpaService iVehiculoJpaService;

	@Autowired
	private IMatriculaJpaService iMatriculaJpaService;

	@Autowired
	@Qualifier("liviano")
	private IMatriculaVehicularService vehiL;

	@Autowired
	@Qualifier("pesado")
	private IMatriculaVehicularService vehiP;
	
	@Override
	public void matricularVehiculo(String cedulaPropietario, String placaVehiculo) {
	

		Vehiculo v = this.iVehiculoJpaService.buscar(placaVehiculo);
		Propietario p = this.iPropietarioJpaService.buscar(cedulaPropietario);

		LOG.info("Vehiculo encontrado para setear en la matricula: " + v.toString());
		LOG.info("Propietario encontrado para setear en la matricula: " + p.toString());

		Matricula m = new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		// m.setPropietario(null);//le envio null porque tofavia no vemos las relaciones
		// entre tablas
		BigDecimal valMatricula = null;
		
		

		if (v.getTipo().equals("L")) {
			valMatricula = this.vehiL.calcularDescuento(v.getPrecio());
		} else if (v.getTipo().equals("P")) {
			valMatricula = this.vehiP.calcularDescuento(v.getPrecio());
		}

		if (valMatricula.compareTo(new BigDecimal(2000)) > 0) {
			System.out.println("Aplicando descuento : " + valMatricula);
			BigDecimal valDescuento = valMatricula.multiply(new BigDecimal(0.07));
			valMatricula = valMatricula.subtract(valDescuento);
		}

		m.setValorMatrciula(valMatricula.setScale(2, RoundingMode.HALF_UP));
		// m.setVehiculo(null); //le envio null porque todavia no vemos relaciones entre
		// tablas

		this.iMatriculaJpaService.insertar(m);;

	
		
	}

}
