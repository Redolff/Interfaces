package SistemaDeComunicados;

import java.time.LocalDate;
import java.util.ArrayList;

public class Notificacion {

	private ArrayList<String> palabras;
	private LocalDate fechaEnviado;
	private Empleado apuntado;
	
	public Notificacion(LocalDate fechaE, Empleado apuntado) {
		this.palabras = new ArrayList<>();
		this.fechaEnviado = fechaE;
		this.apuntado = apuntado;
	}
	
	public void addPalabra(String p) {
		palabras.add(p);
	}
	
	public ArrayList<String> getPalabras(){
		return new ArrayList<>(palabras);
	}
	
	public LocalDate getFechaEnviado() {
		return fechaEnviado;
	}
	
	public Empleado getApuntado() {
		return apuntado;
	}
	
	public int getCantidadPalabras() {
		return palabras.size();
	}
	
	public boolean contienePalabra(String p) {
		return palabras.contains(p);
	}
		
}