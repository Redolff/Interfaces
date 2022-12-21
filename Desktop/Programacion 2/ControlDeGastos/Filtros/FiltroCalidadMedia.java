package ControlDeGastos.Filtros;

import ControlDeGastos.ElementoGasto;

public class FiltroCalidadMedia extends Filtro{

	private String caracteristica;
	
	public FiltroCalidadMedia(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public boolean cumple(ElementoGasto g) {
		return g.getCaracteristicas().contains(this.caracteristica);
	}
	
}