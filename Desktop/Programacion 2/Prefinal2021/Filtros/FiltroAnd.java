package Prefinal2021.Filtros;

import Prefinal2021.Video;

public class FiltroAnd extends Filtro {
	
	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Video video) {
		return (f1.cumple(video) && f2.cumple(video));
	}

}
