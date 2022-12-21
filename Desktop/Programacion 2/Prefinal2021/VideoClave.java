package Prefinal2021;

import java.time.Duration;
import java.time.LocalDate;

public class VideoClave extends Video {

	public VideoClave(String titulo, Usuario user, String autor, Duration dura, int visualizacion, int mg, int nomg, LocalDate a�o) {
		super(titulo, user, autor, dura, visualizacion, mg, nomg, a�o);
	}
	
	@Override
	public boolean contienePalabra(String p) {
		return true;
	}

}
