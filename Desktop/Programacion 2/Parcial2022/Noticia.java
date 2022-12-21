package Parcial2022;

import java.util.ArrayList;

import Parcial2022.Filtros.Filtro;

public class Noticia extends ElementoPortal{
	
	private String contenido;
	private String titulo;
	private String autor;
	private String categoria;
	private ArrayList<String> palabrasClaves;
	private ArrayList<Clasificador> clasificadores;
	
	public Noticia(String contenido, String titulo, String autor, String categoria) {
		this.contenido = contenido;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.palabrasClaves = new ArrayList<>();
		this.clasificadores = new ArrayList<>();
	}

	@Override
	public String getCategoria() {
		return categoria;
	}

	@Override
	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<>(palabrasClaves);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public boolean contieneTitulo(String title) {
		return this.getTitulo().contains(title);
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public boolean tieneContenido(String contenid) {
		return this.getContenido().contains(contenid);
	}
	
	public String getAutor() {
		return autor;
	}

	@Override
	public ArrayList<Noticia> buscar(Filtro filtro) {
		ArrayList<Noticia> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	public void addPalabraClave(String palabra) {
		palabrasClaves.add(palabra);
	}
	
	public void clasificarNoticia(Noticia nn) {
		for(Clasificador c: clasificadores) {
			c.clasificar(nn);
		}
	}
	
}
