package Prefinal2021;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;

import Prefinal2021.Filtros.Filtro;

public abstract class ElementoVideo {
	
	private String titulo;
	
	public ElementoVideo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public abstract ArrayList<Video> buscar(Filtro filtro, Comparator<Video> comp);
	public abstract ArrayList<String> getPalabrasClaves();
	public abstract int getCantidadVideos();
	public abstract Duration getDuracion();

}
