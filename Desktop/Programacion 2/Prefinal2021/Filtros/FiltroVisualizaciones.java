package Prefinal2021.Filtros;

import Prefinal2021.Video;

public class FiltroVisualizaciones extends Filtro {
	
	private int visualizaciones;
	
	public FiltroVisualizaciones(int vis) {
		this.visualizaciones = vis;
	}

	@Override
	public boolean cumple(Video video) {
		return video.getCant_visual() > this.visualizaciones;
	}

}
