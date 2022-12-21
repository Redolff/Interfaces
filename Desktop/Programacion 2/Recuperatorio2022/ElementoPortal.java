package Recuperatorio2022;

import java.util.ArrayList;

import Recuperatorio2022.Filtro.Filtro;

public abstract class ElementoPortal implements Comparable<ElementoPortal>{

	private String categoria;
	private ArrayList<Suscriptor> suscriptores;
	
	public ElementoPortal(String categoria) {
		this.categoria = categoria;
		this.suscriptores = new ArrayList<>();
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public ArrayList<Suscriptor> getSuscriptores(){
		return new ArrayList<>(suscriptores);
	}
	
	public void entregarNoticia(Noticia n, Filtro filtro) {
		for(Suscriptor s: suscriptores) {
			s.addNoticia(n, filtro);
		}
	}
	
	@Override
	public int compareTo(ElementoPortal o) {
		return this.getCategoria().compareTo(o.getCategoria());
	}
	
	public abstract ArrayList<String> getPalabrasClaves();
	public abstract ElementoPortal getCopia(Filtro filtro);
	
}