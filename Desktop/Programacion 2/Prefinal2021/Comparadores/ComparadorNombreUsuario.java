package Prefinal2021.Comparadores;

import java.util.Comparator;

import Prefinal2021.Video;

public class ComparadorNombreUsuario implements Comparator<Video>{

	@Override
	public int compare(Video o1, Video o2) {
		return o1.getNombreUser().compareTo(o2.getNombreUser());
	}
	
	

}
