package Parcial2022Repetido;

import java.util.ArrayList;

import Parcial2022Repetido.Filtro.Filtro;

public class Noticia extends ElementoNoticia {

	private String contenido;
	private String titulo;
	private String autor;
	private String categoria;
	private ArrayList<String> palabrasClaves;
	private ArrayList<Clasificador> clasificadores;
	
	public Noticia(String cont, String tit, String autor, String cat) {
		this.contenido = cont;
		this.titulo = tit;
		this.autor = autor;
		this.categoria = cat;
		this.palabrasClaves = new ArrayList<>();
		this.clasificadores = new ArrayList<>();
	}
	
	@Override
	public String getCategoria() {
		return categoria;
	}
	
	@Override
	public ArrayList<String> getPalabrasClaves(){
		return new ArrayList<>(palabrasClaves);
	}

	public void addPalabraClave(String p) {
		if(!palabrasClaves.contains(p)) {
			palabrasClaves.add(p);
		}
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public boolean tieneContenido(String cont) {
		return contenido.contains(cont);
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

	@Override
	public ArrayList<Noticia> buscar(Filtro filtro) {
		ArrayList<Noticia> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	public void clasificarNoticia(Noticia noticia) {
		for(Clasificador c: clasificadores) {
			c.clasificar(noticia);
		}
		
	}
	
}