package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;

public class VehiculoLivianoServiceImpl implements IMatriculaVehicularService{

	@Override
	public BigDecimal calcularDescuento(BigDecimal precio) {
		// TODO Auto-generated method stub
		return precio.multiply(new BigDecimal(0.14));
	}

}
