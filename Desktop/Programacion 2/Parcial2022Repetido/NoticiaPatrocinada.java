package Parcial2022Repetido;

import java.util.ArrayList;

import Parcial2022Repetido.Filtro.Filtro;

public class NoticiaPatrocinada extends Noticia {

	public NoticiaPatrocinada(String cont, String tit, String autor, String cat) {
		super(cont, tit, autor, cat);
	}
	
	@Override
	public ArrayList<Noticia> buscar(Filtro filtro){
		ArrayList<Noticia> resultado = new ArrayList<>();
		resultado.add(this);
		return resultado;
	}

}
