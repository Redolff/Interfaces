package Parcial2022.Filtros;

import Parcial2022.Noticia;

public class FiltroNot extends Filtro {
	
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return !f1.cumple(noticia);
	}

}
