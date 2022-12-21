package ControlDeGastos.Filtros;

import ControlDeGastos.ElementoGasto;

public class FiltroRubro extends Filtro{
	
	private String rubro;
	
	public FiltroRubro(String rubro) {
		this.rubro = rubro;
	}
	
	public boolean cumple(ElementoGasto elemento) {
		return elemento.getCaracteristicas().contains(this.rubro);
	}

}
