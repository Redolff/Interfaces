package SistemaCensos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import SistemaCensos.Filtros.Filtro;

public class Comarca extends ElementoGeneral implements Comparator<Comarca>{

	private int superficie;
	private int cant_habitantes;
	private double monto_total;
	
	public Comarca(String nombre, int superficie, int habitantes, double monto) {
		super(nombre);
		this.superficie = superficie;
		this.cant_habitantes = habitantes;
		this.monto_total = monto;
	}

	@Override
	public int getCantidadHabitantes() {
		return cant_habitantes;
	}

	@Override
	public int getSuperficieTotal() {
		return superficie;
	}

	public double getMontoTotal() {
		return monto_total;
	}

	@Override
	public double getIngresosPerCapita() {
		double ingreso = 0;
		ingreso = this.monto_total/this.cant_habitantes;
		return ingreso;
	}

	@Override
	public int getDensidadPoblacion() {
		int densidad = 0;
		densidad = this.cant_habitantes / this.superficie;
		return densidad;
	}

	@Override
	public ArrayList<Comarca> buscar(Filtro filtro, Comparator<Comarca> orden){
		ArrayList<Comarca> resultado = new ArrayList<>();
		Collections.sort(resultado, orden);
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}

	@Override
	public int compare(Comarca o1, Comarca o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
}