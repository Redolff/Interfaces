package Recuperatorio2022;

import java.util.ArrayList;

public class SeccionEspecial extends Seccion {
	
	private ArrayList<String> categoriasAdmisibles;

	public SeccionEspecial(String cat) {
		super(cat);
		this.categoriasAdmisibles = new ArrayList<>();
	}
	
	@Override
	public void addElemento(ElementoPortal e) {
		if(categoriasAdmisibles.contains(this.getCategoria())) {
			super.addElemento(e);
		}
	}
	
	public ArrayList<String> getCategoriasAdmisibles(){
		return new ArrayList<>(categoriasAdmisibles);
	}
	
	public void addCategoria(String cat) {
		if(!categoriasAdmisibles.contains(cat)) {
			categoriasAdmisibles.add(cat);
		}
	}
	
	@Override
	public Seccion obtenerCopia() {
		SeccionEspecial copia = new SeccionEspecial(this.getCategoria());
		for(String categoria: copia.getCategoriasAdmisibles()) {
			copia.addCategoria(categoria);
		}
		return copia;
	}

}
