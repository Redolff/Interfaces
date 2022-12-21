package SitioWebDeNoticias;

import SitioWebDeNoticias.Filtros.Filtro;
import SitioWebDeNoticias.Filtros.FiltroAnd;
import SitioWebDeNoticias.Filtros.FiltroAutor;
import SitioWebDeNoticias.Filtros.FiltroLargoTexto;
import SitioWebDeNoticias.Filtros.FiltroNot;
import SitioWebDeNoticias.Filtros.FiltroOr;
import SitioWebDeNoticias.Filtros.FiltroPalabraClave;
import SitioWebDeNoticias.Filtros.FiltroTitulo;

public class main {

	public static void main(String[] args) {
		Categoria categoria = new Categoria("Generales", "prog 2", "hola.jpg");
		Categoria seccion = new Categoria("Deportes", "buenaaa", "hola.jpg");
		Categoria subSeccion = new Categoria("Futbol", "flojo paa mi", "que.jpg");
		
		Noticia noticia1 = new Noticia("Federico", "Ultimo momento", "buena", "hola como estas", "asfafasfsa", "Link4");
		Noticia noticia2 = new Noticia("Juan", "Ultimo momento", "mmm", "bien y vos", "Ramos", "Link2");
		Noticia noticia3 = new Noticia("Joaquin", "Matematica computacional", "una mas o menos", "queeee", "Juan Perez", "Link3");
		Noticia noticia4 = new Noticia("Roman", "Ultimo momento", "que se yo", "bueno o no", "Juan Perez", "subSeccion");
		
		noticia1.addPalabraClave("Web");
		noticia1.addPalabraClave("verde");
		
		noticia2.addPalabraClave("Partido");
		noticia2.addPalabraClave("Goleada");
		
		noticia3.addPalabraClave("Goleada");
		
		noticia4.addPalabraClave("Goleada");
		
		Filtro largo = new FiltroLargoTexto(10);
		Filtro autor = new FiltroAutor("Juan Perez");
		Filtro titulo = new FiltroTitulo("Ultimo momento");
		Filtro palabraClave = new FiltroPalabraClave("Partido");
		Filtro palabraClave2 = new FiltroPalabraClave("Goleada");
		Filtro and = new FiltroAnd(palabraClave, palabraClave2);
		Filtro or = new FiltroOr(palabraClave, palabraClave2);
		Filtro not = new FiltroNot(autor);
		
		categoria.addElementoNoticia(seccion);
		seccion.addElementoNoticia(subSeccion);
		subSeccion.addElementoNoticia(noticia1);
		//subSeccion.addElementoNoticia(noticia3);
		
		System.out.println(categoria.mapaSitio());

	}

}
