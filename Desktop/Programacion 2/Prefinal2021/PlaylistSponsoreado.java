package Prefinal2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Prefinal2021.Filtros.Filtro;

public class PlaylistSponsoreado extends Playlist {
	
	private Video video;

	public PlaylistSponsoreado(String titulo, int segundos, Video video) {
		super(titulo, segundos);
		this.video = video;
	}
	
	@Override
	public ArrayList<Video> buscar(Filtro filtro, Comparator<Video> comp){
		ArrayList<Video> resultado = super.buscar(filtro, comp);
		resultado.add(0, video);
		return resultado;
	}

}
