package Aseguradora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import Aseguradora.Filtros.Filtro;

public class SeguroTemporal extends SeguroGeneral {
	
	private SeguroGeneral apuntado;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;

	public SeguroTemporal(long dni, SeguroGeneral apuntado, LocalDate fInicio, LocalDate fFin) {
		super(dni);
		this.apuntado = apuntado;
		this.fechaInicio = fInicio;
		this.fechaFin = fFin;
	}
	
	@Override
	public long getDni() {
		return apuntado.getDni();
	}

	@Override
	public double getMonto() {
		LocalDate hoy = LocalDate.now();
		if(hoy.isAfter(fechaInicio) && hoy.isBefore(fechaFin)) {
			return apuntado.getMonto();
		}
		return 0.0;
	}

	@Override
	public int getNumeroPoliza() {
		return apuntado.getNumeroPoliza();
	}

	@Override
	public String getDescripcion() {
		return apuntado.getDescripcion();
	}

	@Override
	public ArrayList<SeguroGeneral> buscar(Filtro filtro, Comparator<SeguroGeneral> orden) {
		return this.apuntado.buscar(filtro, orden);
	}

}
