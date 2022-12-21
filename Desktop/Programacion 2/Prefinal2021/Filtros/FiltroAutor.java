package Prefinal2021.Filtros;

import Prefinal2021.Video;

public class FiltroAutor extends Filtro {
	
	private String autor;
	
	public FiltroAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public boolean cumple(Video video) {
		return video.getAutor().equals(this.autor);
	}

}
