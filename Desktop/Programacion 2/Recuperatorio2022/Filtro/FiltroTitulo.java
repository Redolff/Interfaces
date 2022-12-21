package Recuperatorio2022.Filtro;

import Recuperatorio2022.Noticia;

public class FiltroTitulo extends Filtro {
	
	private String titulo;
	
	public FiltroTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.tieneTitulo(this.titulo);
	}

}
