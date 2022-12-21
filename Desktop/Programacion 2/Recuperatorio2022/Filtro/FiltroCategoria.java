package Recuperatorio2022.Filtro;

import Recuperatorio2022.Noticia;

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
