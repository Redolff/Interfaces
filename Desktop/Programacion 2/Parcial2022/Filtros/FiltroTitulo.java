package Parcial2022.Filtros;

import Parcial2022.Noticia;

public class FiltroTitulo extends Filtro {
	
	private String titulo;
	
	public FiltroTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public boolean cumple(Noticia n) {
		return n.contieneTitulo(this.titulo);
	}

}
