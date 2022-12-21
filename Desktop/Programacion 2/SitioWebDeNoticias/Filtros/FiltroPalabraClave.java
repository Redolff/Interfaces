package SitioWebDeNoticias.Filtros;

import SitioWebDeNoticias.Noticia;

public class FiltroPalabraClave extends Filtro{

	private String palabraClave;
	
	public FiltroPalabraClave(String palabra) {
		this.palabraClave = palabra;
	}
	
	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.tienePalabraClave(palabraClave); 
	}
	
}
