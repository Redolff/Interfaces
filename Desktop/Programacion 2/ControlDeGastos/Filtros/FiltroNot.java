package ControlDeGastos.Filtros;

import ControlDeGastos.ElementoGasto;

public class FiltroNot extends Filtro {
	
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(ElementoGasto elemento) {
		return !f1.cumple(elemento);
	}

}
