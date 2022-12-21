package Recuperatorio2021;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Recuperatorio2021.Filtros.Filtro;

public class Habitacion extends ElementoHotelero{

	private double metrosCuadrados;
	private int cantidadCamas;
	private LocalDate fechaOcupacion;
	private boolean mascotas;
	private ArrayList<String> equipamientos;
	
	public Habitacion(double metros, int camas, LocalDate fechaO, boolean mascotas) {
		this.metrosCuadrados = metros;
		this.cantidadCamas = camas;
		this.fechaOcupacion = fechaO;
		this.mascotas = mascotas;
		this.equipamientos = new ArrayList<>();
	}

	public int getCantidadCamas() {
		return cantidadCamas;
	}

	public LocalDate getFechaOcupacion() {
		return fechaOcupacion;
	}

	public boolean isMascotas() {
		return mascotas;
	}

	public ArrayList<String> getEquipamientos() {
		return new ArrayList<>(equipamientos);
	}
	
	public boolean tieneEquipamiento(String equipamiento) {
		return equipamientos.contains(equipamiento);
	}

	@Override
	public ArrayList<Habitacion> buscar(Filtro filtro, Comparator<Habitacion> comp) {
		ArrayList<Habitacion> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		Collections.sort(resultado, comp);
		return resultado;
	}

	@Override
	public int getTotalHabitacionesLibres() {
		//NI IDEA LA VERDAD.
		return 0;
	}

	@Override
	public int getTotalHabitaciones(Filtro filtro) {
		int total = 0;
		if(filtro.cumple(this)) {
			total++;
		}
		return total;
	}

	@Override
	public double dimensionTotal() {
		return metrosCuadrados;
	}
	
}