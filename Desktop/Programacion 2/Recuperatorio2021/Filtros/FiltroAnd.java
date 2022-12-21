package Recuperatorio2021.Filtros;

import Recuperatorio2021.Habitacion;

public class FiltroAnd extends Filtro {
	
	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Habitacion habitacion) {
		return (f1.cumple(habitacion) && f2.cumple(habitacion));
	}

}
