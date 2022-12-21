package SitioWebDeNoticias.Filtros;

import SitioWebDeNoticias.Noticia;

public class FiltroLargoTexto extends Filtro{
	
	private int largo;
	
	public FiltroLargoTexto(int largo) {
		this.largo = largo;
	}
	
	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getLargoTexto() > this.largo;
	}

}
