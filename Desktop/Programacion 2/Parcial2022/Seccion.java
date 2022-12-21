package Parcial2022;

import java.util.ArrayList;

import Parcial2022.Filtros.Filtro;

public class Seccion extends ElementoPortal {

	private String defecto;
	private ArrayList<ElementoPortal> elementos;
	private int posicion;
	
	public Seccion(String defecto, int pos) {
		this.defecto = defecto;
		this.elementos = new ArrayList<>();
		this.posicion = pos;
	}
	
	@Override
	public String getCategoria() {
		if(this.posicion < elementos.size()) {
			return elementos.get(posicion).getCategoria();
		}
		else {
			return defecto;			
		}
	}
	
	@Override
	public ArrayList<String> getPalabrasClaves(){
		ArrayList<String> resultado = new ArrayList<>();
		for(ElementoPortal e: elementos) {
			resultado.addAll(e.getPalabrasClaves());
			ArrayList<String> elemHijo = e.getPalabrasClaves();
			for(int i = 0; i < elemHijo.size(); i++) {
				if(!elemHijo.contains(elemHijo.get(i))) {
					resultado.add(elemHijo.get(i));
				}
			}
		}
		return resultado;
	}

	@Override
	public ArrayList<Noticia> buscar(Filtro filtro) {
		ArrayList<Noticia> resultado = new ArrayList<>();
		for(ElementoPortal e: elementos) {
			resultado.addAll(e.buscar(filtro));
		}
		return resultado;
	}
	
}