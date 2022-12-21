package Aseguradora.Filtros;

import Aseguradora.SeguroGeneral;

public class FiltroMontoSuperior extends Filtro {
	
	private double monto;
	
	public FiltroMontoSuperior(double monto) {
		this.monto = monto;
	}

	@Override
	public boolean cumple(SeguroGeneral seguro) {
		return seguro.getMonto() > monto;
	}

}
