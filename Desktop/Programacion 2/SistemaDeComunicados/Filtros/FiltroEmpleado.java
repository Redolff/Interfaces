package SistemaDeComunicados.Filtros;

import SistemaDeComunicados.Empleado;
import SistemaDeComunicados.Notificacion;

public class FiltroEmpleado extends Filtro {
	
	public Empleado empleado;
	
	public FiltroEmpleado(Empleado e) {
		this.empleado = e;
	}

	@Override
	public boolean cumple(Notificacion n) {
		return n.getApuntado().equals(this.empleado);
	}

}
