package Egresados2021;

import java.time.LocalDate;
import java.util.ArrayList;

import Egresados2021.Filtros.Filtro;

public abstract class ElementoEgresado {

	private String nombre;
	private String destino;
	private LocalDate fechaPartida;
	private LocalDate fechaRegreso;
	
	public ElementoEgresado(String nombre, String destino, LocalDate fechaP, LocalDate fechaR) {
		this.nombre = nombre;
		this.destino = destino;
		this.fechaPartida = fechaP;
		this.fechaRegreso = fechaR;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public LocalDate getFechaPartida() {
		return fechaPartida;
	}
	
	public LocalDate getFechaRegreso() {
		return fechaRegreso;
	}
	
	public abstract double getPrecio();
	public abstract double getDeuda();
	public abstract int getTotalAlumnos();
	public abstract Alumno getAlumnoMayorDeuda();
	public abstract ElementoEgresado getCopia();
	public abstract ArrayList<ElementoEgresado> buscar(Filtro filtro);
	
	
}