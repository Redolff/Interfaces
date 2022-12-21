package Adicional;

import java.time.LocalDate;
import java.util.ArrayList;

import Adicional.Filtros.Filtro;

public class Contingente extends ElementoEgresado {
	
	private ArrayList<ElementoEgresado> elementos; 
	
	public Contingente(String nombre, String destino, LocalDate partida, LocalDate regreso) {
		super(nombre, destino, partida, regreso);
		this.elementos = new ArrayList<>();
	}
	
	public ArrayList<ElementoEgresado> getElementos(){
		return new ArrayList<>(elementos);
	}
	
	public void addElemento(ElementoEgresado e) {
		if(!elementos.contains(e)) {
			if(this.getDestino().equals(e.getDestino()) && (this.getFechaPartida().equals(e.getFechaPartida()))) {
				elementos.add(e);
			}
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
	
	public double getDeuda() {
		double deuda = 0.0;
		for(ElementoEgresado e: elementos) {
			deuda += e.getDeuda();
		}
		return deuda;
	}
	
	public int getCantidadAlumnos() {
		int cant = 0;
		for(ElementoEgresado e: elementos) {
			cant += e.getCantidadAlumnos();
		}
		return cant;
	}
	
	public Alumno getAlumnoMayorDeuda() {
		double deudaMayor = 0.0;
		Alumno alumno = null;
		for(ElementoEgresado e: elementos) {
			if(e.getAlumnoMayorDeuda().getDeuda() > deudaMayor) {
				alumno = e.getAlumnoMayorDeuda();
				deudaMayor = e.getAlumnoMayorDeuda().getDeuda();
			}
		}
		return alumno;
	}
	
	public ElementoEgresado getCopia() {
		Contingente copia = new Contingente(this.getNombre(), this.getDestino(), this.getFechaPartida(), this.getFechaRegreso());
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
		else {
			for(ElementoEgresado e: elementos) {
				resultado.addAll(e.buscar(filtro));
			}
		}
		return resultado;
	}
	
}
