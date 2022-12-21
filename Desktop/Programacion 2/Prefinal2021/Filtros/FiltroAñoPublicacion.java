package Prefinal2021.Filtros;

import java.time.LocalDate;

import Prefinal2021.Video;

public class FiltroA�oPublicacion extends Filtro {
	
	private LocalDate a�o;
	
	public FiltroA�oPublicacion(LocalDate a�o) {
		this.a�o = a�o;
	}

	@Override
	public boolean cumple(Video video) {
		return video.getA�o_publi().equals(this.a�o);
	}

}
