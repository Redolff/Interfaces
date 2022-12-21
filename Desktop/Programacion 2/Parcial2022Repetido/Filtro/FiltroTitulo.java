package Parcial2022Repetido.Filtro;

import Parcial2022Repetido.Noticia;

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
