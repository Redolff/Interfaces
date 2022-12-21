package SistemaCensos.Filtros;

import SistemaCensos.Comarca;

public class FiltroNombre extends Filtro {
	
	public String nombre;
	
	public FiltroNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(Comarca comarca) {
		return comarca.getNombre().equals(this.nombre);
	}

}
