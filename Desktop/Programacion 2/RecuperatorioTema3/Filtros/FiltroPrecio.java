package RecuperatorioTema3.Filtros;

import RecuperatorioTema3.ElementoBazar;

public class FiltroPrecio extends Filtro {
	
	private double precio;
	
	public FiltroPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public boolean cumple(ElementoBazar combo) {
		return combo.getPrecio() < this.precio;
	}

}
