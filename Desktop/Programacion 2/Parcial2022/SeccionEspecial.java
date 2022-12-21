package Parcial2022;

import java.util.ArrayList;
import java.util.Collections;

public class SeccionEspecial extends Seccion {
	
	private int cantPalabras;
	private String categoriaFija;
	
	public SeccionEspecial(String defecto, int pos, int cantPalabras, String categoria) {
		super(defecto, pos);
		this.cantPalabras = cantPalabras;
		this.categoriaFija = categoria;
	}
	
	@Override
	public String getCategoria() {
		return categoriaFija;
	}
	
	@Override
	public ArrayList<String> getPalabrasClaves() {
		ArrayList<String> aux = super.getPalabrasClaves();
		Collections.sort(aux);
		ArrayList<String> resultado = new ArrayList<>();
		for(int i = 0; (i < aux.size() && i < cantPalabras); i++) {
			resultado.add(aux.get(i));
		}
		return resultado;
	}

}
