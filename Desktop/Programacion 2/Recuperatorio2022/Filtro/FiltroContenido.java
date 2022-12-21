package Recuperatorio2022.Filtro;

import Recuperatorio2022.Noticia;

public class FiltroContenido extends Filtro {
	
	private String contenido;
	
	public FiltroContenido(String cont) {
		this.contenido = cont;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.tieneContenido(this.contenido);
	}

}
