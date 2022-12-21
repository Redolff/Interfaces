package Parcial2022Repetido;

import java.util.ArrayList;

import Parcial2022Repetido.Filtro.Filtro;

public abstract class ElementoNoticia {
	
	
	
	public abstract String getCategoria();
	public abstract ArrayList<String> getPalabrasClaves();
	public abstract ArrayList<Noticia> buscar(Filtro filtro);
	
	
	

}
