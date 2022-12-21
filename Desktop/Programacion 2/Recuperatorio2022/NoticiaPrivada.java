package Recuperatorio2022;

import Recuperatorio2022.Filtro.Filtro;

public class NoticiaPrivada extends Noticia {

	public NoticiaPrivada(String cat, String cont, String tit, String autor) {
		super(cat, cont, tit, autor);
	}
	
	@Override
	public ElementoPortal getCopia(Filtro filtro) {
		return null;
	}

}
