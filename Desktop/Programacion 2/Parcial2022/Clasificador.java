package Parcial2022;

import java.util.ArrayList;

import Parcial2022.Filtros.Filtro;

public class Clasificador {
	
	private ArrayList<String> palabrasClaves;
	private Filtro filtro;
	
	public Clasificador(Filtro filtro) {
		this.palabrasClaves = new ArrayList<>();
		this.filtro = filtro;
	}
	
	public void clasificar(Noticia n) {
		if(filtro.cumple(n)) {
			for(int i = 0; i < palabrasClaves.size(); i++) {
				n.addPalabraClave(palabrasClaves.get(i));
			}
		}
	}

}
