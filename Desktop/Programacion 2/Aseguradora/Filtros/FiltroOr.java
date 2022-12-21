package Aseguradora.Filtros;

import Aseguradora.SeguroGeneral;

public class FiltroOr extends Filtro {
	
	private Filtro f1;
	private Filtro f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(SeguroGeneral seguro) {
		return (f1.cumple(seguro) || f2.cumple(seguro));
	}

}
