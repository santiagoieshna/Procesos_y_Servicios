package model.mucks;

import java.util.Set;

import model.data.Apuesta;
import model.data.Bola;
import model.data.ColorBola;

public class ApuestaOM {
	
	
	public static Apuesta getSample1(Integer valueAzul) {
		Set<Bola> bolasRoja =  BolaOM.getSetRojas1();
		Bola azul = new Bola(valueAzul , ColorBola.AZUL);
		return new Apuesta(bolasRoja, azul);
	}
	
	public static Apuesta getSample2() {
		Set<Bola> bolasRoja =  BolaOM.getSetRojas2();
		Bola azul = BolaOM.getBola1(ColorBola.AZUL);
		return new Apuesta(bolasRoja, azul);
	}
}
