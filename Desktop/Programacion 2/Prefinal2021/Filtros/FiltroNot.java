package Prefinal2021.Filtros;

import Prefinal2021.Video;

public class FiltroNot extends Filtro {
	
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(Video video) {
		return !f1.cumple(video);
	}

}
