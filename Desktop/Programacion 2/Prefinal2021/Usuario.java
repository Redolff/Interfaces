package Prefinal2021;

import java.time.LocalDate;

public class Usuario {
	
	private String nombre;
	private LocalDate a�o_registro;
	private String email;
	
	public Usuario(String nombre, LocalDate a�o, String email) {
		this.nombre = nombre;
		this.a�o_registro = a�o;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getA�o_registro() {
		return a�o_registro;
	}

	public String getEmail() {
		return email;
	}
	
	

}
