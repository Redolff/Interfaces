package RecuperatorioTema3;

public class ComboEspecial extends Combo {

	public ComboEspecial(double porc, double porcMAX) {
		super(porc, porcMAX);
	}
	
	@Override
	public double getPrecio() {
		double precio = 0;
		for(ElementoBazar e: super.getElementos()) {
			precio += e.getPrecio();
		}
		return (precio - super.getProductoMenorPeso().getPrecio());
	}

}
