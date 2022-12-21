package Recuperatorio2021.Comparadores;

import java.util.Comparator;

import Recuperatorio2021.Habitacion;

public class ComparadorCamas implements Comparator<Habitacion>{

	public int compare(Habitacion h1, Habitacion h2) {
		return h1.getCantidadCamas() - h2.getCantidadCamas();
	}
	
}
