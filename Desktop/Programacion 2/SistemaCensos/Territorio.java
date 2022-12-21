package SistemaCensos;

import java.util.ArrayList;
import java.util.Comparator;

import SistemaCensos.Filtros.Filtro;

public class Territorio extends ElementoGeneral{

	private ArrayList<ElementoGeneral> elementos;
	
	public Territorio(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}
	
	public void addElementoGeneral(ElementoGeneral e) {
		elementos.add(e);
	}

	@Override
	public int getCantidadHabitantes() {
		int habitantes = 0;
		for(ElementoGeneral e : elementos) {
			habitantes += e.getCantidadHabitantes();
		}
		return habitantes;
	}

	@Override
	public int getSuperficieTotal() {
		int superficie = 0;
		for(ElementoGeneral e: elementos) {
			superficie += e.getSuperficieTotal();
		}
		return superficie;
	}

	@Override
	public double getIngresosPerCapita() {
		double ingresos = 0;
		for(ElementoGeneral e : elementos) {
			ingresos += e.getIngresosPerCapita();
		}
		return ingresos;
	}

	@Override
	public int getDensidadPoblacion() {
		int densidad = 0;
		for(ElementoGeneral e: elementos) {
			densidad += e.getDensidadPoblacion();
		}
		return densidad;
	}
	
	public ArrayList<Comarca> buscar(Filtro filtro, Comparator<Comarca> orden){
		ArrayList<Comarca> resultado = new ArrayList<>();
		for(ElementoGeneral e : elementos) {
			resultado.addAll(e.buscar(filtro, orden));
		}
		return resultado;
	}


	
}