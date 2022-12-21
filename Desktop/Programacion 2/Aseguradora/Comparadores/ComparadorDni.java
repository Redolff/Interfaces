package Aseguradora.Comparadores;

import java.util.Comparator;

import Aseguradora.SeguroGeneral;

public class ComparadorDni implements Comparator<SeguroGeneral>{

	@Override
	public int compare(SeguroGeneral o1, SeguroGeneral o2) {
		return (int) (o1.getDni() - o2.getDni());
	}

}
