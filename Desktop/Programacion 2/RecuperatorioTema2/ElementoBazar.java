package RecuperatorioTema2;

import java.util.ArrayList;

import RecuperatorioTema2.Filtros.Filtro;

public abstract class ElementoBazar {
	
	public abstract double getPrecio();
	public abstract double getPeso();
	public abstract ArrayList<String> getCategorias();
	
	public boolean contieneCategoria(String cat) {
		return getCategorias().contains(cat);
	}
	
	public abstract int getCantidadProductos();
	public abstract Producto getProductoMenorPeso();
	public abstract ArrayList<ElementoBazar> buscar(Filtro filtro);
	public abstract ElementoBazar getCopiaRestringida(Filtro filtro);

}
