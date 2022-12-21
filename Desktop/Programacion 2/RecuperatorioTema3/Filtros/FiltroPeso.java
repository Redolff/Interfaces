package RecuperatorioTema3.Filtros;

import RecuperatorioTema3.ElementoBazar;

public class FiltroPeso extends Filtro {
	
	private double peso;
	
	public FiltroPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public boolean cumple(ElementoBazar combo) {
		return combo.getPeso() > this.peso;
	}

}
