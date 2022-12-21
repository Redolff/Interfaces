package Aseguradora.Comparadores;

import java.util.Comparator;

import Aseguradora.SeguroGeneral;

public class ComparadorNumeroPoliza implements Comparator<SeguroGeneral>{

	@Override
	public int compare(SeguroGeneral s1, SeguroGeneral s2) {
		return s1.getNumeroPoliza() - s2.getNumeroPoliza();
	}
	
}
