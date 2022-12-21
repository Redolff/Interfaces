package Parcial2022Repetido.Filtro;

import Parcial2022Repetido.Noticia;

public class FiltroCategoria extends Filtro {
	
	private String categoria;
	
	public FiltroCategoria(String cat) {
		this.categoria = cat;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getCategoria().equals(this.categoria);
	}

}
