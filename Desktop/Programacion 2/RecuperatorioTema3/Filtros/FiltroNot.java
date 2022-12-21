package RecuperatorioTema3.Filtros;

import RecuperatorioTema3.ElementoBazar;

public class FiltroNot extends Filtro {
	
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(ElementoBazar combo) {
		return !f1.cumple(combo);
	}

}
