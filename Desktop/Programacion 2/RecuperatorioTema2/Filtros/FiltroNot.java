package RecuperatorioTema2.Filtros;

import RecuperatorioTema2.ElementoBazar;

public class FiltroNot extends Filtro {
	
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(ElementoBazar elemento) {
		return !f1.cumple(elemento);
	}

}
