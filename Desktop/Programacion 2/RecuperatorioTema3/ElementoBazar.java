package RecuperatorioTema3;

import java.util.ArrayList;

import RecuperatorioTema3.Filtros.Filtro;

public abstract class ElementoBazar {

	public abstract double getPrecio();
	public abstract double getPeso();
	public abstract ArrayList<String> getCategorias();
	
	public boolean contieneCategoria(String c) {
		return getCategorias().contains(c);
	}
	
	public abstract int getTotalProductos();
	public abstract Producto getProductoMenorPeso();
	public abstract ArrayList<ElementoBazar> buscar(Filtro filtro);
	public abstract ElementoBazar getCopia(Filtro filtro);
	
}