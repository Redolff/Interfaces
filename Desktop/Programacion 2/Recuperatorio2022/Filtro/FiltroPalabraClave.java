package Recuperatorio2022.Filtro;

import Recuperatorio2022.Noticia;

public class FiltroPalabraClave extends Filtro {
	
	private String clave;
	
	public FiltroPalabraClave(String clave) {
		this.clave = clave;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.contienePalabrasClaves(this.clave);
	}

}
