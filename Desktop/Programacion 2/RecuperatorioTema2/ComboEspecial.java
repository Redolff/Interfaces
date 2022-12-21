package RecuperatorioTema2;

public class ComboEspecial extends Combo {

	public ComboEspecial(double descuento, double tope) {
		super(descuento, tope);
	}
	
	public double getPrecio() {
		double precio = 0.0;
		for(ElementoBazar e: super.getElementos()) {
			precio += e.getPrecio();
		}
		return precio - super.getProductoMenorPeso().getPrecio();
	}

}
