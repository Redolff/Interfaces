package Prefinal2021.Comparadores;

import java.util.Comparator;

import Prefinal2021.Video;

public class ComparadorEmailUsuario implements Comparator<Video>{
	
	@Override
	public int compare(Video v1, Video v2) {
		return v1.getEmailUser().compareTo(v2.getEmailUser());
	}

}
