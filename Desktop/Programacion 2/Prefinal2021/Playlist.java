package Prefinal2021;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Prefinal2021.Filtros.Filtro;

public class Playlist extends ElementoVideo {
	
	private ArrayList<ElementoVideo> elementos;
	private int segundos;

	public Playlist(String titulo, int segundos) {
		super(titulo);
		this.elementos = new ArrayList<>();
		this.segundos = segundos;
	}
	
	public ArrayList<ElementoVideo> getElementos(){
		return new ArrayList<>(elementos);
	}
	
	@Override
	public ArrayList<Video> buscar(Filtro filtro, Comparator<Video> comp){
		ArrayList<Video> resultado = new ArrayList<>();
		for(ElementoVideo e: elementos) {
			resultado.addAll(e.buscar(filtro, comp));
		}
		Collections.sort(resultado, comp);
		return resultado;
	}

	@Override
	public ArrayList<String> getPalabrasClaves() {
		ArrayList<String> resultado = new ArrayList<>();
		for(ElementoVideo e: elementos) {
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
	public int getCantidadVideos() {
		int cant = 0;
		for(ElementoVideo e: elementos) {
			cant += e.getCantidadVideos();
		}
		return cant;
	}
	
	@Override
	public Duration getDuracion() {
		Duration duracion = Duration.ofSeconds(0);
		for(ElementoVideo e: elementos) {
			//duracion += e.getDuracion(); //ES ASI.
		}
		//return duracion + segundos; //ES ASI
		return duracion;
	}

}
