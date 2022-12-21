package Parcial2022.Filtros;

import Parcial2022.Noticia;

public class FiltroContenido extends Filtro {
	
	private String contenido;
	
	public FiltroContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.tieneContenido(this.contenido);
	}

}
