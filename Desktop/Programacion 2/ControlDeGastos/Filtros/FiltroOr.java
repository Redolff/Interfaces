package ControlDeGastos.Filtros;

import ControlDeGastos.ElementoGasto;

public class FiltroOr extends Filtro{
	
	private Filtro f1;
	private Filtro f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public boolean cumple(ElementoGasto elemento) {
		return (f1.cumple(elemento) || f2.cumple(elemento));
	}

}
