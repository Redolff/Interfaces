package ControlDeGastos;

import java.time.LocalDate;
import java.util.ArrayList;

import ControlDeGastos.Filtros.Filtro;

public class Gasto extends ElementoGasto {
	
	private int monto;
	private ArrayList<String> caracteristicas;
	
	public Gasto(String nombre, String descrip, LocalDate fecha, int monto) {
		super(nombre, fecha, descrip);
		this.monto = monto;
		this.caracteristicas = new ArrayList<>();
	}
	
	@Override
	public ArrayList<String> getCaracteristicas(){
		return new ArrayList<>(caracteristicas);
	}
	
	public boolean contieneCaracteristica(String c) {
		return caracteristicas.contains(c);
	}
	
	public double getMonto() {
		return monto;
	}

	@Override
	public double getMonto(Filtro filtro) {
		double monto = 0;
		if(filtro.cumple(this)) {
			monto = this.getMonto(filtro);
		}
		return monto;
	}

	@Override
	public ArrayList<ElementoGasto> buscar(Filtro filtro) {
		ArrayList<ElementoGasto> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	
	
}