package SistemaDeComunicados.Filtros;

import SistemaDeComunicados.Notificacion;

public class FiltroContienePalabra extends Filtro {

	private String palabra;
	
	public FiltroContienePalabra(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public boolean cumple(Notificacion n) {
		return n.contienePalabra(this.palabra);
	}

}
