package Egresados2021;

import java.time.LocalDate;

public class ContingenteJubilado extends Contingente {
	
	public ContingenteJubilado(String nombre, String destino, LocalDate fechaP, LocalDate fechaR) {
		super(nombre, destino, fechaP, fechaR);
	}
	
	public double getPrecio() {
		double precio = super.getPrecio();
		return precio/super.getElementos().size();
	}

}
