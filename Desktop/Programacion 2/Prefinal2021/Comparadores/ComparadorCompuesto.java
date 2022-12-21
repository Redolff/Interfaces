package Prefinal2021.Comparadores;

import java.util.Comparator;

import Prefinal2021.Video;

public class ComparadorCompuesto implements Comparator<Video>{
	
	private Comparator<Video> video1;
	private Comparator<Video> video2;
	
	public ComparadorCompuesto(Comparator<Video> v1, Comparator<Video> v2) {
		this.video1 = v1;
		this.video2 = v2;
	}
	
	@Override
	public int compare(Video v1, Video v2) {
		int resultado = video1.compare(v1, v2);
		if(resultado == 0) {
			return video2.compare(v1, v2);
		}
		return resultado;
	}

}
