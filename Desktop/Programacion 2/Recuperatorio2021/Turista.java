package Recuperatorio2021;

public class Turista{

	private String nombre;
	private String edad;
	private String ciudadOrigen;
	
	public Turista(String nombre, String edad, String origen) {
		this.nombre = nombre;
		this.edad = edad;
		this.ciudadOrigen = origen;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEdad() {
		return edad;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}
	
}
