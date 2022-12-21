package Recuperatorio2022;

import java.util.ArrayList;

import Recuperatorio2022.Filtro.Filtro;

public class Suscriptor {
	
	private String nombre;
	private String apellido;
	private String email;
	private ArrayList<Noticia> noticias;
	
	public Suscriptor(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.noticias = new ArrayList<>();
	}
	
	public void addNoticia(Noticia n, Filtro filtro) {
		if(filtro.cumple(n)) {
			noticias.add(n);
		}
	}

}
