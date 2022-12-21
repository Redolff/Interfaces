package Aseguradora;

import java.util.ArrayList;
import java.util.Comparator;

import Aseguradora.Filtros.Filtro;

public abstract class SeguroGeneral {

	private long dni;
	
	public SeguroGeneral(long dni) {
		this.dni = dni;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public abstract String getDescripcion();
	public abstract double getMonto();
	public abstract int getNumeroPoliza();
	public abstract ArrayList<SeguroGeneral> buscar(Filtro filtro, Comparator<SeguroGeneral> orden);
	
}