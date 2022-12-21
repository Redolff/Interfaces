package Parcial2022.Filtros;

import Parcial2022.Noticia;

public class FiltroCategoria extends Filtro{

	private String categoria;
	
	public FiltroCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public boolean cumple(Noticia n) {
		return n.getCategoria().equals(this.categoria);
	}
	
}
