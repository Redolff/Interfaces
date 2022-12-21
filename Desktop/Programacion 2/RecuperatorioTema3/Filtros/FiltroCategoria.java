package RecuperatorioTema3.Filtros;

import RecuperatorioTema3.ElementoBazar;

public class FiltroCategoria extends Filtro {
	
	private String categoria;
	
	public FiltroCategoria(String cat) {
		this.categoria = cat;
	}

	@Override
	public boolean cumple(ElementoBazar combo) {
		return combo.contieneCategoria(this.categoria);
	}

}
