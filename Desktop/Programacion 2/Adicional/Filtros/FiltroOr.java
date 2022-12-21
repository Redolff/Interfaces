package Adicional.Filtros;

import Adicional.ElementoEgresado;

public class FiltroOr extends Filtro {
	
	private Filtro f1;
	private Filtro f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(ElementoEgresado elemento) {
		return (f1.cumple(elemento) || f2.cumple(elemento));
	}

}
