package SistemaDeComunicados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import SistemaDeComunicados.Filtros.Filtro;

public class Empleado extends ElementoComunicado{

	private String apellido;
	private int edad;
	private int numLegajo;
	private ArrayList<Notificacion> notificaciones;
	
	public Empleado(String nombre, String apellido, int edad, int num) {
		super(nombre);
		this.apellido = apellido;
		this.edad = edad;
		this.numLegajo = num;
		this.notificaciones = new ArrayList<>();
	}
	
	public int getEdad() {
		return edad;
	}
	
	
	
	public ArrayList<Notificacion> getNotificaciones(Notificacion n){
		return new ArrayList<>(notificaciones);
	}

	@Override
	public void addNotificacion(Notificacion n, Filtro filtro) {
		if(filtro.cumple(n)) {
			notificaciones.add(n);
		}
	}

	@Override
	public void addNotificacion(Notificacion n) {
		ArrayList<Notificacion> result = new ArrayList<>();
		if(!notificaciones.contains(n)) {
			result.add(n);
			notificaciones.add(n);
		}
	}

	@Override
	public int getCantidadEmpleados() {
		return 1;
	}

	@Override
	public ArrayList<Empleado> buscar(Comparator<Empleado> comp) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		resultado.add(this);
		return resultado;
	}

	@Override
	public int getMensajesTotales() {
		return notificaciones.size();
	}

	@Override
	public ArrayList<Empleado> buscar(Filtro filtro, Comparator<Empleado> comp) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		for(Notificacion n: notificaciones) {
			if(filtro.cumple(n)) {
				resultado.add(this);
			}
		}
		Collections.sort(resultado, comp);
		return resultado;
	}

	@Override
	public ArrayList<Empleado> buscar(Filtro filtro) {
		ArrayList<Empleado> resultado = new ArrayList<>();
		for(Notificacion n: notificaciones) {
			if(filtro.cumple(n)) {
				resultado.add(this);
			}
		}
		return resultado;
	}
	
}