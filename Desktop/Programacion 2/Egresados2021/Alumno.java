package Egresados2021;

import java.time.LocalDate;
import java.util.ArrayList;

import Egresados2021.Filtros.Filtro;

public class Alumno extends ElementoEgresado {
	
	private double precio;
	private double deuda;

	public Alumno(String nombre, String destino, LocalDate fechaP, LocalDate fechaR, double precio, double deuda) {
		super(nombre, destino, fechaP, fechaR);
		this.precio = precio;
		this.deuda = deuda;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public double getDeuda() {
		return deuda;
	}

	@Override
	public int getTotalAlumnos() {
		return 1;
	}

	@Override
	public Alumno getAlumnoMayorDeuda() {
		return this;
	}

	@Override
	public ElementoEgresado getCopia() {
		Alumno alumno = new Alumno(this.getNombre(),
						this.getDestino(),
						this.getFechaPartida(),
						this.getFechaRegreso(),
						this.getPrecio(),
						this.getDeuda());
		return alumno;	
	}
	
	public ArrayList<ElementoEgresado> buscar(Filtro filtro){
		ArrayList<ElementoEgresado> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
}