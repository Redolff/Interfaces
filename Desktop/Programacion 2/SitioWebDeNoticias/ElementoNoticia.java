package SitioWebDeNoticias;

import java.util.ArrayList;

import SitioWebDeNoticias.Filtros.Filtro;

public abstract class ElementoNoticia {

	private String nombre;
	
	public ElementoNoticia(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract int getCantidadNoticias();	
	public abstract ArrayList<ElementoNoticia> buscar(Filtro filtro);
	public abstract ArrayList<String> mapaSitio();
	
}