package RecuperatorioTema3;

import java.util.ArrayList;

import RecuperatorioTema3.Filtros.Filtro;

public class Producto extends ElementoBazar{
	
	private ArrayList<String> categorias;
	private double peso;
	private double precio;
	
	public Producto(double peso, double precio) {
		this.categorias = new ArrayList<>();
		this.peso = peso;
		this.precio = precio;
	}
	
	@Override
	public ArrayList<String> getCategorias(){
		return new ArrayList<>(categorias);
	}
	
	public void addCategoria(String c) {
		if(!categorias.contains(c)) {
			categorias.add(c);
		}
	}
	
	@Override
	public double getPeso() {
		return peso;
	}
	
	@Override
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public int getTotalProductos() {
		return 1;
	}
	
	@Override
	public Producto getProductoMenorPeso() {
		return this;
	}
	
	@Override
	public ArrayList<ElementoBazar> buscar(Filtro filtro){
		ArrayList<ElementoBazar> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	
	@Override
	public ElementoBazar getCopia(Filtro filtro) {
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