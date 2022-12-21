package RecuperatorioTema2;

import java.util.ArrayList;

import RecuperatorioTema2.Filtros.Filtro;

public class Producto extends ElementoBazar {

	private ArrayList<String> categorias;
	private double peso;
	private double precio;
	
	public Producto(double peso, double precio) {
		this.categorias	= new ArrayList<>();
		this.peso = peso;
		this.precio = precio;
	}
	
	public ArrayList<String> getCategorias(){
		return new ArrayList<>(categorias);
	}
	
	public void addCategoria(String c) {
		if(!categorias.contains(c)) {
			categorias.add(c);
		}
	}

	public double getPeso() {
		return peso;
	}

	public double getPrecio() {
		return precio;
	}
	
	public int getCantidadProductos() {
		return 1;
	}
	
	public Producto getProductoMenorPeso() {
		return this;
	}
	
	public ArrayList<ElementoBazar> buscar(Filtro filtro){
		ArrayList<ElementoBazar> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	public ElementoBazar getCopiaRestringida(Filtro filtro) {
		if(filtro.cumple(this)) {
			Producto copia = new Producto(this.peso, this.precio);
			for(String c: categorias) {
				copia.addCategoria(c);
			}
			return copia;
		}
		else {
			return null;
		}
	}
	
}