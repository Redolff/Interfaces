package RecuperatorioTema3;

import java.util.ArrayList;

import RecuperatorioTema3.Filtros.Filtro;

public class Combo extends ElementoBazar{

	private ArrayList<ElementoBazar> elementos;
	private double porcXprod;
	private double porcMAX;
	
	public Combo(double porc, double porcMAX) {
		this.elementos = new ArrayList<>();
		this.porcXprod = porc;
		this.porcMAX = porcMAX;
	}
	
	@Override
	public double getPrecio() {
		double precio = 0;
		for(ElementoBazar e: elementos) {
			precio += e.getPrecio();
		}
		double porcentajeTotal = (porcXprod/elementos.size()); //(PORC X PROD / TAMAÑO = PORCENTAJE TOTAL)
		if(porcentajeTotal < porcMAX) {
			return (precio - porcentajeTotal); 
		}
		else {
			return (precio - porcMAX);
		}
	}
	
	public ArrayList<ElementoBazar> getElementos(){
		return new ArrayList<>(elementos);
	}
	
	@Override
	public double getPeso() {
		double peso = 0;
		for(ElementoBazar e: elementos) {
			peso += e.getPeso();
		}
		return peso;
	}
	
	@Override
	public ArrayList<String> getCategorias(){
		ArrayList<String> resultado = new ArrayList<>();
		for(ElementoBazar e: elementos) {
			ArrayList<String> cumple = e.getCategorias();
			for(int i = 0; i < cumple.size(); i++) {
				if(!cumple.contains(cumple.get(i))) {
					resultado.add(cumple.get(i));
				}
			}
		}
		return resultado;
	}
	
	public void addElemento(ElementoBazar e, Filtro filtro) {
		if(!elementos.contains(e)) {
			if(filtro.cumple(e)) {
				elementos.add(e);
			}
		}
	}
	
	@Override
	public int getTotalProductos() {
		int total = 0;
		for(ElementoBazar e: elementos) {
			total += e.getTotalProductos();
		}
		return total;
	}
	
	@Override
	public Producto getProductoMenorPeso() {
		Producto producto = null;
		double peso = 10000.00;
		for(ElementoBazar e: elementos) {
			if(peso > e.getProductoMenorPeso().getPeso()) {
				peso = e.getProductoMenorPeso().getPeso();
				producto = e.getProductoMenorPeso();
			}
		}
		return producto;
	}
	
	@Override
	public ArrayList<ElementoBazar> buscar(Filtro filtro){
		ArrayList<ElementoBazar> resultado = new ArrayList<>();
		if(filtro.cumple(this)) {
			resultado.add(this);
		}
		else {
			for(ElementoBazar e: elementos) {
				resultado.addAll(e.buscar(filtro));
			}
		}
		return resultado;
	}
	
	@Override
	public ElementoBazar getCopia(Filtro filtro) {
		if(filtro.cumple(this)) {
			ArrayList<ElementoBazar> aux = new ArrayList<>();
			for(ElementoBazar e: elementos) {
				ElementoBazar copia = e.getCopia(filtro); //Copai de los productos.
				if(copia != null) { //Si un combo es distinto de vacio en sus productos
					aux.add(copia);
				}
			}
			if(aux.isEmpty()) {
				return null;
			}
			else {
				Combo combo = new Combo(this.porcMAX, this.porcXprod);
				for(ElementoBazar e: elementos) {
					combo.addElemento(e, filtro);
				}
				return combo;
			}
		}
		else {
			return null;
		}
	}
	
}