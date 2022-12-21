package SistemaCensos.Filtros;

import SistemaCensos.Comarca;

public class FiltroNot extends Filtro {
	
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(Comarca comarca) {
		return !f1.cumple(comarca);
	}

}
