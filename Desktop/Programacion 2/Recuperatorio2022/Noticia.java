package Recuperatorio2022;

import java.util.ArrayList;

import Recuperatorio2022.Filtro.Filtro;

public class Noticia extends ElementoPortal {
	
	private String contenido;
	private String titulo;
	private String autor;
	private ArrayList<String> palabras;
	
	public Noticia(String cat, String cont, String tit, String autor) {
		super(cat);
		this.contenido = cont;
		this.titulo = tit;
		this.autor = autor;
		this.palabras = new ArrayList<>();
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public boolean tieneContenido(String frase) {
		return contenido.contains(frase);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public boolean tieneTitulo(String title) {
		return titulo.contains(title);
	}
	
	public String getAutor() {
		return autor;
	}
	
	public ArrayList<String> getPalabrasClaves(){
		return new ArrayList<>(palabras);
	}
	
	public boolean contienePalabrasClaves(String palabra) {
		return palabras.contains(palabra);
	}
	
	public void addPalabra(String p) {
		if(!palabras.contains(p)) {
			palabras.add(p);
		}
	}

	@Override
	public ElementoPortal getCopia(Filtro filtro) {
		if(filtro.cumple(this)) {
			Noticia copia = new Noticia(this.getCategoria(), this.contenido, this.titulo, this.autor);
			for(String p: palabras) {
				copia.addPalabra(p);
			}
			return copia;
		}
		else {
			return null;
		}
	}

}
