package SistemaDeComunicados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import SistemaDeComunicados.Filtros.Filtro;

public class Grupo extends ElementoComunicado{

	private ArrayList<ElementoComunicado> elementos;
	
	public Grupo(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(ElementoComunicado e) {
		elementos.add(e);
	}

	@Override
	public void addNotificacion(Notificacion n, Filtro filtro) {
		for(ElementoComunicado e: elementos) {
			e.addNotificacion(n, filtro);				
		}
	}

	@Override
	public void addNotificacion(Notificacion n) {
		for(ElementoComunicado e: elementos){
			e.addNotificacion(n);
		}
	}

	@Override
	public int getCantidadEmpleados() {
		int empleados = 0;
		for(ElementoComunicado e: elementos) {
			empleados += e.getCantidadEmpleados();
		}
		return empleados;
	}

	@Override
	public ArrayList<Empleado> buscar(Comparator<Empleado> comp) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		for(ElementoComunicado e: elementos) {
			if(!elementos.contains(e)) {
				resultado.addAll(e.buscar(comp));
			}
		}
		Collections.sort(resultado, comp);
		return resultado;
	}

	@Override
	public int getMensajesTotales() {
		int mensajes = 0;
		for(ElementoComunicado e: elementos) {
			mensajes += e.getMensajesTotales();
		}
		return mensajes;
	}

	@Override
	public ArrayList<Empleado> buscar(Filtro filtro, Comparator<Empleado> comp) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		for(ElementoComunicado e: elementos) {
			resultado.addAll(e.buscar(filtro, comp));
		}
		return resultado;
	}

	@Override
	public ArrayList<Empleado> buscar(Filtro filtro) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		for(ElementoComunicado e: elementos) {
			resultado.addAll(e.buscar(filtro));
		}
		return resultado;
	}
	
	
}