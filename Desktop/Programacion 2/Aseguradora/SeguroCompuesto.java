package Aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Aseguradora.Filtros.Filtro;

public class SeguroCompuesto extends SeguroGeneral {

	private ArrayList<SeguroGeneral> seguros;
	
	public SeguroCompuesto(long dni) {
		super(dni);
		this.seguros = new ArrayList<>();
	}

	@Override
	public double getMonto() {
		double monto = 0;
		for(SeguroGeneral s: seguros) {
			 monto += s.getMonto();
		}
		return monto;
	}

	@Override
	public int getNumeroPoliza() {
		int numeroMayor = 0;
		for(SeguroGeneral s: seguros) {
			if(numeroMayor < s.getNumeroPoliza()) {
				numeroMayor = s.getNumeroPoliza();
			}
		}
		return numeroMayor;
		
	}

	@Override
	public String getDescripcion() {
		return null;
	}
	
	@Override
	public ArrayList<SeguroGeneral> buscar(Filtro filtro, Comparator<SeguroGeneral> orden){
		ArrayList<SeguroGeneral> resultado = new ArrayList<>();
		for(SeguroGeneral s : seguros) {
			resultado.addAll(s.buscar(filtro, orden));
		}
		Collections.sort(resultado, orden);
		return resultado;
	}
	
}
