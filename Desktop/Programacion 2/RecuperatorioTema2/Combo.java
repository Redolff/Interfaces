package RecuperatorioTema2;

import java.util.ArrayList;

import RecuperatorioTema2.Filtros.Filtro;

public class Combo extends ElementoBazar {

	private ArrayList<ElementoBazar> elementos;
	private double descuento;
	private double descuentoTope;
	
	public Combo(double descuento, double tope) {
		this.elementos = new ArrayList<>();
		this.descuento = descuento;
		this.descuentoTope = tope;
	}
	
	public double getPrecio() {
		double precio = 0.0;
		for(ElementoBazar e: elementos) {
			precio += e.getPrecio();
		}
		double total = precio - descuento;
		if(descuento < descuentoTope) {
			return total;
		}else {
			return precio - descuentoTope;
		}
	}
	
	public double getPeso() {
		double peso = 0.0;
		for(ElementoBazar e: elementos) {
			peso += e.getPeso();
		}
		return peso;
	}
	
	public ArrayList<String> getCategorias(){
		ArrayList<String> resultado = new ArrayList<>();
		for(ElementoBazar e: elementos) {
			ArrayList<String> aux = e.getCategorias();
			for(int i = 0; i < aux.size(); i++) {
				if(!aux.contains(aux.get(i))) {
					resultado.add(aux.get(i));
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
	
	public int getCantidadProductos() {
		int cant = 0;
		for(ElementoBazar e: elementos) {
			cant += e.getCantidadProductos();
		}
		return cant;
	}
	
	public Producto getProductoMenorPeso() {
		Producto producto = null;
		double peso = 10000.00;
		for(ElementoBazar e: elementos) {
			if(e.getProductoMenorPeso().getPeso() < peso) {
				peso = e.getProductoMenorPeso().getPeso();
				producto = e.getProductoMenorPeso();
			}
		}
		return producto;
	}
	
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
	
	public ElementoBazar getCopiaRestringida(Filtro filtro) {
		if(filtro.cumple(this)) {
			ArrayList<ElementoBazar> aux = new ArrayList<>();
			for(ElementoBazar e: elementos) {
				ElementoBazar copia = e.getCopiaRestringida(filtro);
				if(copia != null) {
					aux.add(copia);
				}
			}
			if(aux.isEmpty()) {
				return null;
			}
			else {
				Combo copiaCombo = new Combo(this.descuento, this.descuentoTope);
				for(ElementoBazar e: elementos) {
					copiaCombo.addElemento(e, filtro);
				}
				return copiaCombo;
			}
		}
		else {
			return null;
		}
	}
	
	public ArrayList<ElementoBazar> getElementos(){
		return new ArrayList<>(elementos);
	}
	
}