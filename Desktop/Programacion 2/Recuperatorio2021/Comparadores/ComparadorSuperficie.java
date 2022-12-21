package Recuperatorio2021.Comparadores;

import java.util.Comparator;

import Recuperatorio2021.Habitacion;

public class ComparadorSuperficie implements Comparator<Habitacion>{

	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		return (int) (h1.dimensionTotal() - h2.dimensionTotal());
	}
	
}
