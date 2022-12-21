package Prefinal2021.Filtros;

import Prefinal2021.Video;

public class FiltroPalabra extends Filtro {
	
	private String palabra;
	
	public FiltroPalabra(String p) {
		this.palabra = p;
	}

	@Override
	public boolean cumple(Video video) {
		return video.contienePalabra(this.palabra);
	}

}
