package model.mucks;

import model.data.ColorBola;
import model.data.Sorteo;

public class SorteoOM {
	
	public static Sorteo setValues(Integer rojo, Integer azul){
		Sorteo sorteo = new Sorteo();
		sorteo.setSorteo(rojo, azul);
		return sorteo;
	}
}
