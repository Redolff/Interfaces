package Recuperatorio2021.Filtros;

import Recuperatorio2021.Habitacion;

public class FiltroEquipamiento extends Filtro {
	
	private String equipamiento;
	
	public FiltroEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}

	@Override
	public boolean cumple(Habitacion habitacion) {
		return habitacion.tieneEquipamiento(this.equipamiento);
	}

}
