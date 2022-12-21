package Prefinal2021;

import java.time.LocalDate;

public class Usuario {
	
	private String nombre;
	private LocalDate año_registro;
	private String email;
	
	public Usuario(String nombre, LocalDate año, String email) {
		this.nombre = nombre;
		this.año_registro = año;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getAño_registro() {
		return año_registro;
	}

	public String getEmail() {
		return email;
	}
	
	

}
