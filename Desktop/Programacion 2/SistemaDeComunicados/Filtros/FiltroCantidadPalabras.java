package SistemaDeComunicados.Filtros;

import SistemaDeComunicados.Notificacion;

public class FiltroCantidadPalabras extends Filtro {
	
	private int cantidad;
	
	public FiltroCantidadPalabras(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public boolean cumple(Notificacion n) {
		return n.getCantidadPalabras() < this.cantidad;
	}

}
