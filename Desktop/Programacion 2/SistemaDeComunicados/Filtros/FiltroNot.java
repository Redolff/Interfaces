package SistemaDeComunicados.Filtros;

import SistemaDeComunicados.Notificacion;

public class FiltroNot extends Filtro {
	
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(Notificacion n) {
		return !f1.cumple(n);
	}

}
