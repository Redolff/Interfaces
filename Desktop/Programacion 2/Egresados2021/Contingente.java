package Egresados2021;

import java.time.LocalDate;
import java.util.ArrayList;

import Egresados2021.Filtros.Filtro;

public class Contingente extends ElementoEgresado {

	private ArrayList<ElementoEgresado> elementos;

	public Contingente(String nombre, String destino, LocalDate fechaP, LocalDate fechaR) {
		super(nombre, destino, fechaP, fechaR);
		this.elementos = new ArrayList<>();
	}

	public void addElemento(ElementoEgresado elem) {
		if(!elementos.contains(elem) && (elem.getDestino().equals(this.getDestino()) && (elem.getFechaPartida().equals(this.getFechaPartida())))) {
			elementos.add(elem);
		}
	}
	
	public void addElemento(ElementoEgresado elem, Filtro filtro) {
		if(!elementos.contains(elem) && (filtro.cumple(elem))) {
			elementos.add(elem);
		}
	}

	@Override
	public double getPrecio() {
		double precio = 0.0;
		for(ElementoEgresado e: elementos) {
			precio += e.getPrecio();
		}
		return precio;
	}

	@Override
	public double getDeuda() {
		double deuda = 0.0;
		for(ElementoEgresado e: elementos) {
			deuda += e.getDeuda();
		}
		return deuda;
	}

	@Override
	public int getTotalAlumnos() {
		int alumnos = 0;
		for(ElementoEgresado e: elementos) {
			alumnos += e.getTotalAlumnos();
		}
		return alumnos;
	}

	@Override
	public Alumno getAlumnoMayorDeuda() {
		Alumno alumno = null;
		double deuda = 0.0;
		for(ElementoEgresado e: elementos) {
			if(e.getAlumnoMayorDeuda().getDeuda() > deuda) {
				alumno = e.getAlumnoMayorDeuda();	
				deuda = e.getAlumnoMayorDeuda().getDeuda();
			}
		}
		return alumno;
	}

	@Override
	public ElementoEgresado getCopia() {
		Contingente copia = new Contingente(this.getNombre(),
											this.getDestino(),
											this.getFechaPartida(),
											this.getFechaRegreso()
											);
		for(ElementoEgresado e: elementos) {
			copia.addElemento(e.getCopia());
		}
		return copia;
	}

	@Override
	public ArrayList<ElementoEgresado> buscar(Filtro filtro) {
		ArrayList<ElementoEgresado> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		for(ElementoEgresado e: elementos) {
			resultado.addAll(e.buscar(filtro));
		}
		return resultado;
	}
	
	public ArrayList<ElementoEgresado> getElementos(){
		return new ArrayList<>(elementos);
	}
	
	
}