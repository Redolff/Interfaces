package RecuperatorioTema3.Filtros;

import RecuperatorioTema3.ElementoBazar;

public class FiltroAnd extends Filtro {
	
	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(ElementoBazar combo) {
		return (f1.cumple(combo) && f2.cumple(combo));
	}

}
