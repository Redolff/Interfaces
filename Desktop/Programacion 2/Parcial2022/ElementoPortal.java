package Parcial2022;

import java.util.ArrayList;

import Parcial2022.Filtros.Filtro;

public abstract class ElementoPortal {

	public abstract String getCategoria();
	public abstract ArrayList<String> getPalabrasClaves();
	public abstract ArrayList<Noticia> buscar(Filtro filtro);
}