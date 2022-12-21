package SitioWebDeNoticias.Filtros;

import SitioWebDeNoticias.Noticia;

public abstract class Filtro {
	public abstract boolean cumple(Noticia noticia);
}
