package Adicional;

import java.time.LocalDate;
import java.util.ArrayList;

import Adicional.Filtros.Filtro;

public class Alumno extends ElementoEgresado {
	
	private double precio;
	private double deuda;
	
	public Alumno(String nombre, String destino, LocalDate partida, LocalDate regreso, double precio, double deuda) {
		super(nombre, destino, partida, regreso);
		this.precio = precio;
		this.deuda = deuda;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public double getDeuda() {
		return deuda;
	}
	
	public int getCantidadAlumnos() {
		return 1;
	}
	
	public Alumno getAlumnoMayorDeuda() {
		return this;
	}
	
	public ElementoEgresado getCopia() {
		Alumno copia = new Alumno(this.getNombre(), this.getDestino(), this.getFechaPartida(), this.getFechaRegreso(), this.precio, this.deuda);
		return copia;
	}

	@Override
	public ArrayList<ElementoEgresado> buscar(Filtro filtro) {
		ArrayList<ElementoEgresado> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}

}