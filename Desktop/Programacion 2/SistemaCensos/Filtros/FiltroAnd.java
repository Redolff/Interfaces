package SistemaCensos.Filtros;

import SistemaCensos.Comarca;

public class FiltroAnd extends Filtro {
	
	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Comarca comarca) {
		return (f1.cumple(comarca) && f2.cumple(comarca));
	}

}
