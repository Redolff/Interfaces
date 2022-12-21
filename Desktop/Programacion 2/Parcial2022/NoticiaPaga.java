package Parcial2022;

import java.util.ArrayList;

import Parcial2022.Filtros.Filtro;

public class NoticiaPaga extends Noticia {

	public NoticiaPaga(String contenido, String titulo, String autor, String categoria) {
		super(contenido, titulo, autor, categoria);
	}
	
	@Override
	public ArrayList<Noticia> buscar(Filtro filtro){
		ArrayList<Noticia> resultado = new ArrayList<>();
		resultado.add(this);
		return resultado;
	}

}
