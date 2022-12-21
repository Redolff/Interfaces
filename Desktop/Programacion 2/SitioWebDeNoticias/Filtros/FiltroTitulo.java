package SitioWebDeNoticias.Filtros;

import SitioWebDeNoticias.Noticia;

public class FiltroTitulo extends Filtro {

	private String titulo;
	
	public FiltroTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getTitulo().equals(titulo);
	}

}
