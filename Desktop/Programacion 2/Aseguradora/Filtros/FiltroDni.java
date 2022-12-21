package Aseguradora.Filtros;

import Aseguradora.SeguroGeneral;

public class FiltroDni extends Filtro {
	
	private long Dni;
	
	public FiltroDni(long dni) {
		this.Dni = dni;
	}

	@Override
	public boolean cumple(SeguroGeneral seguro) {
		return seguro.getDni() == Dni;
	}

}
