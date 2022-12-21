package Adicional.Filtros;

import Adicional.ElementoEgresado;

public class FiltroNot extends Filtro {
	
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(ElementoEgresado elemento) {
		return !f1.cumple(elemento);
	}

}
