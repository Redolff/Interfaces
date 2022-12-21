package SistemaDeComunicados.Filtros;

import SistemaDeComunicados.Notificacion;

public class FiltroOr extends Filtro {
	
	private Filtro f1;
	private Filtro f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Notificacion n) {
		return (f1.cumple(n) || f2.cumple(n));
	}

}
