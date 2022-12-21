package Aseguradora.Filtros;

import Aseguradora.SeguroGeneral;

public class FiltroNot extends Filtro {
	
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(SeguroGeneral seguro) {
		return !f1.cumple(seguro);
	}

}
