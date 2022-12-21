package Prefinal2021.Filtros;

import java.time.LocalDate;

import Prefinal2021.Video;

public class FiltroAñoPublicacion extends Filtro {
	
	private LocalDate año;
	
	public FiltroAñoPublicacion(LocalDate año) {
		this.año = año;
	}

	@Override
	public boolean cumple(Video video) {
		return video.getAño_publi().equals(this.año);
	}

}
