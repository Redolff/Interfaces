package ControlDeGastos.Filtros;

import ControlDeGastos.ElementoGasto;
import ControlDeGastos.Gasto;

public class FiltroMonto extends Filtro{

	private double monto;
	
	public FiltroMonto(double monto) {
		this.monto = monto;
	}
	
	public boolean cumple(ElementoGasto g) {
		return g.getMonto() > this.monto;
	}
	
}