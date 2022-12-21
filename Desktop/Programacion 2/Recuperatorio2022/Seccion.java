package Recuperatorio2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Recuperatorio2022.Filtro.Filtro;

public class Seccion extends ElementoPortal {
	
	private ArrayList<ElementoPortal> elementos;
	
	public Seccion(String cat) {
		super(cat);
		this.elementos = new ArrayList<>();
	}
	
	@Override
	public ArrayList<String> getPalabrasClaves(){
		ArrayList<String> resultado = new ArrayList<>();
		for(ElementoPortal e: elementos) {
			ArrayList<String> aux = e.getPalabrasClaves();
			for(int i = 0; i < aux.size(); i++) {
				if(!aux.contains(aux.get(i))) {
					resultado.add(aux.get(i));
				}
			}
		}
		return resultado;
	}
	
	public void addElemento(ElementoPortal e) {
		if(!elementos.contains(e)) {
			elementos.add(e);
		}
		Collections.sort(elementos);
	}
	
	public ArrayList<ElementoPortal> getElementos(){
		return new ArrayList<>(elementos);
	}

	@Override
	public ElementoPortal getCopia(Filtro filtro) { //ES ASI.
		ArrayList<ElementoPortal> aux = new ArrayList<>();
		for(ElementoPortal e: elementos) {
			ElementoPortal copia = e.getCopia(filtro);
			if(copia != null) {
				aux.add(copia);
			}
		}
		if(aux.isEmpty()) {
			return null;
		}
		else {
			Seccion copiaSeccion = new Seccion(this.getCategoria());
			for(ElementoPortal e: elementos) {
				copiaSeccion.addElemento(e);
			}
			return copiaSeccion;
		}
	}
	
	public Seccion obtenerCopia() {
		return new Seccion(this.getCategoria());
	}

}
