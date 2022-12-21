package SistemaCensos;

import java.util.ArrayList;
import java.util.Comparator;

import SistemaCensos.Filtros.Filtro;

public abstract class ElementoGeneral{

	private String nombre;
	
	public ElementoGeneral(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract int getCantidadHabitantes();
	public abstract int getSuperficieTotal();
	public abstract double getIngresosPerCapita();
	public abstract int getDensidadPoblacion();	
	public abstract ArrayList<Comarca> buscar(Filtro filtro, Comparator<Comarca> orden);
	
}