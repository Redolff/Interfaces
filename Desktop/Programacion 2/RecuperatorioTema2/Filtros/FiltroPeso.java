package RecuperatorioTema2.Filtros;

import RecuperatorioTema2.ElementoBazar;

public class FiltroPeso extends Filtro {
	
	private double peso;
	
	public FiltroPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public boolean cumple(ElementoBazar elemento) {
		return elemento.getPeso() > this.peso;
	}

}
