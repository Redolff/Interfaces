package Recuperatorio2021.Filtros;

import Recuperatorio2021.Habitacion;

public class FiltroMascotas extends Filtro {
	
	@Override
	public boolean cumple(Habitacion habitacion) {
		return habitacion.isMascotas();
	}

}
