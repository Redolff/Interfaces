package Recuperatorio2022.Filtro;

import Recuperatorio2022.Noticia;

public class FiltroAnd extends Filtro {
	
	private Filtro f1;
	private Filtro f2;

	@Override
	public boolean cumple(Noticia noticia) {
		return (f1.cumple(noticia) && f2.cumple(noticia));
	}

}
