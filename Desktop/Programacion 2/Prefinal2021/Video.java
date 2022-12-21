package Prefinal2021;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Prefinal2021.Filtros.Filtro;

public class Video extends ElementoVideo {
	
	private Usuario usuario;
	private Duration duracion;
	private String autor;
	private int cant_visual;
	private int cant_mg;
	private int cant_no_mg;
	private LocalDate año_publi;
	private ArrayList<String> palabras;
	
	public Video(String titulo, Usuario user, String autor, Duration dura, int visualizacion, int mg, int nomg, LocalDate año) {
		super(titulo);
		this.usuario = user;
		this.autor = autor;
		this.duracion = dura;
		this.cant_visual = visualizacion;
		this.cant_mg = mg;
		this.cant_no_mg = nomg;
		this.año_publi = año;
		this.palabras = new ArrayList<>();
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public String getNombreUser() {
		return usuario.getNombre();
	}
	
	public String getEmailUser() {
		return usuario.getEmail();
	}

	public Duration getDuracion() {
		return duracion;
	}
	
	public String getAutor() {
		return autor;
	}

	public int getCant_visual() {
		return cant_visual;
	}

	public int getCant_mg() {
		return cant_mg;
	}

	public int getCant_no_mg() {
		return cant_no_mg;
	}

	public LocalDate getAño_publi() {
		return año_publi;
	}
	
	public boolean contienePalabra(String p) {
		return palabras.contains(p);
	}

	@Override
	public ArrayList<Video> buscar(Filtro filtro, Comparator<Video> comp) {
		ArrayList<Video> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	@Override
	public ArrayList<String> getPalabrasClaves(){
		return new ArrayList<>(palabras);
	}

	@Override
	public int getCantidadVideos() {
		return 1;
	}
	
}
