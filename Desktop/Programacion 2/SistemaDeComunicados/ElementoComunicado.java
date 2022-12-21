package SistemaDeComunicados;

import java.util.ArrayList;
import java.util.Comparator;

import SistemaDeComunicados.Filtros.Filtro;

public abstract class ElementoComunicado {
	
	private String nombre;
	
	public ElementoComunicado(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract void addNotificacion(Notificacion n);
	public abstract void addNotificacion(Notificacion not, Filtro filtro);
	public abstract int getCantidadEmpleados();
	public abstract ArrayList<Empleado> buscar(Comparator<Empleado> comp);
	public abstract ArrayList<Empleado> buscar(Filtro filtro, Comparator<Empleado> comp);
	public abstract ArrayList<Empleado> buscar(Filtro filtro);
	public abstract int getMensajesTotales();
	
	
}