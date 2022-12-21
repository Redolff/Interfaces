package ControlDeGastos.Filtros;

import java.time.LocalDate;

import ControlDeGastos.ElementoGasto;
import ControlDeGastos.Gasto;

public class FiltroFecha extends Filtro{

	private LocalDate fecha;
	
	public FiltroFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public boolean cumple(ElementoGasto g) {
		return g.getFecha().equals(this.fecha);
	}
	
}