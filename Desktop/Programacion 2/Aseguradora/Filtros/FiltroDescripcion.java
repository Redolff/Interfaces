package Aseguradora.Filtros;

import Aseguradora.SeguroGeneral;

public class FiltroDescripcion extends Filtro{
	
	private String descripcion;
	
	public FiltroDescripcion(String descrip) {
		this.descripcion = descrip;
	}

	@Override
	public boolean cumple(SeguroGeneral seguro) {
		return seguro.getDescripcion().equals(descripcion);
	}

}
