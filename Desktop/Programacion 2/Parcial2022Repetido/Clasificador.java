package Parcial2022Repetido;

import java.util.ArrayList;

import Parcial2022Repetido.Filtro.Filtro;

public class Clasificador {

	private ArrayList<String> palabrasClaves;
	private Filtro filtro;
	
	public Clasificador(Filtro f1) {
		this.palabrasClaves = new ArrayList<>();
		this.filtro	= f1;
	}
	
	public void clasificar(Noticia noticia) {
		if(filtro.cumple(noticia)) {
			for(int i = 0; i < palabrasClaves.size(); i++) {
				noticia.addPalabraClave(palabrasClaves.get(i));
			}
		}
	}
	
}