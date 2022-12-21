package Parcial2022Repetido.Filtro;

import Parcial2022Repetido.Noticia;

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
