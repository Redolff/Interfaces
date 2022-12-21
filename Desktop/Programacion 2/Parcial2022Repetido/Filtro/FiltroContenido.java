package Parcial2022Repetido.Filtro;

import Parcial2022Repetido.Noticia;

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
