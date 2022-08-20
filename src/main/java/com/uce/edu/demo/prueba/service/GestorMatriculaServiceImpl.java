package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repositorry.IMatriculaJpaRepository;
import com.uce.edu.demo.prueba.repositorry.IPropietarioJpaRepository;
import com.uce.edu.demo.prueba.repositorry.IVehiculoJpaRepository;
import com.uce.edu.demo.prueba.repository.modelo.Matricula;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService{
	
	private static Logger LOG = Logger.getLogger(GestorMatriculaServiceImpl.class);

	@Autowired
	private IPropietarioJpaRepository propietarioJpaRepository;
	@Autowired
	private IVehiculoJpaRepository vehiculoJpaRepository;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaVehicularService matriculaPesadoService;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaVehicularService matriculaLivianoService;
	
	@Autowired
	private IMatriculaJpaRepository matriculaRepository;
	
	@Override
	public void matricularVehiculo(String cedulaPropietario, String placaVehiculo) {
	

		Vehiculo v = this.vehiculoJpaRepository.buscar(placaVehiculo);
		Propietario p = this.propietarioJpaRepository.buscar(cedulaPropietario);

		LOG.info("Vehiculo encontrado para setear en la matricula: " + v.toString());
		LOG.info("Propietario encontrado para setear en la matricula: " + p.toString());

		String tipo=v.getTipo();
		BigDecimal valMatricula = null;
		
		

		if (v.getTipo().equals("L")) {
			valMatricula = this.matriculaLivianoService.calcularDescuento(v.getPrecio());
		} else if (v.getTipo().equals("P")) {
			valMatricula = this.matriculaPesadoService.calcularDescuento(v.getPrecio());
		}

		if (valMatricula.compareTo(new BigDecimal(2000)) > 0) {
			System.out.println("Aplicando descuento : " + valMatricula);
			BigDecimal valDescuento = valMatricula.multiply(new BigDecimal(0.07));
			valMatricula = valMatricula.subtract(valDescuento);
		}

		Matricula m =new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		m.setValorMatrciula(valMatricula);
		m.setPropietario(p);
		m.setVehiculo(v);


		this.matriculaRepository.insertar(m);

	
		
	}

}
