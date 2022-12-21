package SistemaCensos.Filtros;

import SistemaCensos.Comarca;

public class FiltroDensidad extends Filtro{

	private int densidad;
	
	public FiltroDensidad(int densidad) {
		this.densidad = densidad;
	}

	@Override
	public boolean cumple(Comarca comarca) {
		return comarca.getDensidadPoblacion() > this.densidad;
	}
	
}