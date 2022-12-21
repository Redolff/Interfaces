package Adicional.Filtros;

import Adicional.ElementoEgresado;

public class FiltroDeuda extends Filtro {
	
	private double deuda;
	
	public FiltroDeuda(double deuda) {
		this.deuda = deuda;
	}

	@Override
	public boolean cumple(ElementoEgresado elemento) {
		return elemento.getDeuda() > this.deuda;
	}

}
