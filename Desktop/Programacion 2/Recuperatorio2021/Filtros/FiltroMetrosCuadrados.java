package Recuperatorio2021.Filtros;

import Recuperatorio2021.Habitacion;

public class FiltroMetrosCuadrados extends Filtro {
	
	private double metrosCuadrados;

	@Override
	public boolean cumple(Habitacion habitacion) {
		return habitacion.dimensionTotal() > this.metrosCuadrados;
	}

}
