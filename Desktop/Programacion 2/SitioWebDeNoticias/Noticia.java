package SitioWebDeNoticias;

import java.util.ArrayList;

import SitioWebDeNoticias.Filtros.Filtro;

public class Noticia extends ElementoNoticia{

	private String titulo;
	private ArrayList<String> palabrasClaves;
	private String introduccion;
	private String texto;
	private String autor;
	private String link;
	
	public Noticia(String nombre, String titulo, String intro, String texto, String autor, String link) {
		super(nombre);
		this.titulo = titulo;
		this.palabrasClaves = new ArrayList<>();
		this.introduccion = intro;
		this.texto = texto;
		this.autor = autor;
		this.link = link;
	}

	public String getTitulo() {
		return titulo;
	}

	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<>(palabrasClaves);
	}
	
	public void addPalabraClave(String p) {
		if(p != null && !palabrasClaves.contains(p)) {
			palabrasClaves.add(p);
		}
	}
	
	public boolean tienePalabraClave(String clave) {
		return palabrasClaves.contains(clave);
	}

	public String getIntroduccion() {
		return introduccion;
	}

	public String getTexto() {
		return texto;
	}
	
	public int getLargoTexto() {
		return texto.length();
	}

	public String getAutor() {
		return autor;
	}

	public String getLink() {
		return link;
	}
	
	@Override
	public int getCantidadNoticias() {
		return 1;
	}

	@Override
	public String toString() {
		return this.getLink();
	}

	@Override
	public ArrayList<ElementoNoticia> buscar(Filtro filtro) {
		ArrayList<ElementoNoticia> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	@Override
	public ArrayList<String> mapaSitio(){
		ArrayList<String> mapa = new ArrayList<>();
		if(this.getLink() != null) {
			mapa.add(this.getLink());
		}
		return mapa;
	}
	
}