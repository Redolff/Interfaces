package Recuperatorio2021;

import java.util.ArrayList;
import java.util.Comparator;

import Recuperatorio2021.Filtros.Filtro;

public abstract class ElementoHotelero {

	public abstract ArrayList<Habitacion> buscar(Filtro filtro, Comparator<Habitacion> comp);
	public abstract int getTotalHabitacionesLibres();
	public abstract int getTotalHabitaciones(Filtro filtro);
	public abstract double dimensionTotal();
	
}