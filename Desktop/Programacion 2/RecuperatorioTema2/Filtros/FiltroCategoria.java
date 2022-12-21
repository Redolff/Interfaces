package RecuperatorioTema2.Filtros;

import RecuperatorioTema2.ElementoBazar;

public class FiltroCategoria extends Filtro{
	
	private String categoria;
	
	public FiltroCategoria(String cat) {
		this.categoria = cat;
	}

	@Override
	public boolean cumple(ElementoBazar elemento) {
		return elemento.contieneCategoria(this.categoria);
	}
	
	

}
