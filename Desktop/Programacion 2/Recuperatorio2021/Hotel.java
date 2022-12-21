package Recuperatorio2021;

import java.util.ArrayList;
import java.util.Comparator;

import Recuperatorio2021.Filtros.Filtro;

public class Hotel extends ElementoHotelero {
	
	private ArrayList<ElementoHotelero> elementos;
	
	public Hotel() {
		this.elementos = new ArrayList<>();
	}

	public void addElemento(ElementoHotelero e) {
		if(!elementos.contains(e)) {
			elementos.add(e);
		}
	}

	@Override
	public ArrayList<Habitacion> buscar(Filtro filtro, Comparator<Habitacion> comp) {
		ArrayList<Habitacion> resultado = new ArrayList<>();
		for(ElementoHotelero e: elementos) {
			resultado.addAll(e.buscar(filtro, comp));
		}
		return resultado;
	}

	@Override
	public int getTotalHabitacionesLibres() {
		int total = 0;
		for(ElementoHotelero e: elementos) {
			if(!elementos.contains(e)) {
				total += e.getTotalHabitacionesLibres();
			}
		}
		return total;
	}

	@Override
	public int getTotalHabitaciones(Filtro filtro) {
		int total = 0;
		for(ElementoHotelero e: elementos) {
			total += e.getTotalHabitaciones(filtro);
		}
		return total;
	}

	@Override
	public double dimensionTotal() {
		double dimension = 0;
		for(ElementoHotelero e: elementos) {
			dimension += e.dimensionTotal();	
		}
		return dimension;
	}

}
