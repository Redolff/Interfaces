package RecuperatorioTema2.Filtros;

import RecuperatorioTema2.ElementoBazar;

public class FiltroPrecio extends Filtro {
	
	private double precio;
	
	public FiltroPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public boolean cumple(ElementoBazar elemento) {
		return elemento.getPrecio() < this.precio;
	}

}
