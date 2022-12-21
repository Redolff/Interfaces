package Prefinal2021;

import java.time.Duration;
import java.time.LocalDate;

public class VideoClave extends Video {

	public VideoClave(String titulo, Usuario user, String autor, Duration dura, int visualizacion, int mg, int nomg, LocalDate año) {
		super(titulo, user, autor, dura, visualizacion, mg, nomg, año);
	}
	
	@Override
	public boolean contienePalabra(String p) {
		return true;
	}

}
