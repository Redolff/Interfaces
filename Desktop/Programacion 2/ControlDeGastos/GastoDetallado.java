package ControlDeGastos;

import java.time.LocalDate;
import java.util.ArrayList;

import ControlDeGastos.Filtros.Filtro;

public class GastoDetallado extends ElementoGasto{

	private ArrayList<Gasto> gastos;
	
	public GastoDetallado(String nombre, LocalDate fecha, String descrip) {
		super(nombre, fecha, descrip);
		this.gastos = new ArrayList<>();
	}

	@Override
	public ArrayList<String> getCaracteristicas() {
		ArrayList<String> resultado = new ArrayList<>();
		for(Gasto g : gastos) {
			resultado.addAll(g.getCaracteristicas());
		}
		return resultado;
	}

	@Override
	public ArrayList<ElementoGasto> buscar(Filtro filtro) {
		ArrayList<ElementoGasto> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		else {
			for(Gasto g: gastos) {
				resultado.addAll(g.buscar(filtro));
			}
		}
		return resultado;
	}

	@Override
	public double getMonto(Filtro filtro) {
		double dinero = 0;
		ArrayList<ElementoGasto> resultado = buscar(filtro);
		for(ElementoGasto e : resultado) {
			dinero = e.getMonto();
		}
		return dinero;
	}

	@Override
	public double getMonto() {
		double monto = 0;
		for(Gasto g: gastos) {
			monto += g.getMonto();
		}
		return monto;
	}
	
}
