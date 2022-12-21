package Aseguradora.Comparadores;

import java.util.Comparator;

import Aseguradora.SeguroGeneral;

public class ComparadorCombo implements Comparator<SeguroGeneral>{
	
	private Comparator<SeguroGeneral> c1;
	private Comparator<SeguroGeneral> c2;
	
	public ComparadorCombo(Comparator<SeguroGeneral> c1, Comparator<SeguroGeneral> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public int compare(SeguroGeneral s1, SeguroGeneral s2) {
		int resultado = c1.compare(s1, s2);
		if(resultado == 0) {
			return c2.compare(s1, s2);
		}
		return resultado;
	}

}
