package Aseguradora;

import java.util.ArrayList;
import java.util.Comparator;

import Aseguradora.Filtros.Filtro;

public class SeguroSimple extends SeguroGeneral{
	
	private int nroPoliza;
	private String descripcion;
	private double monto;

	public SeguroSimple(long dni, int poliza, String descrip, double monto) {
		super(dni);
		this.nroPoliza = poliza;
		this.descripcion = descrip;
		this.monto = monto;
	}

	@Override
	public int getNumeroPoliza() {
		return nroPoliza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public double getMonto() {
		return monto;
	}
	
	public boolean contieneDescripcion(String descrip) {
		return this.getDescripcion().contains(descrip);
	}

	@Override
	public ArrayList<SeguroGeneral> buscar(Filtro filtro, Comparator<SeguroGeneral> orden) {
		ArrayList<SeguroGeneral> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}

}
