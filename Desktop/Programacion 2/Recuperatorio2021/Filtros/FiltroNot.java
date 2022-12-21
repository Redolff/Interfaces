package Recuperatorio2021.Filtros;

import Recuperatorio2021.Habitacion;

public class FiltroNot extends Filtro {
	
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(Habitacion habitacion) {
		return !f1.cumple(habitacion);
	}

}
