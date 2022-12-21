package Parcial2022Repetido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SeccionEspecial extends Seccion {
	
	private String categoria;
	private int cant_palabras;

	public SeccionEspecial(int pos, String undefined, String categoria, int palabras) {
		super(pos, undefined);
		this.categoria = categoria;
		this.cant_palabras = palabras;
	}
	
	@Override
	public String getCategoria() {
		return categoria;
	}
	
	@Override
	public ArrayList<String> getPalabrasClaves(){		
		ArrayList<String> aux = super.getPalabrasClaves();
		Collections.sort(aux);
		ArrayList<String> resultado = new ArrayList<>();
		for(int i = 0; (i < aux.size() && i < cant_palabras); i++) {
			resultado.add(aux.get(i));
		}
		return resultado;
	}

}
