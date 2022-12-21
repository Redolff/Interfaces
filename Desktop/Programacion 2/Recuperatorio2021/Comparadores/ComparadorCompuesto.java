package Recuperatorio2021.Comparadores;

import java.util.Comparator;

import Recuperatorio2021.Habitacion;

public class ComparadorCompuesto implements Comparator<Habitacion>{

	private Comparator<Habitacion> comp1;
	private Comparator<Habitacion> comp2;
	
	public ComparadorCompuesto(Comparator<Habitacion> comp1, Comparator<Habitacion> comp2) {
		this.comp1 = comp1;
		this.comp2 = comp2;
	}
	
	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		int resultado = comp1.compare(h1, h2);
		if(resultado == 0) {
			return comp2.compare(h1, h2);
		}
		return resultado;
	}
	
}
