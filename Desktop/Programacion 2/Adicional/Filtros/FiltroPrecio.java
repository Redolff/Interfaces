package Adicional.Filtros;

import Adicional.ElementoEgresado;

public class FiltroPrecio extends Filtro {
	
	private double precio;

	@Override
	public boolean cumple(ElementoEgresado elemento) {
		return elemento.getPrecio() > this.precio;
	}

}
