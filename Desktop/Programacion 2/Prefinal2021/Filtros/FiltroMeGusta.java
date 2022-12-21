package Prefinal2021.Filtros;

import Prefinal2021.Video;

public class FiltroMeGusta extends Filtro {
	
	private int mg;
	
	public FiltroMeGusta(int mg) {
		this.mg = mg;
	}

	@Override
	public boolean cumple(Video video) {
		return video.getCant_mg() > this.mg;
	}

}
