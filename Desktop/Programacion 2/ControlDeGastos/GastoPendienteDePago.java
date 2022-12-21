package ControlDeGastos;

import java.time.LocalDate;
import java.util.ArrayList;

import ControlDeGastos.Filtros.Filtro;

public class GastoPendienteDePago extends ElementoGasto {
	
	private ElementoGasto apuntado;
	private int porcentaje;
	private int diasPerdientes;
	private boolean pago;

	public GastoPendienteDePago(String nombre, LocalDate fecha, String descrip, ElementoGasto apuntado, int porc, int dias) {
		super(nombre, fecha, descrip);
		this.apuntado = apuntado;
		this.porcentaje = porc;
		this.diasPerdientes = dias;
		this.pago = false;
	}
	
	public boolean Ispago() {
		pago = true;
		return pago;
	}
	
	public ElementoGasto getApuntado() {
		return apuntado;
	}

	@Override
	public double getMonto(Filtro filtro) {
		return 0;
	}

	@Override
	public ArrayList<String> getCaracteristicas() {
		return null;
	}

	@Override
	public ArrayList<ElementoGasto> buscar(Filtro filtro) {
		return null;
	}

	@Override
	public double getMonto() {
		double monto = apuntado.getMonto();
		monto = monto+(this.porcentaje*this.diasPerdientes);
		if(Ispago()) {
			return apuntado.getMonto();
		}
		return monto;
	}

}
