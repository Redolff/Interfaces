package SistemaCensos.Filtros;

import SistemaCensos.Comarca;

public class FiltroHabitantes extends Filtro{

	public int habitantes;
	
	public FiltroHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	@Override
	public boolean cumple(Comarca comarca) {
		return comarca.getCantidadHabitantes() > this.habitantes;
	}
	
}
