package Parcial2022.Filtros;

import Parcial2022.Noticia;

public class FiltroAutor extends Filtro{
	
	private String autor;
	
	public FiltroAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public boolean cumple(Noticia n) {
		return n.getAutor().equals(this.autor);
	}

}
