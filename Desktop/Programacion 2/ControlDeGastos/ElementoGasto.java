package ControlDeGastos;

import java.time.LocalDate;
import java.util.ArrayList;

import ControlDeGastos.Filtros.Filtro;

public abstract class ElementoGasto {
	
	private String nombre;
	private LocalDate fecha;
	private String descrip;
	
	public ElementoGasto(String nombre, LocalDate fecha, String descrip) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.descrip = descrip;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public String getDescripcion() {
		return descrip;
	}
	
	public abstract double getMonto();
	public abstract double getMonto(Filtro filtro);
	public abstract ArrayList<String> getCaracteristicas();
	public abstract ArrayList<ElementoGasto> buscar(Filtro filtro);
	
	
}