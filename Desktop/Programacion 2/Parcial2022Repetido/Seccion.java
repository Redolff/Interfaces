package Parcial2022Repetido;

import java.util.ArrayList;

import Parcial2022Repetido.Filtro.Filtro;

public class Seccion extends ElementoNoticia {

	private ArrayList<ElementoNoticia> elementos;
	private int pos;
	private String defecto;
	
	public Seccion(int pos, String undefined) {
		this.elementos = new ArrayList<>();
		this.pos = pos;
		this.defecto = undefined;
	}

	@Override
	public String getCategoria() {
		String categoria;
		if(this.pos < this.elementos.size()) {
			categoria = elementos.get(pos).getCategoria();
			return categoria;
		}
		else {
			return defecto;
		}
	}
	
	@Override
	public ArrayList<String> getPalabrasClaves(){
		ArrayList<String> resultado = new ArrayList<>();
		for(ElementoNoticia e: elementos) {
			ArrayList<String> aux = e.getPalabrasClaves();
			for(int i = 0; i < aux.size(); i++) {
				if(!aux.contains(aux.get(i))) {
					resultado.add(aux.get(i));
				}
			}
		}
		return resultado;
	}
	
	@Override
	public ArrayList<Noticia> buscar(Filtro filtro){
		ArrayList<Noticia> resultado = new ArrayList<>();
		for(ElementoNoticia e: elementos) {
			resultado.addAll(e.buscar(filtro));
		}
		return resultado;
	}
	
}