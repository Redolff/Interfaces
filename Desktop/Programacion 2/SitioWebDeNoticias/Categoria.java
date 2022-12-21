package SitioWebDeNoticias;

import java.util.ArrayList;

import SitioWebDeNoticias.Filtros.Filtro;

public class Categoria extends ElementoNoticia{

	private ArrayList<ElementoNoticia> elementos;
	private String descripcion;
	private String urlImg;
	
	public Categoria(String nombre, String descrip, String img) {
		super(nombre);
		this.elementos = new ArrayList<>();
		this.descripcion = descrip;
		this.urlImg = img;
	}
	
	public void addElementoNoticia(ElementoNoticia en) {
		if(en != null) {
			elementos.add(en);
		}
	}

	public ArrayList<ElementoNoticia> getElementos() {
		return new ArrayList<>(elementos);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getUrlImg() {
		return urlImg;
	}

	@Override
	public int getCantidadNoticias() {
		int cant = 0;
		for(ElementoNoticia e: elementos) {
			cant += e.getCantidadNoticias();
		}
		return cant;
	}
	
	@Override
	public ArrayList<ElementoNoticia> buscar(Filtro filtro){
		ArrayList<ElementoNoticia> resultado = new ArrayList<>();
		for(ElementoNoticia n: elementos) {
			resultado.addAll(n.buscar(filtro));
		}
		return resultado;
	}
	
	@Override
	public ArrayList<String> mapaSitio(){
		ArrayList<String> mapa = new ArrayList<>();
		mapa.add(this.getNombre()+ "\\");
		for(ElementoNoticia n: elementos) {
			ArrayList<String> elemHijo = n.mapaSitio();
			for(String s: elemHijo) {
				mapa.add(this.getNombre() + "\\" + s);
			}
		}
		return mapa;
	}
	
}